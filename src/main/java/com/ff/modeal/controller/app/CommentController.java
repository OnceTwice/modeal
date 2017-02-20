package com.ff.modeal.controller.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ff.modeal.service.app.CommentService;
import com.ff.modeal.vo.app.CommentVo;

@Controller
@RequestMapping("/commentapp")
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	@ResponseBody
	@RequestMapping("/list")
	public Map<String, Object> list() {
		List<CommentVo> list = commentService.getAllComments();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", "success");
		map.put("data", list);
		
		return map;
	}

}
