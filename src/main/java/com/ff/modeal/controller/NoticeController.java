package com.ff.modeal.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.*;

import com.ff.modeal.service.*;
import com.ff.modeal.vo.*;

@Controller
@RequestMapping("/notice")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;

	// @Admin
	@RequestMapping("")
	public String list(@RequestParam(value = "kwd", required = true, defaultValue = "") String keyword,
			@RequestParam(value = "categoryNo", required = true, defaultValue = "4") int categoryNo,
			@RequestParam(value = "searchNo", required = true, defaultValue = "1") int searchNo,
			@RequestParam(value = "p", required = true, defaultValue = "1") int page, Model model) {
		// List<NoticeVo> list = noticeService.getMessageList();
		Map<String, Object> map = noticeService.getMessageList(keyword, categoryNo, searchNo, page);

		model.addAttribute("map", map);

		return "notice/index";
	}

	// @Admin
	@RequestMapping("/write") // index.jsp 삭제 버튼 default값=GET방식,
								// RequestMapping에서의 default값=Get방식
	public String write() {
		return "notice/write";
	}

	// @Admin
	@RequestMapping(value = "/write", method = RequestMethod.POST) // write.jsp에서
																	// form태그
																	// method값=POST
	public String write(@ModelAttribute NoticeVo vo) {
		noticeService.writeMessage(vo);

		return "redirect:/notice";
	}

	// @Admin
	@RequestMapping("/delete")
	public String delete(@ModelAttribute NoticeVo vo) {
		noticeService.deleteMessage(vo);

		return "redirect:/notice";
	}

	@RequestMapping("/view")
	public String view(@RequestParam(value = "no", required = true) Long no, Model model) {
		NoticeVo noticeVo = noticeService.getMessage(no);
		model.addAttribute("noticeVo", noticeVo); // view.jsp에 보내주는 변수 noticeVo

		return "notice/view";
	}

	// @Admin
	@RequestMapping("/modify")
	public String modify(@RequestParam(value = "no", required = true) Long no, Model model) {
		NoticeVo noticeVo = noticeService.getMessage(no); // 데이터를 가지고 옴
		model.addAttribute("noticeVo", noticeVo); // modify.jsp에 보내주는 변수
													// noticeVo

		return "notice/modify";
	}

	// @Admin
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modify(@ModelAttribute NoticeVo vo) {
		noticeService.updateMessage(vo);

		return "redirect:/notice";
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String upload(@ModelAttribute NoticeVo noticeVo, @RequestParam("file") MultipartFile multipartFile) {
		noticeService.restore(noticeVo, multipartFile);

		return "redirect:/notice";
	}
}
