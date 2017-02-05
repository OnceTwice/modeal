package com.ff.modeal.service.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.modeal.repository.app.UserAppDao;
import com.ff.modeal.vo.UserVo;

@Service
public class UserAppService {

	@Autowired
	private UserAppDao userAppDao;

	public UserVo login(UserVo userVo) {
		return userAppDao.login(userVo);
	}

	public void SocialJoin(UserVo userVo) {
		if (userVo.getManagerIdentified() == 3) {
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
		} else if (userVo.getManagerIdentified() == 4) {
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
		userAppDao.SocialJoin(userVo);
	}

	public UserVo findPW(String email) {
		return userAppDao.findPW(email);
	}

	public void changePassword(String email, String password) {
		userAppDao.changePassword(email, password);
	}

}
