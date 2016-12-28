package com.ff.modeal.service;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.ff.modeal.repository.*;
import com.ff.modeal.vo.*;

@Service
public class NoticeService {
	private static final int LIST_SIZE = 5;		// 리스팅되는 게시물의 수

	@Autowired
	private NoticeDao noticeDao;
	
	public Map<String, Object> getMessageList(int page, String keyword) {
		List<NoticeVo> list = noticeDao.getList(keyword, page, LIST_SIZE);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		return map;
	}
}
