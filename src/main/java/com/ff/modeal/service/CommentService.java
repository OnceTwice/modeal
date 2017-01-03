package com.ff.modeal.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.modeal.repository.CommentDao;

@Service
public class CommentService {

	@Autowired
	private CommentDao commentDao;
	
	public List<Map<String,Object>> getCommentsByID(Long no){
		return commentDao.commentByID(no);
	}
	
}
