package com.ff.modeal.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ff.modeal.vo.HelpVo;

@Repository
public class HelpDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<HelpVo> list(){
		
		return sqlSession.selectList("help.list");

	}
}
