package com.example.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class helloController {
	
	@GetMapping("/")
	public  String hello() {
	return "hello";
	}
	
	@PostMapping("/user")
	public  String helloPeople(@RequestParam String user,Model model) 
	{
	model.addAttribute("user", user);
	return "hello";
	}
}



