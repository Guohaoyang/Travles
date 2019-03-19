package com.aaa.controller;
//http://localhost:8080/Travle/user/aa#
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.service.TuserService;
import com.aaa.util.JuheDemo;
import com.aaa.entity.tusers;
@Controller
@RequestMapping("user")
public class TuserController {

	@Autowired
	TuserService user;
	
	
	//进页面
	@RequestMapping("a")
	public String a() {
		//System.out.println("a");
		return "login";
	}
	//进页面
	@RequestMapping("aa")
	public String aa() {
		//System.out.println("a");
		return "register";
	}
	
	
	
	
	
	//登录
	@RequestMapping("login")	
	@ResponseBody
	public Integer login(String phone,String upwd)
	{
		List<tusers> users =user.login(phone, upwd);
		//System.out.println(phone);
		//System.out.println(users);
		
		return users.size()>0 ? 1:0;
	}
	
	//登陆后
	@RequestMapping("loginh")
	public String loginh() {
		//System.out.println("a");
		return "Trip";
	}
	
	//注册
	@RequestMapping("Register")
	@ResponseBody
	public Integer Register(tusers us)
	{
		Integer a=user.Register(us);
		System.out.println(a);
		return a;
	}
	//发验证码
	//注册
	@RequestMapping("yzm")
	@ResponseBody
	public String yzm(String phone)
	{
		String times = new Date().getTime()+"";
		times=times.substring(8, 12);
		JuheDemo.getRequest2(phone, times);
		System.out.println(times);
		return times;
	}
	
	//查询账号存在
	@RequestMapping("existPhone")
	@ResponseBody
	public List<tusers> Pexist(String phone)
	{
		List<tusers> a= user.Pexist(phone);
		return a;
	}
}
