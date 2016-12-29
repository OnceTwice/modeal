package com.ff.modeal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("") // 메인 연결입니다.
	public String hello() {
		return "main/main";
		
	}

	@RequestMapping("/login")
	public String login() {
		return "main/loginform";
	}

	@RequestMapping("/loginsuccess")
	public String loginSuccess() {
		return "main/loginsuccess";
	}
}
