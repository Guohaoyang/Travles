package com.aaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.myselfDao;
import com.aaa.entity.city;
import com.aaa.entity.scenicspots;
import com.aaa.entity.tusers;

@Service
public class myselfService {
	@Autowired
	myselfDao md;
	
	public List<city> querycity(){
		return md.querycity();
	}
	
	public List<scenicspots> queryscenicspots(){
		return md.queryscenicspots();
	}
	
	public List<tusers> queryfans(Integer uid){
		return md.queryfans(uid);
	}
	
	public List<tusers> querydana(Integer uid){
		return md.querydana(uid);
	}
	
	public List<tusers> queryusers(Integer uid){
		return md.queryusers(uid);
	}
}


