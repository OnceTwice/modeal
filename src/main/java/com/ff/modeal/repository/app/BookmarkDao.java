package com.ff.modeal.repository.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookmarkDao {

	@Autowired
	private SqlSession sqlSession;

	public void addBookmark(Long itemNo, Long userNo, Long shopNo) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("itemNo", itemNo);
		map.put("userNo", userNo);
		map.put("shopNo", shopNo);
		sqlSession.insert("bookmark.add", map);
	}

	public void deleteBookmark(Long itemNo, Long userNo, Long shopNo) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("itemNo", itemNo);
		map.put("userNo", userNo);
		map.put("shopNo", shopNo);
		sqlSession.delete("bookmark.delete", map);
	}

	public Long selectBookmark(Long itemNo, Long userNo, Long shopNo) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("itemNo", itemNo);
		if (shopNo == null) {
			map.put("userNo", userNo);
		} else if (itemNo == null) {
			map.put("shopNo", shopNo);
		}
		return sqlSession.selectOne("bookmark.select", map);
	}

	public List<Map<String, Object>> list(Long userNo) {
		return sqlSession.selectList("bookmark.list", userNo);
	}

}
