package com.ff.modeal.service.app;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.ff.modeal.repository.app.*;
import com.ff.modeal.vo.app.*;

@Service
public class JoinService {
	
	@Autowired
	private JoinDao joinDao;
	
	public List<UserVo> getAllUsers() {
		List<UserVo> list = new ArrayList<UserVo>();
		
		UserVo user = new UserVo();
		user.setNo(1L);
		user.setId("1");
		user.setGender("남");
		user.setLocation("서울시 성북구");
		user.setBirth("2016.05.29");
		user.setPassword("1234");
		list.add(user);
		
		user = new UserVo();
		user.setNo(2L);
		user.setId("12");
		user.setGender("여");
		user.setLocation("서울시 동작구");
		user.setBirth("2017.11.05");
		user.setPassword("5678");
		list.add(user);
		
		user = new UserVo();
		user.setNo(3L);
		user.setId("123");
		user.setGender("남");
		user.setLocation("서울시 강남구");
		user.setBirth("2000.01.01");
		user.setPassword("91011");
		list.add(user);
		
		return list;
	}
	
	public int joinUser(UserVo userVo) {
//		System.out.println("사용자 Service ===== " + joinDao.insertUser(userVo));
		return joinDao.insertUser(userVo);
	}
	
	public int joinOwnerUser(Object obj) {
//		System.out.println("사업자 Service ===== " + joinDao.insertOwner(userVo));
		
		System.out.println("Service에서========" + obj);
		
		UserVo userVo = null;;
		return joinDao.insertOwnerUser(userVo);
	}
}
