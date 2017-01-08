package com.ff.modeal.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.modeal.repository.UserDao;
import com.ff.modeal.vo.UserVo;

@Service
public class UserService {
	private static final int USER_PAGE=2; // 한페이지 유저수
	private static final int COUNT_PAGE=3; // 한번에 보여줄 페이지수

	@Autowired
	private UserDao userDao;

	//사용자 리스트
//	public List<UserVo> getListUser() {
//		return userDao.getList();
//	}
	public Map<String, Object> getListUser(String keyword, String filterCheck, int page){
		//사용자 리스트 
		List<UserVo> list=userDao.getList(keyword, filterCheck, page, USER_PAGE);
		
		long totalCount = userDao.userByKeywordCount(keyword, filterCheck); // 사용자가 검색 수 조회
		int last_page= (int)Math.ceil((double)totalCount/USER_PAGE); // 마지막 페이지수 
		int after_page= (int)Math.ceil((double)page/COUNT_PAGE)*COUNT_PAGE; // 출력되는 마지막 페이지
		int pre_page= after_page-COUNT_PAGE+1; //출력되는 첫번째 페이지 
		int next_page=after_page+1; // 페이지 전으로 돌아가기
		int before_page=pre_page-1; // 페이지 다음으로 확인
				
		//리스트 map에 저장
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("list", list);
		map.put("keyword", keyword);
		map.put("filterCheck", filterCheck);
		
		map.put("totalCount", totalCount);
		map.put("user_page", USER_PAGE);
		map.put("count_page", COUNT_PAGE);
		map.put("last_page", last_page);
		map.put("pre_page", pre_page);
		map.put("after_page", after_page);
		map.put("next_page", next_page);
		map.put("before_page", before_page);
		return map;
	}
	
	// 총 사용자
	public long userSum(){
		return userDao.userCount();
	}

	// 로그인 정보 가져오기(김영조)
	public UserVo login(String id, String password) {
		return userDao.getUserInfo(id, password);
	}
	
	//userID
	public String userID(Long no){
		return userDao.getUserID(no);
	}

}
