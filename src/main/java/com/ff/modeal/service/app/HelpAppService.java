package com.ff.modeal.service.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.modeal.repository.app.HelpAppDao;
import com.ff.modeal.vo.HelpVo;

@Service
public class HelpAppService {

	@Autowired
	private HelpAppDao helpDao;
	
	public void helpInsert(HelpVo helpVo){
		helpDao.helpInsert(helpVo);
	}
}
