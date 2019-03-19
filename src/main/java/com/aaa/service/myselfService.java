package com.aaa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.myselfDao;
import com.aaa.entity.city;
import com.aaa.entity.comemessage;
import com.aaa.entity.scenicspots;
import com.aaa.entity.travelnotes;
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
	
	public Integer addAttention(Integer uid,Integer usid){
		return md.addAttention(uid, usid);
	}
	
	public Integer delAttention(Integer uid,Integer usid){
		return md.delAttention(uid, usid);
	}
	
	public List<travelnotes> querytrave(Integer uid){
		return md.querytrave(uid);
	}
	
	public void edit(tusers tt){
		md.edit(tt);
	}
	
	public List<comemessage> querycome(Integer uid){
		return md.querycome(uid);
	}
	
	public List<Map<String,Object>> queryCollect(Integer uid){
		return md.queryCollect(uid);
	}
	
	public Integer delCollect(Integer tid,Integer uid){
		return md.delCollect(tid, uid);
	}
	
	public List<Map<String,Object>> queryChange(){
		return md.queryChange();
	}
}


