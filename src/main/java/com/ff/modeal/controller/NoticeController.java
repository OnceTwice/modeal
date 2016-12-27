package com.ff.modeal.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/notice")
public class NoticeController {
	
//	@Autowired
//	private NoticeService noticeService;
	
	@RequestMapping("")
	public String index() {
		
		return "notice/index";
	}
}
