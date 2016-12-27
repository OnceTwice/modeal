package com.ff.modeal.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.ff.modeal.repository.*;

@Service
public class NoticeService {

	@Autowired
	private NoticeDao noticeDao;
	
	
}
