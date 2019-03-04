package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplicationStart {

	public static void main(String[] args) {
		System.out.println("来了老弟！");
		SpringApplication.run(SpringbootApplicationStart.class, args);
	}
}
