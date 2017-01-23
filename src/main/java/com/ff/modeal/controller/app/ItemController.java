package com.ff.modeal.controller.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public JSONResult list(@ModelAttribute ItemVo itemVo) {
		
		List<ItemVo> list = itemService.getAllItmes();
		
		System.out.println(itemVo);
		return JSONResult.success(list);
	}	
}
