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

	/************ 회원가입 ************/
	public int joinUser(UserVo userVo) {			// 일반인 회원가입
//		System.out.println("사용자 Service ===== " + joinDao.insertUser(userVo));
		return joinDao.insertUser(userVo);
	}
	
	public int joinOwnerMarket(Map<String, Object> map) {			// 사업자 회원가입 때 점포 등록 후 점포 번호를 user 테이블에 넘겨줌
		System.out.println("Service joinOwnerMarket에서========" + map);
		
		ShopVo shopVo = new ShopVo();
		shopVo.setAddress((String) map.get("shopAddress"));
		shopVo.setNewaddress((String) map.get("shopNewAddress"));
		shopVo.setName((String) map.get("shopName"));
		shopVo.setPhone((String) map.get("shopPhone"));
		shopVo.setPicture((String) map.get("shopPicture"));
		shopVo.setIntroduce((String) map.get("shopIntroduce"));
		shopVo.setLongitude((Double) map.get("shopLongitude"));
		shopVo.setLatitude((Double) map.get("shopLatitude"));
		
		System.out.println("shopVo 출력123123124124124");
		System.out.println(shopVo);
		
		return joinDao.insertOwnerMarket(shopVo);
	}

	public int joinOwnerUser(Map<String, Object> map) {
//		System.out.println("사업자 Service ===== " + joinDao.insertOwner(userVo));
	
		System.out.println("Service joinOwnerUser에서========" + map);
		
//		System.out.println("joinDao의 No값 출력!!!!!!!!" + joinDao.getNo());
		
		UserVo userVo = new UserVo();
		userVo.setId((String) map.get("userId"));
		userVo.setPassword((String) map.get("userPassword"));
		userVo.setGender((String) map.get("userGender"));
		userVo.setLocation((String) map.get("userLocation"));
		userVo.setBirth((String) map.get("userBirth"));
		userVo.setManagerIdentified( ((Integer) map.get("userManagerIdentified")).longValue());
		userVo.setShopNo(joinDao.getNo());
		
		System.out.println("userVo 출력123123123");
		System.out.println(userVo);
		
		return joinDao.insertOwnerUser(userVo);
	}
	
	/************ 회원 정보 수정 ************/
	public int modifyUser(UserVo userVo) {
		return joinDao.updateUser(userVo);
	}
	
	public int modifyOwnerMarket(Map<String, Object> map) {
		ShopVo shopVo = new ShopVo();

		shopVo.setNo(((Integer) map.get("shopNo")).longValue());
		shopVo.setAddress((String) map.get("shopAddress"));
		shopVo.setNewaddress((String) map.get("shopNewAddress"));
		shopVo.setName((String) map.get("shopName"));
		shopVo.setPhone((String) map.get("shopPhone"));
		shopVo.setPicture((String) map.get("shopPicture"));
		shopVo.setIntroduce((String) map.get("shopIntroduce"));
		shopVo.setLongitude((Double) map.get("shopLongitude"));
		shopVo.setLatitude((Double) map.get("shopLatitude"));
		
		return joinDao.updateOwnerMarket(shopVo);
	}
	
	public int modifyOwnerUser(Map<String, Object> map) {
		UserVo userVo = new UserVo();
		
		userVo.setNo(((Integer)map.get("userNo")).longValue());
		userVo.setId((String) map.get("userId"));
		userVo.setPassword((String) map.get("userPassword"));
		userVo.setGender((String) map.get("userGender"));
		userVo.setLocation((String) map.get("userLocation"));
		userVo.setBirth((String) map.get("userBirth"));
		userVo.setManagerIdentified( ((Integer) map.get("userManagerIdentified")).longValue());
		userVo.setShopNo(((Integer) map.get("shopNo")).longValue());
		
		return joinDao.updateOwnerUser(userVo);
	}

	/********** 회원 탈퇴 ************/
	public void deleteUser(long no) {

		joinDao.deleteUser(no);
	}
}
