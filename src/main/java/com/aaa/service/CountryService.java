package com.aaa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.CountryDao;
import com.aaa.entity.city;
import com.aaa.entity.country;
import com.aaa.entity.scenicspots;

@Service
public class CountryService {

	@Autowired
	CountryDao countrys;
	
	public List<country> queryAsia(){
		return countrys.queryAsia();
	}
	
	public List<country> queryAmerica(){
		return countrys.queryAmerica();
	}
	
	public List<country> queryEurope(){
		return countrys.queryEurope();
	}
	
	public List<country> queryOceania(){
		return countrys.queryOceania();
	}
	
	public List<scenicspots> queryByRain(){
		return countrys.queryByRain();
	}
	
	public List<scenicspots> queryByRomantic(){
		return countrys.queryByRomantic();
	}
	
	public List<scenicspots> queryByExplore(){
		return countrys.queryByExplore();
	}
	
	public List<scenicspots> queryByTravel(){
		return countrys.queryByTravel();
	}
	
	public List<scenicspots> queryOne(){
		return countrys.queryOne();
	}
	
	public List<scenicspots> queryTwo(){
		return countrys.queryTwo();
	}
	
	public List<scenicspots> queryThree(){
		return countrys.queryThree();
	}
	
	public List<scenicspots> queryFour(){
		return countrys.queryFour();
	}
	
	public List<scenicspots> queryFive(){
		return countrys.queryFive();
	}
	
	public List<scenicspots> querySix(){
		return countrys.querySix();
	}
	
	public List<scenicspots> querySeven(){
		return countrys.querySeven();
	}
	
	public List<scenicspots> queryEight(){
		return countrys.queryEight();
	}
	
	public List<scenicspots> queryNine(){
		return countrys.queryNine();
	}
	
	public List<scenicspots> queryTen(){
		return countrys.queryTen();
	}
	
	public List<scenicspots> queryEleven(){
		return countrys.queryEleven();
	}
	
	public List<scenicspots> queryTwelve(){
		return countrys.queryTwelve();
	}
	
	
	public city queryByCid(Integer cid){
		return countrys.queryByCid(cid);
	}
	
	public List<scenicspots> queryByCountryId(Integer cid){
		return countrys.queryByCountryId(cid);
	}
	
	public List<city> queryByCity(Integer contryid){
		return countrys.queryByCity(contryid);
	}
	
	/**
	 * 国家模糊查询
	 * @param cname
	 * @return
	 */
	public country queryMoHu(String cname){
		return countrys.queryMoHu(cname);
	}
	
	public List<String> queryCname(){
		return countrys.queryCname();
	}
	
	public List<Map<String,Object>> queryCity(String cname){
		return countrys.queryCity(cname);
	}
	
	//根据国家编号查询所有城市信息
	public List<Map<String,Object>> queryCitys(Integer cid){
		return countrys.queryCitys(cid);
	}
	
	//根据国家编号查询国家信息
	public country queryCountry(Integer cid){
		return countrys.queryCountry(cid);
	}
}
