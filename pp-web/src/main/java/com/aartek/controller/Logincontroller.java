package com.aartek.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.Registration;
import com.aartek.model.Userlogin;
import com.aartek.service.Loginservice;

@Controller
public class Logincontroller 
{
	@Autowired
	private Loginservice loginService;

	@RequestMapping(value ="/Userlogin")
	public String showLogin(Map<String, Object> map) {
		map.put("Userlogin", new Userlogin());
		
		return "login";
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("Userlogin") Userlogin login) {
		System.out.println("inside controller's save");
		System.out.println(login.getEmail_id()+" "+"in loginController");
		
		Map<String, String> map = new HashMap<String, String>();
		boolean list=loginService.userSignIn(login);
		
		if (list==true)
		{
			return "welcome";
		}
		else{
			map.put("invalid","invalid username & password");
		
		return "login";
	}

	
	}
}
