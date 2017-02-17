package com.ff.modeal.repository.app;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ff.modeal.vo.HelpVo;

@Repository
public class HelpAppDao {

	@Autowired
	private SqlSession sqlSession;
	
	public void helpInsert(HelpVo helpVo){
		sqlSession.insert("help.appHelpInsert",helpVo);
	}
}
