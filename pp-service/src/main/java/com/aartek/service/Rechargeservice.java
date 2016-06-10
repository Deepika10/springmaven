package com.aartek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.Recharge;
import com.aartek.repository.Rechargerepo;

@Service
public class Rechargeservice 
{
  @Autowired
  private Rechargerepo rechargerepo;
	public List<Recharge> Rechargeshow(Recharge recharge )
	{
		List<Recharge> list=null;
		System.out.println("inside service");
	list=	rechargerepo.showdata(recharge);
		return list;
		
	}
}
