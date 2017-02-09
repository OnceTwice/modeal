package com.ff.modeal.repository.app;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ff.modeal.vo.ItemVo;

@Repository
public class ItemDao2 {

	@Autowired
	private SqlSession sqlSession;
	
	// 해당 매장의 상품 목록
	public List<Map<String, Object>> shopItemList(Long shopNo){
		return sqlSession.selectList("item2.shopItemList", shopNo);
	}

	public ItemVo itemDetail(Long no) {
		return sqlSession.selectOne("item2.itemDetail", no);
	}
}
