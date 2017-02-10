package com.ff.modeal.repository.app;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.ff.modeal.vo.app.*;

@Repository
public class JoinDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public int insertUser(UserVo userVo) {
//		System.out.println("사용자 Dao ===== " + sqlSession.insert("join.insertUser", userVo));
		return sqlSession.insert("join.insertUser", userVo);
	}

	public int insertOwnerMarket(ShopVo shopVo) {
		System.out.println("사업자 Dao insertOwnerMarket ==== ");
		return sqlSession.insert("join.insertOwnerMarket", shopVo);
	}
	
	public int insertOwnerUser(UserVo userVo) {
		System.out.println("사업자 Dao insertOwnerUser 입갤!!!! =====");
//		System.out.println("사업자 Dao ===== " + sqlSession.insert("join.insertOwner", userVo));
		return sqlSession.insert("join.insertOwnerUser", userVo);
	}
	
	public Long getNo() {
//		System.out.println("no값 출력!!!!!" + sqlSession.selectOne("join.getByShopNo"));
		return sqlSession.selectOne("join.getByShopNo");
	}
}
