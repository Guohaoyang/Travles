package com.aaa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.city;
import com.aaa.entity.scenicspots;
import com.aaa.entity.tusers;
import com.aaa.service.myselfService;

@Controller
@RequestMapping("myself")
public class myselfController {
	@Autowired
	myselfService ms;
	@RequestMapping("querycity")
	public String querycity(Model m){
		List<city> citys = ms.querycity();
		List<scenicspots> scenicspot = ms.queryscenicspots();
		/*for(city c:citys){
			System.out.println(c);
		}
		for(scenicspots s:scenicspot){
			System.out.println(s);
		}*/
		m.addAttribute("citys",citys);
		m.addAttribute("scenicspot",scenicspot);
		return "zhu";
	}
	
	
	@RequestMapping("my")
	public String my(Model m,Integer uid){
		tusers users = ms.queryusers(uid).get(0);
		List<tusers> fans = ms.queryfans(uid);
		Integer fansnum = fans.size();
		List<tusers> danas = ms.querydana(uid);
		Integer dananum = danas.size();
		m.addAttribute("users",users);
		m.addAttribute("fans",fans);
		m.addAttribute("dana",danas);
		m.addAttribute("fansnum",fansnum);
		m.addAttribute("dananum",dananum);
		return "myself";
	}
	
	@RequestMapping("add")
	@ResponseBody
	public Integer addAttention(Integer uid,Integer usid){
		Integer add = ms.addAttention(uid, usid);
		System.out.println(add);
		return 1;
	}
	
	@RequestMapping("del")
	@ResponseBody
	public Integer delAttention(Integer uid,Integer usid){
		Integer add = ms.delAttention(uid, usid);
		System.out.println(add);
		return 1;
	}
	
}
