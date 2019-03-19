package com.aaa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aaa.service.ScenicspotsService;
@Controller
@RequestMapping("a")
public class ht {

	@Autowired
	ScenicspotsService sss;

	@RequestMapping("aa")
	public String a(Model model) {

		System.out.println("a");
		return "a";
	}

	
	
}
