package com.aaa.dao;

import java.util.List;



import org.apache.ibatis.annotations.Mapper;

import com.aaa.entity.city;

@Mapper
public interface CityDao {

	
	public List<city> queryCity();
	
	public List<city> queryChina();
	
	public List<city> queryChinaDesc();
	
	public List<city> queryIndonesia();//查询印度尼西亚
	
	public List<city> queryIndia();//查询印度
	
	public List<city> queryVietnam();//查询越南
	
	public List<city> queryNepal();//查询尼泊尔
	
	public List<city> queryJapan();//查询日本
	
	public List<city> queryMalaysia();//查询马来西亚
	
	public List<city> queryItaliana();//意大利
	
	public List<city> queryUK();//英国
	
	public List<city> queryDeutschland();//德国
	
	public List<city> queryFrance();//法国
	
	public List<city> queryReino();//西班牙
	
	public List<city> querySwitzerland();//瑞士
}
