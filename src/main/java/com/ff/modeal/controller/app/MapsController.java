package com.ff.modeal.controller.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ff.modeal.dto.JSONResult;
import com.ff.modeal.service.app.MapsService;
import com.ff.modeal.vo.ShopVo;

@Controller
@RequestMapping("map")
public class MapsController {

	@Autowired
	private MapsService mapsService;

	@ResponseBody
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public JSONResult maplist(@RequestParam(value = "range", required = true, defaultValue = "0") String range,
			@RequestParam(value = "myx", required = true, defaultValue = "0") String myx,
			@RequestParam(value = "myy", required = true, defaultValue = "0") String myy) {
		range = "2";
		myx = "3";
		myy = "3";
		List<ShopVo> list = mapsService.maplist(range, myx, myy);

		return JSONResult.success(list);
	}

}
