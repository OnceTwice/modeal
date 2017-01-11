package com.ff.modeal.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.modeal.repository.HelpDao;
import com.ff.modeal.vo.HelpVo;

@Service
public class HelpService {
//	private static final int LIST_SIZE = 5; 한 페이지당 게시물 수
//	private static final int PAGE_SIZE = 5; 페이지 리스트의 페이지 수
	
	@Autowired
	private HelpDao helpDao;

	// 총 리스트 수
	public long helpListCount() {
		return helpDao.helpListCount();
	}
	
	// 고객센터 리스트
	public Map<String, Object> helpList(int searchCondition, String searchKeyword/*, int currentPage*/) {
		/* ★★★★★ 추가함
		int totalCount = helpDao.getTotalCount(searchCondition, searchKeyword);			// 총 글의 갯수
		int pageCount = (int)Math.ceil((double) totalCount / LIST_SIZE);				// 페이지 숫자 총 갯수	
		int blockCount = (int)Math.ceil((double) pageCount / PAGE_SIZE);				// 페이지 숫자를 블록화했을 때의 총 갯수
		int currentBlock = (int)Math.ceil((double) currentPage / PAGE_SIZE);			// 현재 머무르고 있는 블록 순서
//		System.out.println(totalCount + ", " + pageCount + ", " + blockCount + ", " + currentBlock);
		
		// 파라미터 page값 검증
		if(currentPage < 1) {
			currentPage = 1;
			currentBlock = 1;
		} else if(currentPage > pageCount) {
			currentPage = pageCount;
			currentBlock = (int)Math.ceil((double) currentPage / PAGE_SIZE);
		}
		
		// index.jsp에서 페이지 리스트를 랜더링하기 위한 데이터값 계산
		int beginPage = (currentBlock == 0) ? 1 : ((currentBlock - 1) * PAGE_SIZE + 1);
		int prevPage = (currentBlock > 1) ? ((currentBlock - 1) * PAGE_SIZE) : 0;
		int nextPage = (currentBlock < blockCount) ? (currentBlock * PAGE_SIZE + 1) : 0;
		int endPage = (nextPage > 0) ? ((beginPage - 1) + LIST_SIZE) : pageCount;
		*/
		
		List<HelpVo> list = helpDao.helpList(searchCondition, searchKeyword /*currentPage, LIST_SIZE*/);
		
		Map<String, Object> map = new HashMap<String, Object>();
			map.put("list", list);
			map.put("searchCondition", searchCondition);
			map.put("searchKeyword", searchKeyword);
			
			/* ★★★★★ 추가함
			map.put("totalCount", totalCount);			// 총 게시글 수
			map.put("listSize", LIST_SIZE);				// 한 페이지당 게시물 수
			map.put("currentPage", currentPage);		// 현재 머무르고 있는 페이지
			map.put("beginPage", beginPage);
			map.put("prevPage", prevPage);
			map.put("nextPage", nextPage);
			map.put("endPage", endPage);
			*/
		return map;
	}
	
	// 뷰 페이지
	public Map<String, Object> helpView(Long no) {
		return helpDao.helpView(no);
	}
}
