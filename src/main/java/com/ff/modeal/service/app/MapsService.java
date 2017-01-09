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

	public List<ShopVo> maplist(String range, String longitude, String latitude) {
		Double doubleRange = Double.valueOf(range);
		Double doubleLongitude = Double.valueOf(longitude);
		Double doubleLatitude = Double.valueOf(latitude);

		List<ShopVo> list = shopDao.maplist(doubleRange, doubleLongitude, doubleLatitude);
		return list;
	}
}
