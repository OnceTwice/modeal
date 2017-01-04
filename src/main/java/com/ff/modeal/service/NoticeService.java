package com.ff.modeal.service;

import java.io.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.multipart.*;

import com.ff.modeal.repository.*;
import com.ff.modeal.vo.*;

@Service
public class NoticeService {
	private static final String SAVE_PATH = "/cho/upload";
	private static final String URL = "/notice/images/";

	@Autowired
	private NoticeDao noticeDao;
	
	public List<NoticeVo> getMessageList() {		// 리스트 단순 출력
		return noticeDao.getList();
	}
	
	public int writeMessage(NoticeVo noticeVo) {	// 글쓰기
		return noticeDao.insert(noticeVo);
	}
	
	public int deleteMessage(NoticeVo noticeVo) {
		return noticeDao.delete(noticeVo);
	}
	
	public NoticeVo getMessage(Long no) {
		NoticeVo noticeVo = noticeDao.get(no);
		
		return noticeVo;
	}
	
	public int updateMessage(NoticeVo noticeVo) {
		return noticeDao.update(noticeVo);
	}
	
}
