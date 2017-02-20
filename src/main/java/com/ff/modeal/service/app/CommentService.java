package com.ff.modeal.service.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ff.modeal.vo.app.CommentVo;

@Service("commentappservice")
public class CommentService {
	public List<CommentVo> getAllComments() {
		List<CommentVo> list = new ArrayList<CommentVo>();
		
		CommentVo comment = new CommentVo();
		comment.setNo(1L);
		comment.setContent("싸요싸요!!!");
		comment.setGrade(3L);
		comment.setShopNo(2L);
		comment.setUserNo(2L);
		list.add(comment);
		
		comment = new CommentVo();
		comment.setNo(2L);
		comment.setContent("많아요많아요!!!");
		comment.setGrade(5L);
		comment.setShopNo(1L);
		comment.setUserNo(1L);
		list.add(comment);
		
		return list;
	}
}
