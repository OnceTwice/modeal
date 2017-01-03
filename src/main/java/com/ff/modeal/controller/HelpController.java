package com.ff.modeal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ff.modeal.service.HelpService;
import com.ff.modeal.vo.HelpVo;

@Controller
@RequestMapping("/help")
public class HelpController {
	
	@Autowired
	private HelpService helpService;
	
//	@Admin //로그인해야 게시판 보이게 설정한 것
	@RequestMapping("")
	public String helpIndex(Model model) {

		// 고객센터 목록
		List<HelpVo> list = helpService.getList();
		model.addAttribute("list", list);
		
//		// 고객센터 총 게시물 수
//		Long helpCount=helpService.helpSum();
//		model.addAttribute("helpCount", helpCount);
		
		return "help/helpMain";
	}
	
//	@Admin
	@RequestMapping("/view")
	public String helpView( 
		@RequestParam(value="no", required=true) Long no, Model model){ 
		return "help/helpView";
		
		}
}
