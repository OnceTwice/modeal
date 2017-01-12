package com.ff.modeal.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ff.modeal.service.HelpService;

@Controller
@RequestMapping("/help")
public class HelpController {

	@Autowired
	private HelpService helpService;

//	@Admin // 로그인해야 게시판 보이게 설정한 것
	@RequestMapping("")	
	public String helpIndex(
			@RequestParam(value = "searchCondition", required = true, defaultValue = "1") int searchCondition,
			@RequestParam(value = "searchKeyword", required = true, defaultValue = "") String searchKeyword, 
			@RequestParam(value = "currentPage", required = true, defaultValue = "1") int currentPage, Model model) {
		
		// 총 리스트 수
		Long helpListCount = helpService.helpListCount();
		model.addAttribute("helpListCount", helpListCount);
		
		// 고객센터 리스트
		Map<String, Object> map = helpService.helpList(searchCondition, searchKeyword, currentPage);
		
		model.addAttribute("map", map);
		
		return "help/helpMain";
	}

//	@Admin
	@RequestMapping("/view")
	public String helpView(@RequestParam(value = "no", required = true, defaultValue = "") Long no, Model model) {
		model.addAttribute("view", helpService.helpView(no));
		return "help/helpView";
	}
}
