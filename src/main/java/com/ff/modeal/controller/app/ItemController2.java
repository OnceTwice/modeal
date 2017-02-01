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
import com.ff.modeal.service.app.ItemService2;
import com.ff.modeal.vo.ItemVo;

@Controller
@RequestMapping("/list")
public class ItemController2 {

	@Autowired
	ItemService2 itemService;
	
	@ResponseBody
	@RequestMapping(value="", method=RequestMethod.POST)
	public JSONResult list(@ModelAttribute ItemVo itemVo) {
		
		List<ItemVo> list = itemService.getAllItmes();
		
		System.out.println(itemVo);
		return JSONResult.success(list);
	}	

	// 해당 매장의 상품 목록	
	@ResponseBody
	@RequestMapping(value="/shopItemList", method=RequestMethod.POST)
	public JSONResult shopItemList(@RequestParam(value="no") Long shopNo){
		System.out.println(shopNo);
//		List<Map<String, Object>> map = itemService.shopItemList(shopNo);
		System.out.println(itemService.shopItemList(shopNo));
		return JSONResult.success(itemService.shopItemList(shopNo));
	}
}
