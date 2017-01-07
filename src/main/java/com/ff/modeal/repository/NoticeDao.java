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
	
	public List<NoticeVo> getList(String keyword, int categoryNo, int searchNo, int page, int size) {		// 카테고리, 키워드를 포함한 리스트(글) 출력
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("categoryNo", categoryNo);
		map.put("keyword", keyword);
		map.put("searchNo", searchNo);
		
		map.put("page", page);
		map.put("size", size);
		
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
	
	public int getTotalCount(String keyword, int categoryNo, int searchNo) {		// 페이징을 하기 위한 총 글 갯수
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("keyword", keyword);
		map.put("categoryNo", categoryNo);
		map.put("searchNo", searchNo);
		
		return sqlSession.selectOne("notice.getTotalCount", map);
	}
}
