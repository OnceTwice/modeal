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

	@Autowired
	private NoticeDao noticeDao;
	
//	public List<NoticeVo> getMessageList() {		// 리스트 단순 출력
//		return noticeDao.getList();
//	}
	
	public Map<String, Object> getMessageList(String keyword) {
		// 리스트 가져오기
		List<NoticeVo> list = noticeDao.getList(keyword);
		
		// 리스트 정보를 맵에 저장
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		map.put("keyword", keyword);
		
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
