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
	
	
	public void insert(NoticeVo vo) {
		
	}
	
	public void update(NoticeVo vo) {
		
	}
	
	public void delete(NoticeVo vo) {
		
	}
	
	public List<NoticeVo> getList(String keyword, Integer page, Integer size) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		return sqlSession.selectList("notice.getList", map);
	}
}
