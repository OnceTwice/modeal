package com.ff.modeal.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.ff.modeal.security.*;
import com.ff.modeal.service.*;
import com.ff.modeal.vo.*;

@Controller
@RequestMapping("/notice")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
//	@Admin
	@RequestMapping("")
	public String list(Model model) {
		List<NoticeVo> list = noticeService.getMessageList();
		model.addAttribute("list", list);
		
		return "notice/index";
	}
	
//	@Admin
	@RequestMapping("/write")
	public String write() {
		return "notice/write";
	}
	
//	@Admin
	@RequestMapping("delete")
	public String delete() {
		return "notice/delete";
	}
}
