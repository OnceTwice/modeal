package com.ff.modeal.controller.app;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ff.modeal.dto.JSONResult;
import com.ff.modeal.service.app.MainAppService;

@Controller
@RequestMapping("/mainapp")
public class MainAppController {

	@Autowired
	private MainAppService mainAppService;
	
	//메인출력
	@ResponseBody
	@RequestMapping(value="/list",  method = RequestMethod.POST)
	public JSONResult mainlist(@RequestParam(value="latitude") String latitude,
									@RequestParam(value="longitude") String longitude,
									@RequestParam(value="range") int range) { 
		
		List<Map<String, Object>> map = mainAppService.MainList(latitude, longitude, range);
		
		return JSONResult.success(map);
	}
}
