package com.ff.modeal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ff.modeal.security.Admin;
import com.ff.modeal.service.HelpService;
import com.ff.modeal.vo.HelpVo;

@Controller
@RequestMapping("/help")
public class HelpController {
	
	@Autowired
	private HelpService helpService;
	
	@Admin //로그인해야 게시판 보이게 설정한 것
	@RequestMapping("")
	// int타입은 defaultValue에 값을 넣어줘야 사용가능함
	public String helpIndex(@RequestParam(value="searchCondition", required=true, defaultValue="1")int searchCondition, 
							@RequestParam(value="searchKeyword", required=true, defaultValue="")String searchKeyword, Model model) {

		// 고객센터 목록
		List<HelpVo> list = helpService.getList(searchCondition, searchKeyword);
		model.addAttribute("list", list);
		
		// 고객센터 총 게시물 수
		//Long listCount=helpService.helpSum();
		//model.addAttribute("listCount", listCount);
		
		return "help/helpMain";
	}
	
	@Admin
	@RequestMapping("/view")
	public String helpView(@RequestParam(value="no", required=true, defaultValue="")Long no, Model model ){
//  public 리턴타입명   메서드이름       (@RequestParam은 jsp에서  값을 받아 쓸때 사용하고 괄호안 메서드에서 사용할 파라미터의 타입과 이름을 적는다, 받아올 값의 이름을 value에 쓴다, DB에 있는 값을 jsp로 넘기기 위해서 Model을 사용){ 
		
		model.addAttribute("view", helpService.getView(no));
		// 아래 두줄을 줄여서 위에 한줄로 작성 가능
		// Map<String, Object> map = helpService.getView(no);
		// model.addAttribute("view", map);
				
		return "help/helpView";
	}
}
