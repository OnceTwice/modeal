package com.ff.modeal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.modeal.repository.ShopDao;

@Service
public class ShopService {
	
	@Autowired
	private ShopDao shopDao;
	
	public List<ShopDao> list() {
		return shopDao.list(); 
	}

}
