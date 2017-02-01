package com.ff.modeal.controller.app;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ff.modeal.dto.JSONResult;
import com.ff.modeal.service.app.ItemService;
import com.ff.modeal.vo.ItemVo;

@Controller
@RequestMapping("/list")
public class ItemController {

	@Autowired
	ItemService itemService;
	
	//검색리스트 넘기기
	@ResponseBody
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public Object searchList(Model model){
		
		List<ItemVo> list = itemService.SearchList();
		model.addAttribute("list",list);
		
		return JSONResult.success(list);
	}
	
	//검색결과 리스트 출력
	@ResponseBody
	@RequestMapping(value="/resultsearch", method=RequestMethod.POST)
	public Object resultSearchList(@RequestBody(required=true)ItemVo itemVo, Model model){
		
	
		List<Map<String, Object>> map = itemService.GetResultList(itemVo.getName()); 
		model.addAttribute("map",map);
		
		System.out.println(map);
		return JSONResult.success(map);
	}
}
