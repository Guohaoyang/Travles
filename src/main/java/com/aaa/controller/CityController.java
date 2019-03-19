package com.aaa.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.city;
import com.aaa.entity.country;
import com.aaa.entity.scenicspots;
import com.aaa.service.CityService;
import com.aaa.service.CountryService;
import com.aaa.service.ScenicspotsService;

@Controller
@RequestMapping("citys")
public class CityController {

	@Autowired
	CityService cservice;
	
	@Autowired
	CountryService countrys;
	
	@Autowired
	ScenicspotsService ss;
	
	/**
	 * 根据分类查询国家  
	 * 根据主题查询景点
	 * 根据月份查询景点
	 * 根据大洲查询国家
	 * @param model
	 * @return
	 */
	@RequestMapping("queryCity")
	public String queryCity(Model model){
		//推荐城市
		List<city> cityList = cservice.queryCity();
		model.addAttribute("cityList", cityList);
		System.out.println("推荐所有城市："+cityList);
		
		//中国城市
		List<city> chinaList = cservice.queryChina();
		model.addAttribute("chinaList", chinaList);
		System.out.println("推荐中国城市："+chinaList);
		
		//倒叙查询后五个城市
		List<city> descList = cservice.queryChinaDesc();
		model.addAttribute("descList", descList);
		System.out.println("倒叙查询中国后五个城市:"+descList);
		
		//查询印度尼西亚
		List<city> IndonesiaList = cservice.queryIndonesia();
		model.addAttribute("IndonesiaList", IndonesiaList);
		System.out.println("印度尼西亚："+IndonesiaList);
		
		//查询印度
		List<city> IndiaList = cservice.queryIndia();
		model.addAttribute("IndiaList", IndiaList);
		System.out.println("印度："+IndiaList);
		
		//查询越南
		List<city> vietnamList = cservice.queryVietnam();
		model.addAttribute("vietnamList", vietnamList);
		System.out.println("越南："+vietnamList);

		//查询尼泊尔
		List<city> nepalList = cservice.queryNepal();
		model.addAttribute("nepalList", nepalList);
		System.out.println("尼泊尔："+nepalList);
		
		//查询日本
		List<city> japanList = cservice.queryJapan();
		model.addAttribute("japanList", japanList);
		System.out.println("日本："+japanList);
		
		//查询马来西亚
		List<city> malaysiaList = cservice.queryMalaysia();
		model.addAttribute("malaysiaList", malaysiaList);
		System.out.println("马来西亚："+malaysiaList);
		
		//意大利
		List<city> italianaList = cservice.queryItaliana();
		model.addAttribute("italianaList", italianaList);
		System.out.println("意大利:"+"italianaList");
		
		//英国
		List<city> ukList = cservice.queryUK();
		model.addAttribute("ukList", ukList);
		
		//德国
		List<city> deutschlandList = cservice.queryDeutschland();
		model.addAttribute("deutschlandList", deutschlandList);
		
		//法国
		List<city> franceList = cservice.queryFrance();
		model.addAttribute("franceList", franceList);
		
		//西班牙
		List<city> ReinoList = cservice.queryReino();
		model.addAttribute("ReinoList", ReinoList);
		
		//瑞士
		List<city> SwitzerlandList = cservice.querySwitzerland();
		model.addAttribute("SwitzerlandList", SwitzerlandList);
		
		//亚洲
		List<country> asiaistList = countrys.queryAsia();
		model.addAttribute("asiaistList", asiaistList);
		
		//欧洲
		List<country> europeList = countrys.queryEurope();
		model.addAttribute("europeList", europeList);
		
		
		//美洲
		List<country> americaList = countrys.queryAmerica();
		model.addAttribute("americaList", americaList);
		
		
		//大洋洲
		List<country> oceaniaList = countrys.queryOceania();
		model.addAttribute("oceaniaList", oceaniaList);
		
		List<scenicspots> queryByRain = countrys.queryByRain();
		model.addAttribute("queryByRain", queryByRain);
		System.out.println("queryByRain:"+queryByRain);
		
		List<scenicspots> queryByRomantic = countrys.queryByRomantic();
		model.addAttribute("queryByRomantic", queryByRomantic);
		
		List<scenicspots> queryByExplore = countrys.queryByExplore();
		model.addAttribute("queryByExplore", queryByExplore);
		
		List<scenicspots> queryByTravel = countrys.queryByTravel();
		model.addAttribute("queryByTravel", queryByTravel);
		
		//月份
		List<scenicspots> queryOne = countrys.queryOne();
		model.addAttribute("queryOne", queryOne);
		
		List<scenicspots> queryTwo = countrys.queryTwo();
		model.addAttribute("queryTwo", queryTwo);
		
		List<scenicspots> queryThree = countrys.queryThree();
		model.addAttribute("queryThree", queryThree);
		
		List<scenicspots> queryFour = countrys.queryFour();
		model.addAttribute("queryFour", queryFour);
		
		List<scenicspots> queryFive = countrys.queryFive();
		model.addAttribute("queryFive", queryFive);
		
		List<scenicspots> querySix = countrys.querySix();
		model.addAttribute("querySix", querySix);
		
		List<scenicspots> querySeven = countrys.querySeven();
		model.addAttribute("querySeven", querySeven);
		
		List<scenicspots> queryEight = countrys.queryEight();
		model.addAttribute("queryEight", queryEight);
		
		List<scenicspots> queryNine = countrys.queryNine();
		model.addAttribute("queryNine", queryNine);
		
		List<scenicspots> queryTen = countrys.queryTen();
		model.addAttribute("queryTen", queryTen);
		
		List<scenicspots> queryEleven = countrys.queryEleven();
		model.addAttribute("queryEleven", queryEleven);
		
		List<scenicspots> queryTwelve = countrys.queryTwelve();
		model.addAttribute("queryTwelve", queryTwelve);
		
		return "mdd";
	}
	
	/**
	 * 根据景点编号查询景点信息
	 * @param ssid
	 * @param model
	 * @return
	 */
	@RequestMapping("queryBySsid")
	public String queryBySsid(Integer ssid,Model model){
		scenicspots BySsid = ss.queryBySsid(ssid);
		model.addAttribute("BySsid", BySsid);
		System.out.println("ssid:"+BySsid);
		return "jingdianxiangqing";
	}
	
	@RequestMapping("queryByCids")
	public String queryByCids(Integer cid,Model model,Integer contryid){
		city queryByCid = countrys.queryByCid(cid);
		model.addAttribute("queryByCid", queryByCid);
		model.addAttribute("cid", cid);
		System.out.println("queryByCid:"+queryByCid);
		
		List<scenicspots> countryId = countrys.queryByCountryId(cid);
		model.addAttribute("countryId", countryId);
		System.out.println("countryId:"+countryId);
		
		return "scenicspots";
	}
	/**
	 * 模糊查询 根据国家名字查询
	 * 国家的所有城市以及景点的信息
	 * @param model
	 * @param cname
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("queryMuHu")
	public String queryMuHu(Model model,String cname) throws Exception{
		country CnameList = countrys.queryMoHu(cname);
		model.addAttribute("CnameList",CnameList);
		model.addAttribute("cname", cname);
		System.out.println("cname:"+cname);
		System.out.println("CnameList:"+CnameList);
		
		List<Map<String, Object>> queryCity = countrys.queryCity(cname);
		model.addAttribute("queryCity", queryCity);
		System.out.println("queryCity:"+queryCity);
		
		return "city";
	}
	
	@RequestMapping("queryCname")
	@ResponseBody
	public List<String> queryCname(){
		return countrys.queryCname();
	}
	
}
