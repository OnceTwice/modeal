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
	
	public List<UserVo> getUserList(){
		return userDao.getUserList();
	}
	
	public UserVo login(String id, String password){
		return null;
	}

}
