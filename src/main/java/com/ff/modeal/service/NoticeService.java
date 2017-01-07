package com.ff.modeal.service;

import java.io.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.multipart.*;

import com.ff.modeal.repository.*;
import com.ff.modeal.vo.*;

@Service
public class NoticeService {
	private static final String SAVE_PATH = "/upload";
//	private static final String URL = "/notice/images/";
	private static final int LIST_SIZE = 5; // 한 페이지당 게시물 수
	private static final int PAGE_SIZE = 5; //페이지 리스트의 페이지 수

	@Autowired
	private NoticeDao noticeDao;
	
//	public List<NoticeVo> getMessageList() {		// 리스트 단순 출력
//		return noticeDao.getList();
//	}
	
	public Map<String, Object> getMessageList(String keyword, int categoryNo, int searchNo, int currentPage) {
		// 페이징을 위한 기본 데이터 계산(총 글수, 총 페이지수, 페이지블록갯수, 현재머물고있는페이지)
		int totalCount = noticeDao.getTotalCount(keyword, categoryNo, searchNo);		// 총 글의 갯수
		int pageCount = (int)Math.ceil((double) totalCount / LIST_SIZE);				// 페이지 숫자 총 갯수
		
		int blockCount = (int)Math.ceil((double) pageCount / PAGE_SIZE);				// 페이지 숫자를 블록화했을 때의 총 갯수
		int currentBlock = (int)Math.ceil((double) currentPage / PAGE_SIZE);			// 현재 머무르고 있는 블록 순서
//		System.out.println(totalCount + ", " + pageCount + ", " + blockCount + ", " + currentBlock);
		
		// 파라미터 page값 검증
		if(currentPage < 1) {
			currentPage = 1;
			currentBlock = 1;
		} else if(currentPage > pageCount) {		// 모르겠다...
			currentPage = pageCount;
			currentBlock = (int)Math.ceil((double) currentPage / PAGE_SIZE);
		}
		
		// index.jsp에서 페이지 리스트를 랜더링하기 위한 데이터값 계산
		int beginPage = (currentBlock == 0) ? 1 : ((currentBlock - 1) * PAGE_SIZE + 1);
		int prevPage = (currentBlock > 1) ? ((currentBlock - 1) * PAGE_SIZE) : 0;
		int nextPage = (currentBlock < blockCount) ? (currentBlock * PAGE_SIZE + 1) : 0;
		int endPage = (nextPage > 0) ? ((beginPage - 1) + LIST_SIZE) : pageCount;
		
		// 리스트 가져오기
		List<NoticeVo> list = noticeDao.getList(keyword, categoryNo, searchNo, currentPage, LIST_SIZE);
		
		// 리스트 정보를 맵에 저장
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		map.put("keyword", keyword);
		map.put("categoryNo", categoryNo);
		map.put("searchNo", searchNo);
		
		map.put("totalCount", totalCount);			// 총 게시글 수
		map.put("listSize", LIST_SIZE);				// 한 페이지당 게시물 수
		map.put("currentPage", currentPage);		// 현재 머무르고 있는 페이지
		
		map.put("beginPage", beginPage);
		map.put("prevPage", prevPage);
		map.put("nextPage", nextPage);
		map.put("endPage", endPage);
		
		return map;
	}
	
	public int writeMessage(NoticeVo noticeVo) {	// 글쓰기
		return noticeDao.insert(noticeVo);
	}
	
	public int deleteMessage(NoticeVo noticeVo) {
		return noticeDao.delete(noticeVo);
	}
	
	public NoticeVo getMessage(Long no) {
		NoticeVo noticeVo = noticeDao.get(no);
		
		return noticeVo;
	}
	
	public int updateMessage(NoticeVo noticeVo) {
		return noticeDao.update(noticeVo);
	}
	
	public void restore(NoticeVo noticeVo, MultipartFile multipartFile) {
			
		try {
			String orgFileName = multipartFile.getOriginalFilename();
			String fileExtName = orgFileName.substring(orgFileName.lastIndexOf('.')+1, orgFileName.length());
			String saveFileName = generateSaveFileName(fileExtName);
			
			if(multipartFile.isEmpty() == true) {
				// DB에 저장
				noticeVo.setSaveFileName("");
			} else {
				// 파일 저장
				writeFile(multipartFile, saveFileName);
				
				// DB에 저장
				noticeVo.setSaveFileName(saveFileName);
			}
			
			noticeDao.insert(noticeVo);
			
		} catch(IOException ex) {
			// throw new UploadFileException("write file");
			// log남기기
			throw new RuntimeException("upload file");
		}
	}
	
	private void writeFile(MultipartFile multipartFile, String saveFileName) throws IOException {
		byte[] fileData = multipartFile.getBytes();
		FileOutputStream fos = new FileOutputStream(SAVE_PATH + "/" + saveFileName);
		fos.write(fileData);
		fos.close();
	}
	
	private String generateSaveFileName(String extName) {
		String fileName = "";
		Calendar calendar = Calendar.getInstance();

		fileName += calendar.get(Calendar.YEAR);
		fileName += calendar.get(Calendar.MONTH);
		fileName += calendar.get(Calendar.DATE);
		fileName += calendar.get(Calendar.HOUR);
		fileName += calendar.get(Calendar.MINUTE);
		fileName += calendar.get(Calendar.SECOND);
		fileName += calendar.get(Calendar.MILLISECOND);
		fileName += ("." + extName);

		return fileName;
	}
}
