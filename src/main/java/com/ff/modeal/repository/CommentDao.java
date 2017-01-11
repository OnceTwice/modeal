package com.ff.modeal.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommentDao {

	@Autowired
	private SqlSession sqlSession;
	
	// 각 사용자별 댓글 리스트 
	public List<Map<String,Object>> commentByID(Long no){
		return sqlSession.selectList("comment.commentsByID",no);
	}
	
	
}
