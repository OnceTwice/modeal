package com.ff.modeal.repository.app;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ff.modeal.vo.UserVo;

@Repository
public class UserAppDao {

	@Autowired
	private SqlSession sqlSession;

	public Map<String, Object> login(UserVo userVo) {
		return sqlSession.selectOne("userApp.login", userVo);
	}

	public Map<String, Object> SocialJoin(UserVo userVo) {
		sqlSession.insert("userApp.SocialJoin", userVo);
		return sqlSession.selectOne("userApp.login", userVo);
	}

	public UserVo findPW(String email) {
		return sqlSession.selectOne("userApp.findPW", email);
	}

	public void changePassword(String email, String password) {
		UserVo userVo = new UserVo();
		userVo.setId(email);
		userVo.setPassword(password);
		sqlSession.update("userApp.changePassword", userVo);
	}
}
