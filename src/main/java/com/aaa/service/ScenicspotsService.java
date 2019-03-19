package com.aaa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.ScenicspotsDao;
import com.aaa.entity.scenicspots;

@Service
public class ScenicspotsService {

	@Autowired
	ScenicspotsDao sd;
	
	
	public scenicspots queryBySsid(Integer ssid){
		return sd.queryBySsid(ssid);
	}
}
