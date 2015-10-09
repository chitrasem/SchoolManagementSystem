package com.chitra.schoolmanagementsystem.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SchoolController {
	
	@RequestMapping(value="/admin", method = RequestMethod.GET)
	public String adminPage(Model model){
		model.addAttribute("user", getPrincipal());
		return "/UserManagement";
	}
	
	@RequestMapping(value="/db", method = RequestMethod.GET)
	public String dbPage(Model model){
		model.addAttribute("user", getPrincipal());
		return "/dba";
	}
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String loginPage(){
		
		return "/login";
	}
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage(HttpServletRequest req, HttpServletResponse res){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if(auth != null){
			new SecurityContextLogoutHandler().logout(req, res, auth);
		}
		return "redirect:/login?logout";
	}
	
	@RequestMapping(value="/Access_Denied", method=RequestMethod.GET)
	public String accessDeniedPage(Model m){
		m.addAttribute("user", getPrincipal());
		return "/accessDenied";
	}

	private String getPrincipal() {
		
		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		if(principal instanceof UserDetails){
			userName = ((UserDetails)principal).getUsername();
			
		}else{
			userName = principal.toString();
		}
		return userName;
	}

}