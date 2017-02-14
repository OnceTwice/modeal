package com.ff.modeal.controller.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ff.modeal.dto.JSONResult;
import com.ff.modeal.service.app.BookmarkService;

@Controller
@RequestMapping("/bookmarkapp")
public class BookmarkController {

	@Autowired
	private BookmarkService bookmarkService;

	// 즐겨찾기 추가
	@ResponseBody
	@RequestMapping(value = "/addbookmark", method = RequestMethod.POST)
	public void addBookmark(@RequestParam(value = "itemNo") Long itemNo, @RequestParam(value = "userNo") Long userNo) {
		bookmarkService.addBookmark(itemNo, userNo);
	}

	// 즐겨찾기 삭제
	@ResponseBody
	@RequestMapping(value = "/deletebookmark", method = RequestMethod.POST)
	public void deleteBookmark(@RequestParam(value = "itemNo") Long itemNo,
			@RequestParam(value = "userNo") Long userNo) {
		bookmarkService.deleteBookmark(itemNo, userNo);
	}

	// 즐겨찾기 검색
	@ResponseBody
	@RequestMapping(value = "/selectbookmark", method = RequestMethod.POST)
	public Long selectBookmark(@RequestParam(value = "itemNo") Long itemNo,
			@RequestParam(value = "userNo") Long userNo) {
		return bookmarkService.selectBookmark(itemNo, userNo);
	}

	// 즐겨찾기 리스트
	@ResponseBody
	@RequestMapping(value = "/listbookmark", method = RequestMethod.POST)
	public JSONResult list(@RequestParam(value = "userNo") Long userNo) {
		return JSONResult.success(bookmarkService.list(userNo));
	}
}
