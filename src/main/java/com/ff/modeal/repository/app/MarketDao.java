package com.ff.modeal.repository.app;

import java.util.*;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Repository
public class MarketDao {
	@Autowired
	private SqlSession sqlSession;
	
	public Map<String, Object> marketDetail(Long no) {		// 매장 상세 정보
		return sqlSession.selectOne("market.detail", no);
	}
}
