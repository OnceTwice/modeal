package com.ff.modeal.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.modeal.repository.UserDao;
import com.ff.modeal.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	//사용자 리스트
//	public List<UserVo> getListUser() {
//		return userDao.getList();
//	}
	public Map<String, Object> getListUser(String keyword, String filterCheck){
		//사용자 리스트 
		List<UserVo> list=userDao.getList(keyword, filterCheck);
		//리스트 map에 저장
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("list", list);
		map.put("keyword", keyword);
		map.put("filterCheck", filterCheck);
		return map;
	}
	
	// 총 사용자
	public long userSum(){
		return userDao.userCount();
	}

	// 로그인 정보 가져오기(김영조)
	public UserVo login(String id, String password) {
		return userDao.getUserInfo(id, password);
	}
	
	//userID
	public String userID(Long no){
		return userDao.getUserID(no);
	}

}
