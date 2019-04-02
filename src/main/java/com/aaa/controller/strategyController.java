package com.aaa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.city;
import com.aaa.entity.continect;
import com.aaa.service.ContinectService;

@Controller
@RequestMapping("strategy")

public class strategyController {

	@Autowired
	ContinectService conct;
	
	//进页面
	@RequestMapping("a")
	public String a(Model model,String Cname) {
		//大洲
		List<continect> list=conct.Allzo();
		//城市
		List<city> list1=conct.Allcs();
		//11推荐
		List<Map<String,Object>> list2 = conct.gl();
		//按城市
		List<Map<String,Object>> Bycity = conct.glBayCtity(Cname);
		model.addAttribute("zhou",list);
		model.addAttribute("cs",list1);
		model.addAttribute("gl",list2);
		model.addAttribute("Bycity",Bycity);
		return "Trip";
	}
	
	//查攻略an城市
	@RequestMapping("glBayCity")
	public String gl(Model model,String Cname)
	{
		List<continect> list=conct.Allzo();
		List<city> list1=conct.Allcs();
		List<Map<String,Object>> Bycity = conct.glBayCtity(Cname);
		//System.out.println(list);
		
		model.addAttribute("zhou",list);
		model.addAttribute("cs",list1);
		model.addAttribute("gl",Bycity);
		return  "Trip";
	}
	//详情
	
	@RequestMapping("xiangqing")
	public String Datails(Model model,Integer id)
	{
		
		List<Map<String,Object>> list=conct.glS(id);
		model.addAttribute("gls",list);
		System.out.println(list);
		return "Trips";
	}
	
	
	//添加页面
	@RequestMapping("addXc")
	
	public String addXc()
	{
		return "addXc";
	}
	//目的地分页
	@RequestMapping("pageCity")
	@ResponseBody
	public Map<String,Object>  pageCity(Integer pageNum)
	{
		Map<String,Object> map=new HashMap<String,Object>();
		
		List<city> list=conct.page(pageNum, 6);
		//System.out.println(list);
		Integer count = conct.num();
		
		Integer p =count/6;
		if (count % 6 != 0)
	    p++;
		map.put("list", list);
		//当前页数
		map.put("curPage", pageNum);
		//总页数
		map.put("totalPage", p);
		
		return map;
	}
	
	/**
	 * 查询所有城市
	 * @return
	 */
	@RequestMapping("queryAllCitys")
	@ResponseBody
	public List<city> queryAllCitys(){
		List<city> list =  conct.Allcs();
		return list;
	}
	
}
