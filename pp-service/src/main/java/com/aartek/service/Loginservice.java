package com.aartek.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.Registration;
import com.aartek.model.Userlogin;
import com.aartek.repository.Loginrepository;

@Service
public class Loginservice {
	@Autowired
	private Loginrepository loginRepository;

	public boolean userSignIn(Userlogin login) {
		Userlogin userLogin = (Userlogin) login;

		List<Object> list = null;

		String Email_id = login.getEmail_id();
		String password = login.getPassword();

		list = loginRepository.Usersignup(Email_id, password);
		
		if (list == null) {

			return false;
		} else {

			return true;
		}

	}

}
