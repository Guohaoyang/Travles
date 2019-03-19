package com.aaa.service;

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
}
