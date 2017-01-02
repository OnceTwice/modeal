package com.ff.modeal.service;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.ff.modeal.repository.*;
import com.ff.modeal.vo.*;

@Service
public class NoticeService {

	@Autowired
	private NoticeDao noticeDao;
	
	public List<NoticeVo> getMessageList() {		// 리스트 단순 출력
		return noticeDao.getList();
	}
	
	public int writeMessage(NoticeVo noticeVo) {	// 글쓰기
		return noticeDao.insert(noticeVo);
	}
}
