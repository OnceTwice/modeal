package com.ff.modeal.repository;

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
	
	// 고객센터 목록
	public List<HelpVo> getList(){	
		return sqlSession.selectList("help.getList");
	}
	
	// 고객센터 상세페이지
	public Map<String, Object> getView(Long no){	
		return sqlSession.selectOne("help.getView", no);
	}
	
//	// 고객센터 총 게시물 수
//	public long helpCount(){
//		return sqlSession.selectOne("help.helpCount");
//	}
		
}
