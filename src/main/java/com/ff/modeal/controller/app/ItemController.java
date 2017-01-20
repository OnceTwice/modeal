package com.ff.modeal.controller.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ff.modeal.dto.JSONResult;
import com.ff.modeal.service.app.ItemService;
import com.ff.modeal.vo.ItemVo;

@Controller
@RequestMapping("/list")
public class ItemController {

	@Autowired
	ItemService itemService;
	
	@ResponseBody
	@RequestMapping(value="", method=RequestMethod.POST)
	public JSONResult list(@RequestParam(value="name", required=true, defaultValue="")String name,
							@RequestParam(value="ori_price", required=true, defaultValue="0")int ori_price) {
		
		List<ItemVo> list = itemService.getAllItmes();
		
		System.out.println(name + ori_price);
		return JSONResult.success(list);
	}	
}
