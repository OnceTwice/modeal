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

	// 고객센터 목록
	public List<HelpVo> getList(){
		return helpDao.getList();
	}
//	
//	// 고객센터 총 게시물 수
//	public long helpSum(){
//		return helpDao.helpCount();
//	}
	
}
