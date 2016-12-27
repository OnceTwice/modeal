package com.ff.modeal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.modeal.repository.UserDao;
import com.ff.modeal.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public List<UserVo> getUserList() {
		return userDao.getUserList();
	}

	// 로그인 정보 가져오기(김영조)
	public UserVo login(String id, String password) {
		return userDao.getUserInfo(id, password);
	}

}
