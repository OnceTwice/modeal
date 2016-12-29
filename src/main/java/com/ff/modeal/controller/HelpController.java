package com.ff.modeal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ff.modeal.security.Admin;
import com.ff.modeal.service.HelpService;

@Controller
@RequestMapping("/help")
public class HelpController {
	
	@Autowired
	private HelpService helpService;
	
	// @Admin
	@RequestMapping("")
	public String help(Model model) {
		
		model.addAttribute("list", helpService.list());
		return "help/helpMain";
	}
	
}
