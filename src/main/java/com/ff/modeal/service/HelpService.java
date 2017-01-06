package com.ff.modeal.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.modeal.repository.HelpDao;
import com.ff.modeal.vo.HelpVo;

@Service
public class HelpService {
	
	@Autowired
	private HelpDao helpDao;

	// 고객센터 목록
	public List<HelpVo> getList(int searchCondition, String searchKeyword){
		return helpDao.getList(searchCondition, searchKeyword);
	}
	
	// 고객센터 상세페이지
	public Map<String, Object> getView(Long no){
		return helpDao.getView(no);
	}

	// 고객센터 총 게시물 수
//	public long helpSum(){
//		return helpDao.listCount();
//	}
	
}
