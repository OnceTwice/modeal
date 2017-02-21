package com.ff.modeal.controller.app;

import java.util.*;

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
	public JSONResult list(@RequestBody Map<String, Object> map) {
		return JSONResult.success(commentService.getAllComments( (Integer)map.get("shopNo"))  );
	}
}
