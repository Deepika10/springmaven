package com.aartek.repository;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class displayrepo 
{
@Autowired
private HibernateTemplate hibernatetemplate;
	public Query  fetch()
	{
		
		System.out.println("inside repo");
	SessionFactory factory= hibernatetemplate.getSessionFactory();
	Session session=factory.openSession();
	
	Query  qry = session.createSQLQuery("select * from display where id='id'");

		return qry;
		
	}

}
