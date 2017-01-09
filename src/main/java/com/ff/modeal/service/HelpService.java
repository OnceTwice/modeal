package com.ff.modeal.service;

import java.util.HashMap;
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

	// 총 리스트 수
	public long helpListCount() {
		return helpDao.helpListCount();
	}
	
	// 고객센터 리스트
	public Map<String, Object> helpList(int searchCondition, String searchKeyword) {
		List<HelpVo> list = helpDao.helpList(searchCondition, searchKeyword);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		map.put("searchCondition", searchCondition);
		map.put("searchKeyword", searchKeyword);
		return map;
	}
	
	// 뷰 페이지
	public Map<String, Object> helpView(Long no) {
		return helpDao.helpView(no);
	}
}
