package com.ff.modeal.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.modeal.repository.HelpDao;

@Service
public class HelpService {
	private static final int LIST_SIZE = 5;	// 한페이지에 보이는 게시물의 수
	private static final int PAGE_SIZE = 5;	// 페이지 리스트의 페이지 수

	@Autowired
	private HelpDao helpDao;

	// 총 리스트 수
	public long helpListCount() {
		return helpDao.helpListCount();
	}
	
	// 고객센터 리스트
	public Map<String, Object> helpList(int searchCondition, String searchKeyword, int currentPage) {
		
		// 1. 페이징을 위한 기본 데이터 계산
		int totalCount = helpDao.getTotalCount( searchCondition, searchKeyword );
		int pageCount = (int)Math.ceil( (double)totalCount / LIST_SIZE );
		int blockCount = (int)Math.ceil( (double)pageCount / PAGE_SIZE );
		int currentBlock = (int)Math.ceil( (double)currentPage / PAGE_SIZE );		

		// 2. 파라미터 page 값  검증
		if( currentPage < 1 ) {
			currentPage = 1;
			currentBlock = 1;
		} else if( currentPage > pageCount ) {
			currentPage = pageCount;
			currentBlock = (int)Math.ceil( (double)currentPage / PAGE_SIZE );
		}
		
		// 3. view에서 페이지 리스트를 렌더링 하기위한 데이터 값 계산
		int beginPage = currentBlock == 0 ? 1 : (currentBlock - 1)*PAGE_SIZE + 1;
		int prevPage = ( currentBlock > 1 ) ? ( currentBlock - 1 ) * PAGE_SIZE : 0;
		int nextPage = ( currentBlock < blockCount ) ? currentBlock * PAGE_SIZE + 1 : 0;
		int endPage = ( nextPage > 0 ) ? ( beginPage - 1 ) + LIST_SIZE : pageCount;
		
		// 4. 리스트 가져오기
		List<Map<String, Object>> list = helpDao.helpList(searchCondition, searchKeyword, currentPage, LIST_SIZE);
		
		// 5. 리스트 정보를 map에 저장
		Map<String, Object> map = new HashMap<String, Object>();
			map.put("list", list);
			map.put("searchCondition", searchCondition);
			map.put("searchKeyword", searchKeyword);
			map.put("totalCount", totalCount);
			map.put("listSize", LIST_SIZE);
			map.put("currentPage", currentPage);
			map.put("beginPage", beginPage);
			map.put("endPage", endPage);
			map.put("prevPage", prevPage);
			map.put( "nextPage", nextPage );
			
		return map;
	}
	
	// 뷰 페이지
	public Map<String, Object> helpView(Long no) {
		return helpDao.helpView(no);
	}
}
