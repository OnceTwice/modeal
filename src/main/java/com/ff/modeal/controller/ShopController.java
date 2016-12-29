package com.ff.modeal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ff.modeal.security.Admin;

@Controller
@RequestMapping("/shop")
public class ShopController {

	@Admin
	@RequestMapping("")
	public String index(Model model) {
		return "shop/shopMain";
	}
	
}
