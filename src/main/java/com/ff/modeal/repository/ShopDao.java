package com.ff.modeal.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ShopDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<ShopDao> list(Integer page, String keyword, int list_size) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", page);
		map.put("keyword", keyword);
		map.put("list_size", list_size);
		return sqlSession.selectList("shop.list", map);
	}
	
	// 총 게시물 갯수 (검색어 있을시 검색어를 포함하는 총 게시물 갯수)
	public int total(String keyword) {
		return sqlSession.selectOne("shop.total", keyword);
	}
	
	// 해당 번호 매장 상세 보기
	public List<Object> view(Long no) {
		return sqlSession.selectList("shop.view", no);
	}
}
