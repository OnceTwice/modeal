package com.ff.modeal.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StatsDao {

	@Autowired
	private SqlSession sqlSession;

	public List<Map<String, Object>> getgenderCount() {
		return sqlSession.selectList("user.getCountGender");
	}

	public List<Map<String, Object>> getAgeCount() {
		return sqlSession.selectList("user.getAgeCount");
	}

	public int selectMan() {
		return sqlSession.selectOne("user.getCountMan");
	}
	
	public int selectWoman() {
		return sqlSession.selectOne("user.getCountWoman");
	}
}
