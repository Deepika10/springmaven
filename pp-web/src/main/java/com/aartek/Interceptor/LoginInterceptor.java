package com.aartek.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class LoginInterceptor extends HandlerInterceptorAdapter
{
	 @Override
	    public boolean preHandle(HttpServletRequest request,
	            HttpServletResponse response, Object handler) throws Exception {
	     System.out.println("inside prehandler");
	     
	   
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
		   System.out.println("inside aftercomplition");
		   
	            }
	 

}
