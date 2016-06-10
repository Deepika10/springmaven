package com.aartek.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.Recharge;

@Repository
public class Rechargerepo 
{
	@Autowired
	private HibernateTemplate hibernatetemplate;
	
  @SuppressWarnings("unchecked")
public List<Recharge> showdata(Recharge recharge)
  {
	  List<Recharge> list=null;
	  
	  System.out.println("inside repo");
	  System.out.println(recharge.getAmount());
	  
	 hibernatetemplate.save(recharge);
	 
	 list= (List<Recharge>)hibernatetemplate.loadAll(Recharge.class);
	return list;
	  
  }
}
