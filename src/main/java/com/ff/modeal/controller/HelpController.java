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
	// int타입은 defaultValue에 값을 넣어줘야 사용가능함 ↓↓↓
	public String helpIndex(
			@RequestParam(value = "searchCondition", required = true, defaultValue = "1") int searchCondition,
			@RequestParam(value = "searchKeyword", required = true, defaultValue = "") String searchKeyword, 
			/*@RequestParam(value = "p" , required = true, defaultValue = "1") int page, */Model model) { 

		// 총 리스트 수
		Long helpListCount = helpService.helpListCount();
		model.addAttribute("helpListCount", helpListCount);
		
		// 고객센터 리스트
		Map<String, Object> map = helpService.helpList(searchCondition, searchKeyword/*, page*/); 
		model.addAttribute("map", map);
		
		return "help/helpMain";
	}

//	@Admin
	@RequestMapping("/view")
	public String helpView(@RequestParam(value = "no", required = true, defaultValue = "") Long no, Model model) {
		// public 리턴타입명 메서드이름 (
		// @RequestParam은 jsp에서 값을 받아 쓸때 사용하고 괄호안 메서드에서 사용할 파라미터의 타입과 이름을 적는다.
		// 받아올 값의 이름을 value에 쓰고 DB에 있는 값을 jsp로 넘기기 위해 Model을 사용){

		model.addAttribute("view", helpService.helpView(no));
		// ↑ 아래 두줄을 줄여서 한줄로 작성
		// Map<String, Object> map = helpService.helpView(no);
		// model.addAttribute("view", map);

		return "help/helpView";
	}
}
