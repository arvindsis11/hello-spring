package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
	//branch A changes
	@GetMapping("/demo")
	public String printMsg() {
		return "Hello Spring";
	}
	
	@GetMapping("/demo2")
	public String printMsg2(String str) {
		return "Hello Spring2";
	}
	//pair extraordinier badge
	//test git merge and pull-1
	
	//test 2 git pull request

	
	//branchB changes
	
  
  //branchA changes

}
