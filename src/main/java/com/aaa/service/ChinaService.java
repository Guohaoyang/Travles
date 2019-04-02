package com.aaa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.ChinaDao;
import com.aaa.entity.city;
import com.aaa.entity.scenicspots;

@Service
public class ChinaService {

	@Autowired
	ChinaDao  cdao;
	//推荐北京
	public List<Map<String, Object>> queryBeijing(){
		return cdao.queryBeijing();
	}
	//推荐香港
	public List<Map<String, Object>> queryDali(){
		return cdao.queryDali();
	}
	//推荐西安
	public List<Map<String,Object>> queryXiAn(){
		return cdao.queryXiAn();
	}
	//推荐所有的城市
	public List<city> queryCities(){
		return cdao.queryCities();
	}
	//雨天
	public List<scenicspots> queryByRain(){
		return cdao.queryByRain();
	}
	//浪漫
	public List<scenicspots> queryByRomantic(){
		return cdao.queryByRomantic();
	}
	//探险
	public List<scenicspots> queryByExplore(){
		return cdao.queryByExplore();
	}
	//游历
	public List<scenicspots> queryByTravel(){
		return cdao.queryByTravel();
	}
	public List<scenicspots> queryOne(){
		return cdao.queryOne();
	}
	
	public List<scenicspots> queryTwo(){
		return cdao.queryTwo();
	}
	
	public List<scenicspots> queryThree(){
		return cdao.queryThree();
	}
	
	public List<scenicspots> queryFour(){
		return cdao.queryFour();
	}
	
	public List<scenicspots> queryFive(){
		return cdao.queryFive();
	}
	
	public List<scenicspots> querySix(){
		return cdao.querySix();
	}
	
	public List<scenicspots> querySeven(){
		return cdao.querySeven();
	}
	
	public List<scenicspots> queryEight(){
		return cdao.queryEight();
	}
	
	public List<scenicspots> queryNine(){
		return cdao.queryNine();
	}
	
	public List<scenicspots> queryTen(){
		return cdao.queryTen();
	}
	
	public List<scenicspots> queryEleven(){
		return cdao.queryEleven();
	}
	
	public List<scenicspots> queryTwelve(){
		return cdao.queryTwelve();
	}
	//根据国家名查询国家所有信息
	public scenicspots queryBySsname(String ssname){
		return cdao.queryBySsname(ssname);
	}
	//根据景点名字查询景点详细信息
	public city queryByCitys(Integer cid){
		return cdao.queryByCitys(cid);
	}
	//根据城市ID查询所有景点信息
	public List<Map<String,Object>> queryScenicspotspic(Integer cid){
		return cdao.queryScenicspotspic(cid);
	}
	//模糊查询
	public List<Map<String,Object>> queryCitysMH(String cname){
		return cdao.queryCitysMH(cname);
	}
	
	//结伴信息
	public List<Map<String,Object>> queryCompany(Integer cid){
		return cdao.queryCompany(cid);
	}
	//游记信息
	public List<Map<String,Object>> queryTravelnotes(String ssname){
		return cdao.queryTravelnotes(ssname);
	}
	//行程
	public List<Map<String,Object>> queryOned(Integer days,Integer tid ){
		return cdao.queryOned(days,tid);
	}
	
	public int querydays(){
		return cdao.querydays();
	}
	
}
