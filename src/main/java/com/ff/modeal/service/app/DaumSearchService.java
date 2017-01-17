package com.ff.modeal.service.app;

import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLEncoder;

import com.ff.modeal.vo.app.map.AddressVo;
import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DaumSearchService {

	public AddressVo fetchAddress(String addr) {
		AddressVo addressVo = null;
		String address;
		try {
			address = URLEncoder.encode(addr, "UTF-8");

			String url = "https://apis.daum.net/local/geo/addr2coord?apikey=" + "b488c172ab6b5df2364b485b7cc3ad6c&q="
					+ address + "&output=json";
			HttpRequest httpRequest = HttpRequest.get(url);
			httpRequest.contentType(HttpRequest.CONTENT_TYPE_JSON);
			httpRequest.accept(HttpRequest.CONTENT_TYPE_JSON);
			httpRequest.connectTimeout(3000);
			httpRequest.readTimeout(3000);
			int responseCode = httpRequest.code();

			if (responseCode != HttpURLConnection.HTTP_OK) { // 에러처리
				throw new RuntimeException("Http Response:::: " + responseCode);
			}

			/*
			 * JSONResultAddress jsonResultAddress = fromJSON(httpRequest,
			 * JSONResultAddress.class);
			 */
			addressVo = fromJSON(httpRequest, AddressVo.class);
			/* nfoVo result = jsonResultAddress.getChannel(); */
			System.out.println("jsonResultAddress--->" + "" + addressVo.toString());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return addressVo;
	}

	protected <V> V fromJSON(HttpRequest request, Class<V> target) {
		V v = null;

		try {
			Gson gson = new GsonBuilder().create();

			Reader reader = request.bufferedReader();
			v = gson.fromJson(reader, target);
			reader.close();

		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}

		return v;
	}
}
