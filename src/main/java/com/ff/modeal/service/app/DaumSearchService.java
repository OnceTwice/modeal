package com.ff.modeal.service.app;

import java.net.URL;
import java.net.URLEncoder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ff.modeal.vo.app.map.AddressVo;

public class DaumSearchService {

	public AddressVo fetchAddress(String addr) {

		AddressVo addressVo = null;
		String address;

		try {
			address = URLEncoder.encode(addr, "UTF-8");

			String url = "https://apis.daum.net/local/geo/addr2coord?apikey=" + "b488c172ab6b5df2364b485b7cc3ad6c&q="
					+ address + "&output=json";

			addressVo = new ObjectMapper().readValue(new URL(url), AddressVo.class);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return addressVo;
	}
}
