package com.ff.modeal.service.app;

import java.util.*;

import org.springframework.stereotype.*;

import com.ff.modeal.vo.*;

@Service
public class JoinService {
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
}
