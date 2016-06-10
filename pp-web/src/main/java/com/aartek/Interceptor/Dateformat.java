package com.aartek.Interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.aartek.model.Recharge;

@Component
public class Dateformat extends HandlerInterceptorAdapter
{
	 @Override
	    public boolean preHandle(HttpServletRequest request,
	            HttpServletResponse response, Object handler) throws Exception {
	      System.out.println("inside pre");
	      Integer date1,year,month;
	      String date=request.getParameter("Date");
	      String[] d=date.split("/");
	      
	       date1=Integer.parseInt(d[0]);
	       month=Integer.parseInt(d[1]); 
	       year=Integer.parseInt(d[2]);
	       
	       date1=year;
	       month=date1;
	       year=month;
	  		  
	  	String date2=String.valueOf(date1);
	  	String month1=String.valueOf(month);
	  	String year1=String.valueOf(year);
	  	
	  	String formatdate=date2.concat("/");
	  	String formatmonth=formatdate.concat(month+"/");
	  	String formatyear=formatmonth.concat(year1);
	  	request.getParameter(formatdate);
	  	
	        return true;
	    }
	 
	 public void postHandle(HttpServletRequest request,
	            HttpServletResponse response, Object handler,
	            ModelAndView modelAndView) throws Exception 
	 {
		 
		 System.out.println("inside post");
			 
}
	 
	   @Override
	    public void afterCompletion(HttpServletRequest request,
	            HttpServletResponse response, Object handler, Exception ex)
	            throws Exception
	            {
		   System.out.println("inside after");
		   
	            }
	 
	
}
