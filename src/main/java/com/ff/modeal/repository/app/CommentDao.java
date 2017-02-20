package com.ff.modeal.repository.app;

import java.util.*;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.ff.modeal.vo.app.*;

@Repository("commentappdao")
public class CommentDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<CommentVo> getList() {			// 댓글 리스트 출력
		return sqlSession.selectList("comment.getList");
	}
	
	// 댓글 리스트 입력
	
}
