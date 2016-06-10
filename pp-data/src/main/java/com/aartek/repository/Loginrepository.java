package com.aartek.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.Registration;

@Repository
public class Loginrepository {
	@Autowired
	private HibernateTemplate hibernatetemplate;

	public 	List<Object> Usersignup(String Email_id,String password) 
	{
		
		List<Object> login=null;
		login=(List<Object>) hibernatetemplate.find("from Userlogin al where al.Email_id = ? and al.Password = ?",Email_id , password);
        
	return login;
	}

}
