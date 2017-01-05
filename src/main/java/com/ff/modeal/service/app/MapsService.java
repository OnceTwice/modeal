package com.ff.modeal.service.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.modeal.repository.ShopDao;
import com.ff.modeal.vo.ShopVo;

@Service
public class MapsService {

	@Autowired
	private ShopDao shopDao;
	
	public List<ShopVo> maplist(String range, String myx, String myy){
		Long longRange = Long.valueOf(range);
		Long longMyX = Long.valueOf(myx);
		Long longMyy = Long.valueOf(myy);
		
		List<ShopVo> list = shopDao.maplist(longRange, longMyX, longMyy);
		return list;
	}
}
