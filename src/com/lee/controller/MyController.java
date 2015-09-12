package com.lee.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping
public class MyController {
	@RequestMapping("/MyController")
	public String index() {
		System.out.println(">>>>> In MyController");
		return "success";
	}
}
