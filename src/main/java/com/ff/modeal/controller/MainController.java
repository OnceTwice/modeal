package com.ff.modeal.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
	
	@ResponseBody
	@RequestMapping("")
	public String hello() {
		return "안녕 jRevel";
	}
}
