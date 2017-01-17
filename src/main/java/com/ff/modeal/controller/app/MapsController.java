package com.ff.modeal.controller.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ff.modeal.dto.JSONResult;
import com.ff.modeal.service.app.DaumSearchService;
import com.ff.modeal.service.app.MapsService;
import com.ff.modeal.vo.ShopVo;

@Controller
@RequestMapping("/map")
public class MapsController {

	@Autowired
	private MapsService mapsService;

	@ResponseBody
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public JSONResult maplist(@RequestParam(value = "range", required = true, defaultValue = "0") String range,
			@RequestParam(value = "longitude", required = true, defaultValue = "0") String longitude,
			@RequestParam(value = "latitude", required = true, defaultValue = "0") String latitude) {
		range = "0.002";
		longitude = "127.0280215767454";
		latitude = "37.49456429671521";
		List<ShopVo> list = mapsService.maplist(range, longitude, latitude);
		return JSONResult.success(list);
	}

	@ResponseBody
	@RequestMapping("")
	public String hello() {
		return "hello23443";
	}

	@ResponseBody
	@RequestMapping("/addresstopoint")
	public JSONResult DaumSearchAddress(@RequestParam(value = "addr", required = true, defaultValue = "") String addr) {
		return JSONResult.success(new DaumSearchService().fetchAddress(addr));
	}

}
