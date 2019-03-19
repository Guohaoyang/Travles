package com.aaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.CityDao;
import com.aaa.entity.city;

@Service
public class CityService {

	@Autowired
	CityDao cdao;
	
	public List<city> queryCity(){
		return cdao.queryCity();
	}
	
	public List<city> queryChina(){
		return cdao.queryChina();
	}
	
	public List<city> queryChinaDesc(){
		return cdao.queryChinaDesc();
	}
	
	public List<city> queryIndonesia(){
		return cdao.queryIndonesia();
	}
	
	public List<city> queryIndia(){
		return cdao.queryIndia();
	}
	
	public List<city> queryVietnam(){
		return cdao.queryVietnam();
	}
	
	public List<city> queryNepal(){
		return cdao.queryNepal();
	}
	
	public List<city> queryJapan(){
		return cdao.queryJapan();
	}
	
	public List<city> queryMalaysia(){
		return cdao.queryMalaysia();
	}
	
	public List<city> queryItaliana(){
		return cdao.queryItaliana();
	}
	
	public List<city> queryUK(){
		return cdao.queryUK();
	}

	public List<city> queryDeutschland(){
		return cdao.queryDeutschland();
	}
	
	public List<city> queryFrance(){
		return cdao.queryFrance();
	}
	
	public List<city> queryReino(){
		return cdao.queryReino();
	}
	
	public List<city> querySwitzerland(){
		return cdao.querySwitzerland();
	}
	
	
}
