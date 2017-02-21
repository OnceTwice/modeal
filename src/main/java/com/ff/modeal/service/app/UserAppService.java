package com.ff.modeal.service.app;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.modeal.repository.app.UserAppDao;
import com.ff.modeal.util.*;
import com.ff.modeal.vo.UserVo;

@Service
public class UserAppService {

	@Autowired
	private UserAppDao userAppDao;

	public Map<String, Object> login(UserVo userVo) {
		System.out.println("로그인욤11111" + userVo);
		if (userVo.getPassword() != null) {
			userVo.setPassword(Encryption.Sha256(userVo.getPassword())); // 암호화
		}
		System.out.println("로그인욤22222" + userVo);
		return userAppDao.login(userVo);
	}

	public Map<String, Object> SocialJoin(UserVo userVo) {
		if (userVo.getManagerIdentified() == 3L) {
			if (userVo.getLocation() == null) {
				userVo.setLocation("FBUSER");
			}
			if (userVo.getBirth() == null) {
				userVo.setBirth("FBUSER");
			}
			if (userVo.getPassword() == null) {
				userVo.setPassword("FBUSER");
			}
			if (userVo.getGender() == null) {
				userVo.setGender("FBUSER");
			}
		} else if (userVo.getManagerIdentified() == 4L) {
			if (userVo.getLocation() == null) {
				userVo.setLocation("Google");
			}
			if (userVo.getBirth() == null) {
				userVo.setBirth("Google");
			}
			if (userVo.getPassword() == null) {
				userVo.setPassword("Google");
			}
			if (userVo.getGender() == null) {
				userVo.setGender("Google");
			}
		}
		return userAppDao.SocialJoin(userVo);
	}

	public UserVo findPW(String email) {
		return userAppDao.findPW(email);
	}

	public void changePassword(String email, String password) {
		userAppDao.changePassword(email, Encryption.Sha256(password));
	}

}
