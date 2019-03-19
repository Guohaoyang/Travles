package com.aaa.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.TusersDao;
import com.aaa.entity.tusers;

@Service
public class TuserService {

	@Autowired
	TusersDao user;
	//登录
	public List<tusers> login(String phone,String upwd)
	{
		return user.login(phone, upwd);
	}
	
	
	//注册
	public Integer Register(tusers us)
	{
		return user.Register(us);
	}
	//查账号
	public List<tusers> Pexist(String phone)
	{
		return user.Pexist(phone);
	}
}
