package com.ff.modeal.repository.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ff.modeal.vo.ItemVo;

@Repository
public class ItemDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<ItemVo> searchList(){
		return sqlSession.selectList("item.searchList");
	}
	
	public List<Map<String, Object>> searchResultList(String name, String latitude, String longtitude){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("latitude", latitude);
		map.put("longitude", longtitude);
		map.put("name", name);
		System.out.println(name);
		return sqlSession.selectList("item.searchResultList",map );
	}
	
}
