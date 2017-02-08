package com.ff.modeal.repository.app;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.ff.modeal.vo.*;
import com.ff.modeal.vo.app.UserVo;

@Repository
public class JoinDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public int insertUser(UserVo userVo) {
//		System.out.println("사용자 Dao ===== " + sqlSession.insert("join.insertUser", userVo));
		return sqlSession.insert("join.insertUser", userVo);
	}
	
	public int insertOwnerUser(UserVo userVo) {
//		System.out.println("사업자 Dao ===== " + sqlSession.insert("join.insertOwner", userVo));
		return sqlSession.insert("join.insertOwnerUser", userVo);
	}
	
	public int insertOwnerMarket(ShopVo shopVo) {
		return sqlSession.insert("", shopVo);
	}
	
}
