package com.ff.modeal.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ff.modeal.vo.UserVo;

@Repository
public class UserDao {

	@Autowired
	private SqlSession sqlSession;

	//사용자리스트
	public List<UserVo> getList(String keyword, String filterCheck) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("keyword", keyword);
		map.put("filterCheck", filterCheck);
		return sqlSession.selectList("user.getUserList",map);
	}
	
	public long userCount(){
		return sqlSession.selectOne("user.userConut");
	}

	// 로그인 정보 가져오기(김영조)
	public UserVo getUserInfo(String id, String password) {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("password", password);
		return sqlSession.selectOne("user.getUserInfo", map);
	}
	
	//사용자ID 출력
	public String getUserID(Long no){
		
		return sqlSession.selectOne("user.userID", no);
	}
}
