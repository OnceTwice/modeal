package com.ff.modeal.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StatsDao {

	@Autowired
	private SqlSession sqlsession;
	
	public List<Map<String, Object>> getgenderCount(){
		return sqlsession.selectList("user.getCountGender");
	}
	public List<Map<String, Object>> genlocationCount(){
		return sqlsession.selectList("user.genlocationCount");
	}
}
