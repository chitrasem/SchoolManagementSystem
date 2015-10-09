package com.chitra.schoolmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class IndexController {
	
	@RequestMapping(value={"/","/home"}, method = RequestMethod.GET)
	public String welcomePage(Model m){
		m.addAttribute("message","Welcome to home page!");
		
		return "welcome";
	}

}
