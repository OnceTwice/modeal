package com.ff.modeal.service.app;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.modeal.repository.app.ItemDao;
import com.ff.modeal.vo.ItemVo;

@Service
public class ItemService {
	
	@Autowired
	private ItemDao itemDao;
	
	
	//검색리스트
	public List<ItemVo> SearchList(){
		return itemDao.searchList();
	}
	
	//검색결과 리스트
	public List<Map<String, Object>> GetResultList(String name){
		return itemDao.searchResultList(name);
	}
	
	
	
}
