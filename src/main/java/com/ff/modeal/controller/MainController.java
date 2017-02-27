package com.ff.modeal.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ff.modeal.security.Admin;
import com.ff.modeal.service.StatsService;

@Controller
public class MainController {

	@Autowired
	private StatsService statsService;

	@RequestMapping("") // 메인 연결입니다.
	public String hello() {

		// return "main/main";
		// return "main/main_boot";
		return "main/loginform_boot";
	}

	@RequestMapping("/login")
	public String login() {
		return "main/loginform_boot";
		// return "main/loginform";
	}

	@Admin
	@RequestMapping("/loginsuccess")
	public String loginSuccess(Model model) {
		List<Map<String, Object>> genderlist = statsService.getgenderCount();
		List<Map<String, Object>> agelist = statsService.getAgeCount();
		List<Map<String, Object>> locationlist= statsService.getLocationCount();
		
		
		model.addAttribute("genderlist", genderlist);
		model.addAttribute("agelist", agelist);
		model.addAttribute("locationlist", locationlist);

		return "main/success_boot";
	}
}
