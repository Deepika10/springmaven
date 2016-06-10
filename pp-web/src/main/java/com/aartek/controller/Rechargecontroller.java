package com.aartek.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.Recharge;
import com.aartek.service.Rechargeservice;

@Controller
public class Rechargecontroller 
{
 @Autowired
 private Rechargeservice rechservice;

 @RequestMapping("/Recharge")	
public String showrecharge(ModelMap model)
{
	 model.addAttribute("Recharge", new Recharge());
	return "recharge";
	
}
@RequestMapping(value="/dorech",method=RequestMethod.POST)
public String dorecharge(@ModelAttribute("Recharge") Recharge recharge ,ModelMap model,HttpServletRequest request)
{
	
	List<Recharge> list=null;
	System.out.println("inside controller");
   
   String date= request.getParameter("Date");
    recharge.setDate(date);
	
	list=rechservice.Rechargeshow(recharge);
	
	model.addAttribute("list",list);
	
	
	return "recharge" ;
	
}
}
