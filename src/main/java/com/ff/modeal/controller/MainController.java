package com.ff.modeal.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
	
	@RequestMapping("")
	public String hello() {
		return "main/main";
	}
}
