package com.ff.modeal.controller.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ff.modeal.service.app.HelpAppService;
import com.ff.modeal.vo.HelpVo;


@Controller
@RequestMapping("/helpapp")
public class HelpAppContoller {
	
	@Autowired
	private HelpAppService helpService;
	
	@ResponseBody
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void helpInsert(
			@RequestParam(value="title", required=true, defaultValue="")String title,
			@RequestParam(value="complain", required=true, defaultValue="")String complain,
			@RequestParam(value="userNo", required=true, defaultValue="")Long usersNo
			){
		HelpVo helpVo = new HelpVo();
		helpVo.setTitle(title);
		helpVo.setUsersNo(usersNo);
		helpVo.setComplain(complain);
		
		helpService.helpInsert(helpVo);
	}

}
