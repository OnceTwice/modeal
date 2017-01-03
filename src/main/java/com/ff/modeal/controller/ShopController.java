package com.ff.modeal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		model.addAttribute("list", shopService.list(page, keyword, option));
		model.addAttribute("total", shopService.total());
		return "shop/shopMain";
	}
	
//	@Admin
	@RequestMapping("/{no}")
	public String view(@PathVariable("no") Long no, Model model) { // 매장 상세정보용으로 jsp에서 no값을 받아서 db에서 불러온다
		model.addAttribute("view", shopService.view(no));
		return "shop/shopView";
	}
}
