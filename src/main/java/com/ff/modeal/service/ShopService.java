package com.ff.modeal.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.modeal.repository.ShopDao;

@Service
public class ShopService {
	private static final int LIST_SIZE = 5; // 한페이지에 뜨는 게시물 수
	private static final int PAGE_SIZE = 5; // 한번에 보이는 페이지 수 (◀ 1 2 3 4 5▶ ←이걸 말함)
	
	@Autowired
	private ShopDao shopDao;
	
	public Map<String, Object> list(Integer page, String keyword, Integer option) {
		int total = shopDao.totalKeyword(keyword, option); // 총 게시물 갯수 (검색어 있을시 검색어를 포함하는 총 게시물 갯수)
		int current_page = page; // 현재 페이지
		int total_page = (int)Math.ceil((double)total / LIST_SIZE); // 총 페이지수 (총 게시물 수/한페이지의 게시물 수)
		int current_block = (int)Math.ceil((double)current_page / PAGE_SIZE); // 현재 블럭(◀ 1 2 3 4 5▶ ←여기서 1 2 3 4 5를 말함)
		int total_block = (int)Math.ceil((double)total_page / PAGE_SIZE); // 총 블럭 수
		int before_block = (current_block - 1) * PAGE_SIZE; // ◀ 누르면 이전 블럭의 마지막 페이지로 이동
		int after_block = (current_block * PAGE_SIZE) + 1; // ▶ 누르면 이후 블럭의 처음 페이지로 이동
		int begin_block = ((current_block - 1) * PAGE_SIZE) + 1; // jsp에서 페이징 띄우는 foreach문에서 begin으로 사용할 값
		int end_block = (current_block * PAGE_SIZE) > total_page ? total_page : current_block * PAGE_SIZE; // jsp에서 페이징 띄우는 foreach문에서 end로 사용 할 값
		String kwd = keyword; // 검색했을 때 페이징을 위해서 필요함
		
		
		List<Map<String, Object>> list = shopDao.list(page, keyword, option, LIST_SIZE);
		
		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("total", total);
//		map.put("current_page", current_page);
//		map.put("total_page", total_page);
		map.put("current_block", current_block);
		map.put("total_block", total_block);
		map.put("before_block", before_block);
		map.put("after_block", after_block);
		map.put("begin_block", begin_block);
		map.put("end_block", end_block);
		map.put("kwd", kwd);
		
		map.put("list", list);
		
		return map; 
	}
	
	// 총 게시물 개수 (검색어 있을시 검색어를 포함하는 총 게시물 갯수)
	public int total() {
		return shopDao.total();
	}
		
	// 해당 번호 매장 상세 보기
	public List<Object> view(Long no) {
		return shopDao.view(no);
	}
}
