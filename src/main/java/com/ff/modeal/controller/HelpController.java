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
		
		// 고객센터 총 게시물 수
		//Long helpCount=helpService.helpSum();
		//model.addAttribute("helpCount", helpCount);
		
		return "help/helpMain";
	}
	
//	@Admin
	@RequestMapping("/view")
	public String helpView(@RequestParam(value="no", required=true, defaultValue="")Long no, Model model ){
//  public 리턴타입명   메서드이름       (jsp에서  값을 받아 쓸때 @RequestParam 사용하고 괄호안에 메서드에서 사용할 파라미터의 타입과 이름을 적는다, 받아올 값의 이름을 value에 쓴다, db에 있는 값을 jsp로 넘기기 위해서 Model을 사용한다.){ 
		
		model.addAttribute("view", helpService.getView(no));	
		//Map<String, Object> map = helpService.getView(no);
		//model.addAttribute("view", map);
				
		return "help/helpView";
	}
}
