package com.ff.modeal.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.modeal.repository.StatsDao;

@Service
public class StatsService {
	
	@Autowired
	private StatsDao statsDao;
	
	public List<Map<String, Object>> getgenderCount(){
		List<Map<String, Object>> list = statsDao.getgenderCount();
		return list;
	}
	
	public List<Map<String, Object>> getAgeCount(){
		List<Map<String, Object>> list = statsDao.getAgeCount();
		return list;
	}
	public List<Map<String, Object>> getLocationCount(){
		List<Map<String, Object>> list = statsDao.getLocationCount();
		return list;
	}
	

}
