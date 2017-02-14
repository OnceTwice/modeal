package com.ff.modeal.service.app;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.modeal.repository.app.BookmarkDao;

@Service
public class BookmarkService {

	@Autowired
	private BookmarkDao bookmarkDao;

	public void addBookmark(Long itemNo, Long userNo) {
		bookmarkDao.addBookmark(itemNo, userNo);
	}

	public void deleteBookmark(Long itemNo, Long userNo) {
		bookmarkDao.deleteBookmark(itemNo, userNo);
	}

	public Long selectBookmark(Long itemNo, Long userNo) {
		return bookmarkDao.selectBookmark(itemNo, userNo);
	}

	public List<Map<String, Object>> list(Long userNo) {
		return bookmarkDao.list(userNo);
	}
}
