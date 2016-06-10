package com.aartek.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.Registration;
import com.aartek.model.Userlogin;
import com.aartek.service.Registrationservice;
import com.aartek.validator.RegValidator;



@Controller
public class Registrationcontroller 
{
@Autowired
private Registrationservice regservice ;

@Autowired 
private RegValidator regvalidator;

	@RequestMapping(value="/Registration")
	public String showlogin(Map<String,Object> map)
	{
		map.put("Registration", new Registration());
		
		return "Registration";
		
	}
	
	@RequestMapping(value = "user", method = RequestMethod.POST ) 
	public String user(@ModelAttribute("Registration") Registration login, ModelMap map,BindingResult result) 
	{
		
		regvalidator.validate(login, result);
		if (result.hasErrors())
		{
			return "Registration";
		}
		
		boolean status=regservice.userSigninup(login);
		if(status==true)
		{
			map.addAttribute("Userlogin", new Userlogin());
			return "redirect:/Registration.do";
		}
		else
		{
		    return "Registration";
	}}
}
