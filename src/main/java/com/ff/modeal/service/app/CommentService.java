package com.ff.modeal.service.app;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.ff.modeal.repository.app.*;
import com.ff.modeal.vo.app.*;

@Service("commentappservice")
public class CommentService {
	
	@Autowired
	private CommentDao commentDao;
	
	public List<CommentVo> getAllComments() {
//		List<CommentVo> list = new ArrayList<CommentVo>();
		
//		CommentVo comment = new CommentVo();
		
		return commentDao.getList();
		
//		comment.setNo(1L);
//		comment.setContent("싸요싸요!!!");
//		comment.setGrade(3L);
//		comment.setShopNo(2L);
//		comment.setUserNo(2L);
//		list.add(comment);
//		
//		comment = new CommentVo();
//		comment.setNo(2L);
//		comment.setContent("많아요많아요!!!");
//		comment.setGrade(5L);
//		comment.setShopNo(1L);
//		comment.setUserNo(1L);
//		list.add(comment);
//		
//		comment = new CommentVo();
//		comment.setNo(3L);
//		comment.setContent("쪼아요쪼아요!!!");
//		comment.setGrade(4L);
//		comment.setShopNo(3L);
//		comment.setUserNo(3L);
//		list.add(comment);
//		
//		comment = new CommentVo();
//		comment.setNo(4L);
//		comment.setContent("몰라영몰라영!!!");
//		comment.setGrade(2L);
//		comment.setShopNo(5L);
//		comment.setUserNo(5L);
//		list.add(comment);
//		
//		comment = new CommentVo();
//		comment.setNo(5L);
//		comment.setContent("으아아아앙!!!");
//		comment.setGrade(1L);
//		comment.setShopNo(4L);
//		comment.setUserNo(4L);
//		list.add(comment);
//		
//		return list;
	}
}
