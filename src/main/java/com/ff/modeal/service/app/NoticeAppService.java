package com.ff.modeal.service.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.modeal.repository.app.NoticeAppDao;
import com.ff.modeal.vo.NoticeVo;

@Service
public class NoticeAppService {
	
	@Autowired
	private NoticeAppDao noticeAppDao;
	
	public List<NoticeVo> NoticeList(){
		
		return noticeAppDao.NoticeList();
	}

}
