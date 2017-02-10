package com.ff.modeal.service.app;

import java.net.URL;
import java.net.URLEncoder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ff.modeal.vo.app.map.AddressVo;

public class DaumSearchService {

	public AddressVo fetchAddress(String addr) { // 안드로이드에서 받아온 주소를 다음에서 검색해서 결과를 다시 보낸다

		AddressVo addressVo = null;
		String address;

		try {
			address = URLEncoder.encode(addr, "UTF-8");

			// 받아온 주소로 검색
			String url = "https://apis.daum.net/local/geo/addr2coord?apikey=" + "b488c172ab6b5df2364b485b7cc3ad6c&q="
					+ address + "&output=json";

			// 검색 결과 다음자체 json형식으로 만듬
			addressVo = new ObjectMapper().readValue(new URL(url), AddressVo.class);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return addressVo;
	}
}
