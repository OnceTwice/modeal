package com.ff.modeal.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ShopDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<ShopDao> list() {
		return sqlSession.selectList("shop.list");
	}

}
