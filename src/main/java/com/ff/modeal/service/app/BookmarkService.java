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

	public void addBookmark(Long itemNo, Long userNo, Long shopNo) {
		bookmarkDao.addBookmark(itemNo, userNo, shopNo);
	}

	public void deleteBookmark(Long itemNo, Long userNo, Long shopNo) {
		bookmarkDao.deleteBookmark(itemNo, userNo, shopNo);
	}

	public Long selectBookmark(Long itemNo, Long userNo, Long shopNo) {
		return bookmarkDao.selectBookmark(itemNo, userNo, shopNo);
	}

	public List<Map<String, Object>> list(Long userNo) {
		return bookmarkDao.list(userNo);
	}
}
