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
	
	public List<CommentVo> getAllComments(Integer shopNo) {
		return commentDao.getList(shopNo);
	}
}
