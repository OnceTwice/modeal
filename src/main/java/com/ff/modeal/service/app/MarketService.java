package com.ff.modeal.service.app;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.ff.modeal.repository.app.*;

@Service
public class MarketService {

	@Autowired
	private MarketDao marketDao;
	
	public Map<String, Object> marketDetail(Long no) {		// 매장 상세 정보
		return marketDao.marketDetail(no);
	}
}
