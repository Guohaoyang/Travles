package com.aaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.backDao;
import com.aaa.entity.tadmin;

@Service
public class backService {
	@Autowired
	backDao bd;
	public tadmin query(Integer tid){
		return bd.query(tid);
	}
	
	public List<tadmin> queryTadmin(){
		return bd.queryTadmin();
	}
	
	public Integer editMyself(tadmin t){
		return bd.editMyself(t);
	}
	
	public Integer delAdmin(Integer tid){
		return bd.delAdmin(tid);
	}
	
	public Integer addAdmin(tadmin t){
		return bd.addAdmin(t);
	}
}
