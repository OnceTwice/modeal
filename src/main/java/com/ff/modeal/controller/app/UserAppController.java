package com.ff.modeal.controller.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ff.modeal.dto.Gmail;
import com.ff.modeal.dto.TemporaryPassword;
import com.ff.modeal.service.app.UserAppService;
import com.ff.modeal.vo.UserVo;

@Controller
@RequestMapping("/userapp")
public class UserAppController {

	@Autowired
	private UserAppService userAppService;

	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public UserVo login(@RequestBody UserVo userVo) {
		return userAppService.login(userVo);
	}

	@ResponseBody
	@RequestMapping(value = "/social", method = RequestMethod.POST)
	public void SocialJoin(@RequestBody UserVo userVo) {
		userAppService.SocialJoin(userVo);
	}

	@ResponseBody
	@RequestMapping(value = "/findpw", method = RequestMethod.POST)
	public UserVo findPW(@RequestParam(value = "email", required = true, defaultValue = "") String email) {
		UserVo userVo = userAppService.findPW(email);
		if (userVo != null) {
			if (userVo.getManagerIdentified() == 3 || userVo.getManagerIdentified() == 4) {
				return null;
			}
			String password = TemporaryPassword.temporaryPassword(8); // 임시비밀번호생성
			userAppService.changePassword(email, password);
			Gmail.sendMail(userVo, password);
		}
		return userVo;
	}
}
