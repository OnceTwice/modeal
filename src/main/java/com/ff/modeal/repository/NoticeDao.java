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
	
	public List<NoticeVo> getList() {		// 리스트 단순 출력
		return sqlSession.selectList("notice.getList");
	}
	
	public int insert(NoticeVo noticeVo) {	// 글쓰기
		return sqlSession.insert("notice.insert", noticeVo);
	}
}
