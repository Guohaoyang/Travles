package com.aaa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.ContinectDao;
import com.aaa.entity.city;
import com.aaa.entity.continect;
import com.aaa.entity.tusers;

@Service
public class ContinectService {

	@Autowired
	ContinectDao cont;
	
	//所有大洲
	public List<continect> Allzo()
	{
		return cont.Allzo();
	}
	//城市
	public List<city> Allcs()
	{
		return cont.Allcs();
	}
	//攻略
	public List<Map<String,Object>> gl()
	{
		return cont.gl();
	}
	//按城市查
	public List<Map<String,Object>> glBayCtity(String Cname)
	{
		return cont.glBayCtity(Cname);
	}
	//形成详情
	public List<Map<String,Object>> glS(Integer in)
	{
		return cont.strategyS(in);
	}
	//行程目的地分页
	public List<city> page(Integer pageNum, Integer pageSize)
	{
		if (null == pageSize) {
			pageSize = 5;
		}

		if (null == pageNum) {
			pageNum = 1;
		}
		Integer offset=(pageNum-1) * pageSize;
		return cont.page(offset, pageSize);
	}
	//查总数
	public Integer num()
	{
		
		return cont.num();
	}
}
