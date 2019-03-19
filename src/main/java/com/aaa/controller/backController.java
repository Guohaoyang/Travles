package com.aaa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aaa.service.backService;

@Controller
@RequestMapping("back")
public class backController {
	@Autowired
	backService bs;
	
	//	
}
