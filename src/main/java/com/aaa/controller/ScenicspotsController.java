package com.aaa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.aaa.entity.scenicspots;
import com.aaa.service.ScenicspotsService;

@Controller
@RequestMapping("scens")
public class ScenicspotsController {

	@Autowired
	ScenicspotsService ss;
	
	@RequestMapping("queryBySsid")
	public String queryBySsid(Integer ssid,Model model){
		scenicspots BySsid = ss.queryBySsid(ssid);
		model.addAttribute("BySsid", BySsid);
		System.out.println("ssid:"+ssid);
		return "jingdianxiangqing";
		
	}
}
