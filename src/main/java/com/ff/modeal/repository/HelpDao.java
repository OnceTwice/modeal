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
	
	// 고객센터 목록 & 검색창
	public List<HelpVo> getList(int searchCondition, String searchKeyword){	
		Map<String, Object> map = new HashMap<String, Object>();
			map.put("searchCondition", searchCondition);
			map.put("searchKeyword", searchKeyword);
		return sqlSession.selectList("help.getList", map);
	}
	
	// 고객센터 상세페이지
	public Map<String, Object> getView(Long no){	
		return sqlSession.selectOne("help.getView", no);
	}
	
	// 고객센터 총 게시물 수
//	public long listCount(){
//		return sqlSession.selectOne("help.listCount");
//	}
		
}
