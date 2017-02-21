package com.ff.modeal.controller.app;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.ff.modeal.dto.*;
import com.ff.modeal.service.app.*;
import com.ff.modeal.vo.app.*;

@Controller
@RequestMapping("/commentapp")
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	@ResponseBody
	@RequestMapping("/list")
	public JSONResult list(@RequestParam(value="shopNo") Integer shopNo) {
		return JSONResult.success(commentService.getAllComments(shopNo));
	}
	
	@ResponseBody
	@RequestMapping("/add")
	public JSONResult add(@RequestBody CommentVo commentVo) {
		JSONResult.success(commentService.addComment(commentVo));
		return JSONResult.success(commentService.getAllComments(commentVo.getShopNo().intValue()));
	}
}
