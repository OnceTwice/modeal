package com.ff.modeal.controller.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ff.modeal.dto.JSONResult;
import com.ff.modeal.service.app.NoticeAppService;
import com.ff.modeal.vo.NoticeVo;

@Controller
@RequestMapping("/noticeapp")
public class NoticeAppContorller {
	
	@Autowired
	private NoticeAppService noticeAppService;
	
	@ResponseBody
	@RequestMapping(value="", method = RequestMethod.GET)
	public JSONResult NoticeList(){
		
		List<NoticeVo> list = noticeAppService.NoticeList();
	
		return JSONResult.success(list);
	}

}
