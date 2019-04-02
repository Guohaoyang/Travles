package com.aaa.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.city;
import com.aaa.entity.scenicspots;
import com.aaa.service.ChinaService;

@Controller
@RequestMapping("china")
public class ChinaController {

	@Autowired
	ChinaService cservice;
	
	@RequestMapping("queryRecommend")
	public String queryRecommend(Model model){	
		List<Map<String, Object>> Beijing = cservice.queryBeijing();
		model.addAttribute("Beijing", Beijing);
		List<Map<String, Object>> Xianggang = cservice.queryXianggang();
		model.addAttribute("Xianggang", Xianggang);
		List<Map<String, Object>> XiAn = cservice.queryXiAn();
		model.addAttribute("XiAn", XiAn);
		List<city> cities = cservice.queryCities();
		model.addAttribute("cities", cities);
		List<scenicspots> Rain = cservice.queryByRain();
		model.addAttribute("Rain", Rain);//雨天
		List<scenicspots> Romantic = cservice.queryByRomantic();
		model.addAttribute("Romantic", Romantic);//浪漫
		List<scenicspots> Explore = cservice.queryByExplore();
		model.addAttribute("Explore", Explore);//探险
		List<scenicspots> Travel = cservice.queryByTravel();
		model.addAttribute("Travel", Travel);
		//月份
		List<scenicspots> queryOne = cservice.queryOne();
		model.addAttribute("queryOne", queryOne);
		List<scenicspots> queryTwo = cservice.queryTwo();
		model.addAttribute("queryTwo", queryTwo);
		List<scenicspots> queryThree = cservice.queryThree();
		model.addAttribute("queryThree", queryThree);	
		List<scenicspots> queryFour = cservice.queryFour();
		model.addAttribute("queryFour", queryFour);	
		List<scenicspots> queryFive = cservice.queryFive();
		model.addAttribute("queryFive", queryFive);		
		List<scenicspots> querySix = cservice.querySix();
		model.addAttribute("querySix", querySix);		
		List<scenicspots> querySeven = cservice.querySeven();
		model.addAttribute("querySeven", querySeven);		
		List<scenicspots> queryEight = cservice.queryEight();
		model.addAttribute("queryEight", queryEight);		
		List<scenicspots> queryNine = cservice.queryNine();
		model.addAttribute("queryNine", queryNine);		
		List<scenicspots> queryTen = cservice.queryTen();
		model.addAttribute("queryTen", queryTen);		
		List<scenicspots> queryEleven = cservice.queryEleven();
		model.addAttribute("queryEleven", queryEleven);		
		List<scenicspots> queryTwelve = cservice.queryTwelve();
		model.addAttribute("queryTwelve", queryTwelve);
		return "mdd";
	}
	/**
	 * 根据景点名字查询景点详细信息
	 * 景点下面的游记信息
	 * @param ssname
	 * @param model
	 * @return
	 */
	@RequestMapping("queryBySsname")
	public String queryBySsname(String ssname,Model model){
		scenicspots queryBySsname = cservice.queryBySsname(ssname);
		model.addAttribute("queryBySsname", queryBySsname);
		model.addAttribute("ssname", ssname);
		List<Map<String, Object>> Travelnotes = cservice.queryTravelnotes(ssname);
		model.addAttribute("Travelnotes", Travelnotes);
		return "jingdianxiangqing";
	}
	/**
	 * 根据ID查询城市详细信息
	 * 并且查询城市下面的所有景点
	 * 城市下面的结伴信息
	 * @param model
	 * @param cid
	 * @return
	 */
	@RequestMapping("queryByCitys")
	public String queryByCitys(Model model,Integer cid){
		model.addAttribute("cid", cid);
		city ByCitys = cservice.queryByCitys(cid);//城市
		model.addAttribute("ByCitys", ByCitys);
		List<Map<String, Object>> queryScenicspotspic = cservice.queryScenicspotspic(cid);//景点
		model.addAttribute("queryScenicspotspic", queryScenicspotspic);
		List<Map<String, Object>> company = cservice.queryCompany(cid);//结伴
		model.addAttribute("company", company);
		System.out.println("ByCitys:"+ByCitys);
		System.out.println("queryScenicspotspic:"+queryScenicspotspic);
		return "city";
	}
	
	/**
	 * city页面
	 * @param cname
	 * @return
	 */
	@RequestMapping("queryMu")
	public String queryMu(String cname,Model model){
		List<Map<String, Object>> CityList = cservice.queryCitysMH(cname);
		model.addAttribute("CityList", CityList);
		model.addAttribute("cname", cname);
		
		return "city";
	}
	
	@RequestMapping("queryCname")
	@ResponseBody
	public List<Map<String, Object>> queryCname(String cname){
		List<Map<String, Object>> list=cservice.queryCitysMH(cname);
		System.out.println(list);
		return list;
	}
}
