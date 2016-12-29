package com.ff.modeal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ff.modeal.security.Admin;
import com.ff.modeal.service.ShopService;

@Controller
@RequestMapping("/shop")
public class ShopController {
	
	@Autowired
	private ShopService shopService;

	@Admin
	@RequestMapping("")
	public String index(Model model) {
		model.addAttribute("list", shopService.list());
		return "shop/shopMain";
	}
	
}
