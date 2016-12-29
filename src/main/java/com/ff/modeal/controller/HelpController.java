package com.ff.modeal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/help")
public class HelpController {
	
//	@Autowired
//	private HelpService helpService;
	
	@RequestMapping("")
	public String help() {
		
		return "help/helpMain";
	}
	
}
