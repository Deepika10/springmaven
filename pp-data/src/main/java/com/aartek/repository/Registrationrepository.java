package com.aartek.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.Registration;

@Repository
public class Registrationrepository 
{
	@Autowired
  private HibernateTemplate hibernatetemplate;
  
	public ArrayList<Registration> userdata(Registration login)
	{

		System.out.println("inside repository");
		System.out.println(login.getEmail_id());
	ArrayList<Registration> login1	= new ArrayList<Registration>();
	
      hibernatetemplate.save(login);
  login1=(ArrayList<Registration>) hibernatetemplate.loadAll(Registration.class);
		
		return login1;                           
		
	}
	

}
