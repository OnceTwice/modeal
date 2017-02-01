package com.ff.modeal.controller.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ff.modeal.dto.JSONResult;
import com.ff.modeal.service.app.UserAppService;
import com.ff.modeal.vo.UserVo;

@Controller
@RequestMapping("/userapp")
public class UserAppController {

	@Autowired
	private UserAppService userAppService;

	@ResponseBody
	@RequestMapping("/login")
	public JSONResult login(@RequestBody UserVo userVo) {
		return JSONResult.success(userAppService.login(userVo));
	}
	
	@ResponseBody
	@RequestMapping("/fbjoin")
	public void FBJoin(@RequestBody UserVo userVo) {
		userAppService.FBJoin(userVo);
	}

}
