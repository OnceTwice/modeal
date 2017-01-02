package com.ff.modeal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.modeal.repository.ShopDao;

@Service
public class ShopService {
	private static final int LIST_SIZE = 2; // 한페이지에 올라오는 게시물 수
	private static final int PAGE_SIZE = 3; // 페이지 리스트에 한번에 보이는 페이지 수
	
	@Autowired
	private ShopDao shopDao;
	
	public List<ShopDao> list(Integer page, String keyword) {
		int total = shopDao.total(keyword); // 총 게시물 갯수 (검색어 있을시 검색어를 포함하는 총 게시물 갯수)
		int current_page = page; // 현재 페이지
		int total_page = (int)Math.ceil((double)total / LIST_SIZE); // 총 페이지수 (총 게시물 수/한페이지의 게시물 수)
		int current_block = (int)Math.ceil((double)current_page / PAGE_SIZE); // 현재 블럭(◀ 1 2 3 4 5▶ ←여기서 1 2 3 4 5를 말함)
		int total_block = (int)Math.ceil((double)total_page / PAGE_SIZE);
		
		return shopDao.list(page, keyword, LIST_SIZE); 
	}
	
	// 총 게시물 갯수 (검색어 있을시 검색어를 포함하는 총 게시물 갯수)
	public int total(String keyword) {
		return shopDao.total(keyword);
	}
		
	// 해당 번호 매장 상세 보기
	public List<Object> view(Long no) {
		return shopDao.view(no);
	}
}
