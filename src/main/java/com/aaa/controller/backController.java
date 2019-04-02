package com.aaa.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aaa.entity.tadmin;
import com.aaa.service.backService;

@Controller
@RequestMapping("back")
public class backController {
	@Autowired
	backService bs;
	
	//登陆后
	public String queryAdmin(HttpSession s){
		tadmin tt = (tadmin) s.getAttribute("loginht");
		return "";
	}
}
