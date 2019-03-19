package com.aaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.ScenicspotsDao;
import com.aaa.entity.scenicspots;

@Service
public class ScenicspotsService {

	@Autowired
	ScenicspotsDao sd;
	
	
	
	public List<scenicspots> queryBySname(scenicspots s){
		return sd.queryBySname(s);
	}
	
	public scenicspots queryBySsid(Integer ssid){
		return sd.queryBySsid(ssid);
	}
}
