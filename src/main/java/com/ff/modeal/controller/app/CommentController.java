package com.ff.modeal.controller.app;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.ff.modeal.dto.*;
import com.ff.modeal.service.app.*;

@Controller
@RequestMapping("/commentapp")
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	@ResponseBody
	@RequestMapping("/list")
	public JSONResult list() {
		
//		List<CommentVo> list = commentService.getAllComments();
		
		System.out.println("tqtqtqtqt");
		System.out.println("출력은요!!!" + commentService.getAllComments());
		
		return JSONResult.success(commentService.getAllComments());
		
//		List<CommentVo> list = commentService.getAllComments();
//		
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("result", "success");
//		map.put("data", list);
//		
//		return map;
	}

}
