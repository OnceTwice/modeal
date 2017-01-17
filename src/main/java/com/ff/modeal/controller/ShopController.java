package com.ff.modeal.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ff.modeal.dto.JSONResult;
import com.ff.modeal.service.ShopService;

@Controller
@RequestMapping("/shop")
public class ShopController {
	
	@Autowired
	private ShopService shopService;

//	@Admin
	@RequestMapping("")
	public String index(@RequestParam(value="keyword", required=false, defaultValue="") String keyword, // jsp가 넘겨주는 검색어를 RequestParam으로 받는다
								@RequestParam(value="filterCheck", required=false, defaultValue="1") Integer option,
								@RequestParam(value="page", required=false, defaultValue="1") Integer page, Model model) { // jsp가 넘겨주는 페이지를 RequestParam으로 받는다 
		model.addAttribute("map", shopService.list(page, keyword, option));
		model.addAttribute("total", shopService.total());
		return "shop/shopMain";
	}
	
//	@Admin
	@RequestMapping(value="/{no}", method=RequestMethod.GET)
	public String view(@PathVariable("no") Long no, Model model) { // 매장 상세정보용으로 jsp에서 no값을 받아서 db에서 불러온다
		model.addAttribute("view", shopService.view(no));
		return "shop/shopView";
	}
	
	@ResponseBody
	@RequestMapping(value="/test", method=RequestMethod.POST)
	public JSONResult test(@RequestBody(required=false) Map<String, String> map) {
		System.out.println("받아오는 값 : " + map);

		Integer page = Integer.parseInt(map.get("page"));
		Integer option = Integer.parseInt(map.get("filterCheck"));
		String keyword = map.get("keyword");
		
		return JSONResult.success(shopService.list(page, keyword, option));
	}
}
