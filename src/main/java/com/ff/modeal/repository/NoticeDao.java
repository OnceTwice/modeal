package com.ff.modeal.repository;

import java.util.*;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.ff.modeal.vo.*;

@Repository
public class NoticeDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<NoticeVo> getList(String keyword, Integer page, Integer size) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("keyword", keyword);
		map.put("page", page);
		map.put("size", size);
		
		return sqlSession.selectList("notice.getList", map);
	}
}
