package com.aaa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("a")
public class ht {

	@RequestMapping("aa")
	public String a() {
		System.out.println("a");
		return "zhu";
	}
	
	@RequestMapping("cc")
	public String c() {
		System.out.println("c");
		return "gonglue";
	}
}
