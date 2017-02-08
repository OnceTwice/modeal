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
	
	public int joinUser(UserVo userVo) {			// 일반
//		System.out.println("사용자 Service ===== " + joinDao.insertUser(userVo));
		return joinDao.insertUser(userVo);
	}
	
	public void joinOwnerUser(Map<String, Object> map) {
//		System.out.println("사업자 Service ===== " + joinDao.insertOwner(userVo));
	
		System.out.println("Service joinOwnerUser에서========" + map);
		
		UserVo userVo = new UserVo();		
		userVo.setId((String) map.get("userId"));
		userVo.setPassword((String) map.get("userPassword"));
		userVo.setGender((String) map.get("userGender"));
		userVo.setLocation((String) map.get("userLocation"));
		userVo.setBirth((String) map.get("userBirth"));
		userVo.setManagerIdentified( ((Integer) map.get("userManagerIdentified")).longValue());
//		userVo.setShopNo(((Integer) map.get("userShopNo")).longValue());
		
		System.out.println("userVo 출력123123123");
		System.out.println(userVo);
		
		return;
//		return joinDao.insertOwnerUser(userVo);
	}
	
	public void joinOwnerMarket(Map<String, Object> map) {
		System.out.println("Service joinOwnerMarket에서========" + map);
		
		ShopVo shopVo = new ShopVo();
		shopVo.setAddress((String) map.get("marketAddress"));
		shopVo.setNewAddress((String) map.get("marketNewAddress"));
		shopVo.setName((String) map.get("shopName"));
		shopVo.setPhone((String) map.get("marketPhoneNumber"));
		shopVo.setPicture((String) map.get("shopPicture"));
		shopVo.setIntroduce((String) map.get("shopIntroduce"));
		shopVo.setLongitude((Double) map.get("shopLongitude"));
		shopVo.setLatitude((Double) map.get("shopLatitude"));
		
		System.out.println("shopVo 출력123123124124124");
		System.out.println(shopVo);
		
//		ShopVo shopVo = null;
		
		return;
//		return joinDao.insertOwnerMarket(shopVo);
	}
}
