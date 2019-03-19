package com.aaa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.aaa.entity.city;
import com.aaa.entity.tadmin;
import com.aaa.service.TadminService;

@Controller
@RequestMapping("ht")
public class TadminController {
	@Autowired
	TadminService ts;
	//进后台登录
	@RequestMapping("loginht")
	public String a(){
		return "loginh.html";
	}
	
	//进登录成功后台页面
	@RequestMapping("rs")
	public String aa(){
		return "zz/tadmin.html";
	}
	@RequestMapping("login")
	@ResponseBody
	public int login(String tname,String tpwd,ModelAndView m,HttpSession s){
		List<tadmin> list=ts.login(tname, tpwd);
		if(list.size()<0){
			System.out.println("登录失败");
			return 2;
		}else{
			System.out.println("登录成功 ");
			s.setAttribute("loginlist",list);
			System.out.println(list);
			return 1;
		}
	}
	
	@RequestMapping(value="queryCity",produces="application/json; charset=utf-8")
	@ResponseBody
	public Map<String,Object> City(){
		List<city> list=ts.queryCity();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("msg", "");
		map.put("code", 0);
		map.put("count", list.size());
		map.put("data", list);
		return map;
	}
}
