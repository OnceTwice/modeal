package com.ff.modeal.controller.app;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ff.modeal.dto.JSONResult;
import com.ff.modeal.service.app.MainAppService;

@Controller
@RequestMapping("/mainapp")
public class MainAppController {

	@Autowired
	private MainAppService mainAppService;
	
	//메인출력
	@ResponseBody
	@RequestMapping(value="/list",  method = RequestMethod.POST)
	public JSONResult mainlist(@RequestParam(value="latitude") String latitude,
									@RequestParam(value="longitude") String longitude,
									@RequestParam(value="range") int range) { 
		
		List<Map<String, Object>> map = mainAppService.MainList(latitude, longitude, range);
		
		return JSONResult.success(map);
	}
	
	// 즐겨찾기 추가
	@ResponseBody
	@RequestMapping(value="/addbookmark", method=RequestMethod.POST)
	public void addBookmark(@RequestParam(value="itemNo") Long itemNo,
											@RequestParam(value="userNo") Long userNo) {
		mainAppService.addBookmark(itemNo, userNo);
	}
	
	// 즐겨찾기 삭제
	@ResponseBody
	@RequestMapping(value="/deletebookmark", method=RequestMethod.POST)
	public void deleteBookmark(@RequestParam(value="itemNo") Long itemNo,
											@RequestParam(value="userNo") Long userNo) {
		mainAppService.deleteBookmark(itemNo, userNo);
	}
	
	// 즐겨찾기 검색
	@ResponseBody
	@RequestMapping(value="/selectbookmark", method=RequestMethod.POST)
	public Long selectBookmark(@RequestParam(value="itemNo") Long itemNo,
											@RequestParam(value="userNo") Long userNo) {
		return mainAppService.selectBookmark(itemNo, userNo);
	}
}
