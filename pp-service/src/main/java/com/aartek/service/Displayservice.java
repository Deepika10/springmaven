package com.aartek.service;




import org.hibernate.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.aartek.repository.displayrepo;

@Service
public class Displayservice 
{
@Autowired
private displayrepo repo;
 public Query  find()
{
	 System.out.println("inside ");
	Query  finddata=repo.fetch();
	return finddata;
	
}
	
	
}
