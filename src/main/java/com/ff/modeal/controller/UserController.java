package com.ff.modeal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ff.modeal.security.Admin;
import com.ff.modeal.service.UserService;
import com.ff.modeal.vo.UserVo;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Admin
	@RequestMapping("")
	public String userIndex(Model model){		
		/*
		List<UserVo> list = userService.getUserList();
		model.addAttribute("list", list);
		*/
		return "user/userMain";
	}
	
	
}
