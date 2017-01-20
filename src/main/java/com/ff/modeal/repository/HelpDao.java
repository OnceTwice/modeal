package com.ff.modeal.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ff.modeal.vo.HelpVo;

@Repository
public class HelpDao {

	@Autowired
	private SqlSession sqlSession;
	
	// 안드로이드 테스트해보기
	public List<HelpVo> getList() {
		return sqlSession.selectList("help.getList");
	}
	

	// 총 리스트 수
	public long helpListCount() {
		return sqlSession.selectOne("help.helpListCount");
	}
	
	public int getTotalCount(int searchCondition, String searchKeyword) {
		Map<String, Object> map = new HashMap<String, Object>();
			map.put("searchCondition", searchCondition);
			map.put("searchKeyword", searchKeyword);
		return sqlSession.selectOne("help.getTotalCount", map);
	}
	
	// 고객센터 리스트ㆍ검색창
	public List<Map<String, Object>> helpList(int searchCondition, String searchKeyword, int currentPage, int size) {
		
		Map<String, Object> map = new HashMap<String, Object>();
			map.put("searchCondition", searchCondition);
			map.put("searchKeyword", searchKeyword);
			map.put("currentPage", currentPage);
			map.put("size", size);
			
		return sqlSession.selectList("help.helpList", map);
	}	

	// 뷰페이지
	public Map<String, Object> helpView(Long no) {
		return sqlSession.selectOne("help.helpView", no);
	}
}
