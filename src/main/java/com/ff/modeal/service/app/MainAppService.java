package com.ff.modeal.service.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.modeal.repository.app.MainDao;
import com.ff.modeal.vo.ItemVo;

@Service
public class MainAppService {

	@Autowired
	private MainDao mainDao;

	public List<Map<String, Object>> MainList(String latitude, String longitude, Integer range) {

		Double doubleRange = range * 0.001 * 0.009009;
		return mainDao.mainList(latitude, longitude, doubleRange);
	}

	// list Mock data
	public List<ItemVo> getMainlist() {

		List<ItemVo> list = new ArrayList<ItemVo>();

		ItemVo itemVo = new ItemVo();

		itemVo.setNo(1L);
		itemVo.setName("바게트빵");
		itemVo.setCount(3);
		itemVo.setOriPrice(1000);
		itemVo.setPrice(900);
		itemVo.setExpDate("2017-02-02");
		itemVo.setPicture("moon.jpg");
		itemVo.setShopNo(1L);
		list.add(itemVo);
		return list;
	}

	public void addBookmark(Long itemNo, Long userNo) {
		mainDao.addBookmark(itemNo, userNo);
	}
	
	public void deleteBookmark(Long itemNo, Long userNo) {
		mainDao.deleteBookmark(itemNo, userNo);
	}
	
	public Long selectBookmark(Long itemNo, Long userNo) {
		return mainDao.selectBookmark(itemNo, userNo);
	}
}
