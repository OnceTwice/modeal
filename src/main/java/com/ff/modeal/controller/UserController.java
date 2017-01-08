package com.ff.modeal.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ff.modeal.service.CommentService;
import com.ff.modeal.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private CommentService commentService;
	
	//@Admin
	@RequestMapping("")
	public String userIndex(
			@RequestParam(value="kwd", required=true, defaultValue="") String keyword,
			@RequestParam(value="filterCheck", required=true, defaultValue="1") String filterCheck,
			@RequestParam(value="page", required=true, defaultValue="1") int page,
			Model model){		
		
		//사용자 리스트 
//		List<UserVo> list = userService.getListUser();
//		model.addAttribute("list", list);
		Map<String, Object> map = userService.getListUser(keyword, filterCheck, page);
		model.addAttribute("map", map);
		
		
		
		//총 가입자수 
		Long usercount=userService.userSum();
		model.addAttribute("usercount",usercount);
		
		return "user/userMain";
	}
	
	//@Admin
	@RequestMapping("/view")
	public String usereach(
			@RequestParam(value="no",required=true) Long no,
			Model model){

		//사용자 ID 출력
		String userID=userService.userID(no);
		model.addAttribute("userID",userID);
				
		//사용자 댓글 작성 리스트
		List<Map<String,Object>> list= commentService.getCommentsByID(no);
		model.addAttribute("list",list);
		
		return "user/each";
	}
	
}
