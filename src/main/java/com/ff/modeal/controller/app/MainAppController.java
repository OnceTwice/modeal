package com.ff.modeal.controller.app;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
	@RequestMapping(value="/list")
	public Object mainlist(Model model){ 
		
//		List<ItemVo> list = mainAppService.getMainlist();
//		Map<String, Object> map = new Map();
//		map.put("매장명", list);
//		map.put("상품가격", value);
//		map.put("상품명", value);
		
		List<Map<String, Object>> map = mainAppService.MainList();
		model.addAttribute("map", map);
		
		return JSONResult.success(map);
	}
}
