package com.aartek.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.Registration;
import com.aartek.repository.Registrationrepository;

@Service
public class Registrationservice {
	@Autowired
	private Registrationrepository regrepo;

	public boolean userSigninup(Registration login) {

		System.out.println("inside service");
		
		ArrayList<Registration>  reglogin=regrepo.userdata(login);
		
        if(reglogin!=null)
        {
        	return true;
        }
        else
        {
        	return false;
        }
		
		

	}
}
