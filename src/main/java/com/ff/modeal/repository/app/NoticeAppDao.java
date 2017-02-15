package com.ff.modeal.repository.app;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ff.modeal.vo.NoticeVo;

@Repository
public class NoticeAppDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<NoticeVo> NoticeList(){
		return sqlSession.selectList("notice.getAppList");
	}

}
