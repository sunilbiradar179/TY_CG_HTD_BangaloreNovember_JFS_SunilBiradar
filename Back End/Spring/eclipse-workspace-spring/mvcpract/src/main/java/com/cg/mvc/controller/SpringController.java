package com.cg.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {
	
	@RequestMapping("/hello")
	public String hello(ModelMap map) {
		map.addAttribute("msg","Hello....");
		return "index";
		
	}
}
