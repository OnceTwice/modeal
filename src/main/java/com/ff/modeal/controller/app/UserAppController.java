package com.ff.modeal.controller.app;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.ff.modeal.service.app.*;
import com.ff.modeal.vo.*;

@Controller
@RequestMapping("/userapp")
public class UserAppController {

	@Autowired
	private UserAppService userAppService;

	@ResponseBody
	@RequestMapping("/login")
	public UserVo login(@RequestBody UserVo userVo) {
		return userAppService.login(userVo);
	}
	
	@ResponseBody
	@RequestMapping("/fbjoin")
	public void FBJoin(@RequestBody UserVo userVo) {
		userAppService.FBJoin(userVo);
	}

}
