package com.ff.modeal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.modeal.repository.HelpDao;
import com.ff.modeal.vo.HelpVo;

@Service
public class HelpService {
	
	@Autowired
	private HelpDao helpDao;

	public List<HelpVo> list(){
		return helpDao.list();
	}
	
}
