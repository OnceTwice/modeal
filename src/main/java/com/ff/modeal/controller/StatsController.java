package com.ff.modeal.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.ff.modeal.service.*;

@Controller
@RequestMapping("/stats")
public class StatsController {
	
	@Autowired
	private StatsService statsService;
	
	@RequestMapping("")
	public String statsIndex(Model model){
//		List<Map<String, Object>> genderlist = statsService.getgenderCount();
//		List<Map<String, Object>> agelist = statsService.getAgeCount();
		
//		model.addAttribute("genderlist",genderlist);
//		model.addAttribute("agelist",agelist);
		
		int man = statsService.getCountMan();
		int woman = statsService.getCountWoman();

		model.addAttribute("man", man);
		model.addAttribute("woman", woman);
		
		return "stats/statsMain";
	}
}
