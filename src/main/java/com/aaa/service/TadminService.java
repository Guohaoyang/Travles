package com.aaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.TadminDao;
import com.aaa.entity.city;
import com.aaa.entity.tadmin;

@Service
public class TadminService {
	
	@Autowired
	TadminDao td;
	public List<tadmin> login(String tname,String tpwd){
		return td.login(tname,tpwd);
	}
	public List<city> queryCity(){
		return td.queryCity();
	}
	public tadmin queryByName(String name){
		return td.queryByName(name);
	}
}
