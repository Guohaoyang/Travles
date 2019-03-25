package com.aaa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("houtais")
public class ylBackController {

	@RequestMapping("index")
	public String index(){
		return "houtai/index";
	}
	

	@RequestMapping("orderlist")
	public String orderlist(){
		return "houtai/order-list";
	}
	
	@RequestMapping("main")
	public String main(){
		return "houtai/main";
	}
	
	@RequestMapping("welcome")
	public String welcome(){
		return "houtai/welcome";
	}
	
	@RequestMapping("my")
	public String my(){
		return "houtai/1";
	}
	
	/**
	 * 忘记密码页面
	 * @return
	 */
	@RequestMapping("forgetPwd")
	public String forgetPwd(){
		return "houtai/member-password";
	}
	
	/**
	 * 个人信息页面
	 * @return
	 */
	@RequestMapping("mySelf")
	public String mySelf(){
		return "houtai/admin-edit";
	}
	
	/**
	 * 登录页面
	 * @return
	 */
	@RequestMapping("login")
	public String login(){
		return "login";
	}
}
