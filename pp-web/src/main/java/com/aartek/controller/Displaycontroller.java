package com.aartek.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


import com.aartek.service.Displayservice;

@Controller
public class Displaycontroller 
{

	@Autowired
	private Displayservice service;
	
	@RequestMapping(value ="/Display")
	public String showLogin(ModelMap model,HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {

		System.out.println("inside controller");
		Query qry = service.find();
		Object row[]=null;
		ArrayList<Object> l=(ArrayList<Object>) qry.list();
		/*Iterator it=l.iterator();
		while(it.hasNext())
		{
			row=(Object[])it.next();
			
			
		}
		System.out.println(row[0]);*/
		
		req.setAttribute("name",l );
	
return "display";
	}


}
