package com.ff.modeal.repository.app;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ff.modeal.vo.app.UserVo;

@Repository
public class JoinDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public int insertUser(UserVo userVo) {
//		System.out.println("사용자 Dao ===== " + sqlSession.insert("join.insertUser", userVo));
		return sqlSession.insert("join.insertUser", userVo);
	}
	
	public int insertOwner(UserVo userVo) {
//		System.out.println("사업자 Dao ===== " + sqlSession.insert("join.insertOwner", userVo));
		return sqlSession.insert("join.insertOwner", userVo);
	}
	
}
