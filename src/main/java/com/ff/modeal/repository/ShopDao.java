package com.ff.modeal.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ff.modeal.vo.ShopVo;

@Repository
public class ShopDao {

	@Autowired
	private SqlSession sqlSession;

	public List<Map<String, Object>> list(Integer page, String keyword, Integer option, int list_size) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", page);
		map.put("keyword", keyword);
		map.put("option", option);
		map.put("list_size", list_size);
		return sqlSession.selectList("shop.list", map);
	}

	// 총 게시물 개수
	public int total() {
		return sqlSession.selectOne("shop.total");
	}

	// 검색 결과 개수
	public int totalKeyword(String keyword, Integer option) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("keyword", keyword);
		map.put("option", option);
		return sqlSession.selectOne("shop.totalKeyword", map);
	}

	// 해당 번호 매장 상세 보기
	public List<Object> view(Long no) {
		return sqlSession.selectList("shop.view", no);
	}

	// 범위에 맞는 매장 리스트 가져오기
	public List<ShopVo> maplist(Double range, Double longitude, Double latitude) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("range", range);
		map.put("longitude", longitude);
		map.put("latitude", latitude);
		return sqlSession.selectList("shop.maplist", map);
	}
}
