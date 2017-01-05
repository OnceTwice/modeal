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
	
//	public List<NoticeVo> getList() {		// 리스트 단순 출력
//		return sqlSession.selectList("notice.getList");
//	}
	
	public List<NoticeVo> getList(String keyword, int categoryNo, int searchNo) {		// 카테고리, 키워드를 포함한 리스트 출력
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("categoryNo", categoryNo);
		map.put("keyword", keyword);
		map.put("searchNo", searchNo);
		
		return sqlSession.selectList("notice.getList", map);
	}
	
	public int insert(NoticeVo noticeVo) {	// 글쓰기
		return sqlSession.insert("notice.insert", noticeVo);
	}
	
	public int delete(NoticeVo noticeVo) {
		return sqlSession.delete("notice.delete", noticeVo);
	}
	
	public NoticeVo get(Long no) {
		return sqlSession.selectOne("notice.getByNo", no);
	}
	
	public int update(NoticeVo noticeVo) {
		return sqlSession.update("notice.update", noticeVo);
	}
}
