package com.ff.modeal.service.app;

import java.util.*;

import org.springframework.stereotype.*;

import com.ff.modeal.vo.*;

@Service
public class UserServiceTest {
	public List<UserVo> getAllUsers() {
		List<UserVo> list = new ArrayList<UserVo>();
		
		UserVo user = new UserVo();
		user.setNo(1L);
		user.setId("1");
		user.setPassword("1234");
		list.add(user);
		
		user = new UserVo();
		user.setNo(2L);
		user.setId("12");
		user.setPassword("5678");
		list.add(user);
		
		user = new UserVo();
		user.setNo(3L);
		user.setId("123");
		user.setPassword("91011");
		list.add(user);
		
		return list;
	}
}
