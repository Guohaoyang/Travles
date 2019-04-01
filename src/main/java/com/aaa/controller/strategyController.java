package com.aaa.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.acon;
import com.aaa.entity.addxc;
import com.aaa.entity.city;
import com.aaa.entity.continect;
import com.aaa.entity.strategy;
import com.aaa.service.ContinectService;
import com.aaa.util.Dates;

@Controller
@RequestMapping("strategy")

public class strategyController {

	@Autowired
	ContinectService conct;
	
	@RequestMapping("xx")
	public String x()
	{
		return "a";
	}
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
		
		model.addAttribute("zhou",list);
		model.addAttribute("cs",list1);
		model.addAttribute("gl",Bycity);
		return  "Trip";
	}
	@RequestMapping("glBays")
	public String gls(Model model,String Cname)
	{
		List<continect> list=conct.Allzo();
		List<city> list1=conct.Allcs();
		List<Map<String,Object>> Bycity = conct.glBays(Cname);
		
		model.addAttribute("zhou",list);
		model.addAttribute("cs",list1);
		model.addAttribute("gl",Bycity);
		return  "Trip";
	}
	//详情根据ID
	
	@RequestMapping("xiangqing")
	public String Datails(Model model,Integer id)
	{
		
		List<Map<String,Object>> list=conct.glS(id);
		model.addAttribute("gls",list);
		
		return "Trips";
	}
	//查行程详情
	@RequestMapping("queryOne")
	@ResponseBody
	public List<Map<String, Object>> queryOne(Model model, Integer tid,Integer days){
		List<Map<String, Object>> queryOned = conct.queryOned(tid,days);
		model.addAttribute("queryOned", queryOned);		
		return queryOned;
	}
	//查几天
	@RequestMapping("xq_s")
	public String a(Model model,Integer tid){
		List<addxc> querydays = conct.querydays(tid);
		model.addAttribute("querydays", querydays);
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
	
	//模糊搜索城市目的地
		@RequestMapping("pageno")
		@ResponseBody
		public List<city> pageno(String cname)
		{
			List<city> list = conct.pageno(cname);
			return list;
		}
	
	//添加目的地景点页面
	@RequestMapping("addgls")
	public String axc(Integer uid,Model model)
	{
		//查询行程天数表的主键ID
		Integer sid=conct.SId(uid);
		
		//根据主键ID查询天数信息
		List<Map<String,Object>> list=conct.addxcs(sid);
		model.addAttribute("list", list);
		
		return "addXingChen";
	}
	//我的行程  最大的ID 根据登录后的uid查
	@RequestMapping("tidm")
	@ResponseBody
	public Integer tid(Integer uid)
	{
		Integer tid=conct.SId(uid);
		return tid;
	}
	
	
	//所有城市
	@RequestMapping("cityss")
	@ResponseBody
	public List<city> cityss()
	{
		List<city> list=conct.Allcs();
	
		return list;
	}
	
	
	//添加行程
	@RequestMapping("addset")
	@ResponseBody
	public Integer addset(strategy st)
	{
		
		Date createtime=Dates.StringToDate(st.getCreatetime().toString(), "yyyy-MM-dd");
		st.setCreatetime(createtime);
		System.out.println(createtime);
		
		Integer a= conct.addsec(st);
		return a;
	}
	
	//添加行程天数 再用
	@RequestMapping("addxct")
	@ResponseBody
	public Integer addxct(addxc addt)
	{
		Integer a= conct.addxct(addt);
		return a;
	}
	//添加天数表天数
	@RequestMapping("ts")
	@ResponseBody
	public  Integer ts(Integer num,Integer uid,Integer tid)
	{
		for(int i=1;i<=num; i++)
		{
			conct.ts(i,uid,tid);
		}
		return 1;
	}
	
	//点击增加一天做修改天数
	@RequestMapping("upt")
	@ResponseBody
	public Integer upt(Integer tid)
	{
		Integer a = conct.upt(tid);
		
		return a;
	}
	//添加第几天的内容
	@RequestMapping("addcon")
	@ResponseBody
	public Integer addcon(acon acons)
	{
		int num=conct.addcon(acons);
		return num;
	}
	//查看第几天的内容根据第几天和行程id
	@RequestMapping("Alacon")
	@ResponseBody
	public List<acon> Alacon(Integer days,Integer tid)
	{
		List<acon> list = conct.Allacon(days, tid);
		return list;
				
	}
	//查看城市经纬度
	@RequestMapping("location")
	@ResponseBody
	public List<city> location()
	{
		List<city> list=conct.location();
		return list;
	}
}
