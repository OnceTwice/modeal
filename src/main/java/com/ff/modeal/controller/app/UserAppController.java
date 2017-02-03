package com.ff.modeal.controller.app;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ff.modeal.service.app.UserAppService;
import com.ff.modeal.vo.UserVo;

@Controller
@RequestMapping("/userapp")
public class UserAppController {

	@Autowired
	private UserAppService userAppService;

	@ResponseBody
	@RequestMapping("/login")
	public UserVo login(@RequestBody UserVo userVo) {
		System.out.println(userAppService.login(userVo));
		return userAppService.login(userVo);
	}
	
	@ResponseBody
	@RequestMapping("/fbjoin")
	public void FBJoin(@RequestBody UserVo userVo) {
		System.out.println("facebook" + userVo);
		userAppService.FBJoin(userVo);
	}

}
