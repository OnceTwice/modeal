package com.ff.modeal.repository.app;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ff.modeal.vo.UserVo;

@Repository
public class UserAppDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public UserVo login(UserVo userVo) {
		return sqlSession.selectOne("userApp.login", userVo);
	}

	public void FBJoin(UserVo userVo) {
		sqlSession.insert("userApp.FBJoin", userVo);
	}
}
