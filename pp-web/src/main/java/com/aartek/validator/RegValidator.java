package com.aartek.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.aartek.model.Registration;

@Component
public class RegValidator implements Validator

{

	public boolean supports(Class<?> clazz) 
	{
		
		return Registration.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) 
	{
		Registration registration = (Registration) target;
		/*ValidationUtils.rejectIfEmpty(errors, "First_name", "error.first_name.empty");
		ValidationUtils.rejectIfEmpty(errors, "Last_name", "error.last_name.empty");
		ValidationUtils.rejectIfEmpty(errors, "Email_id", "error.email.empty");
	    ValidationUtils.rejectIfEmpty(errors, "Password", "error.password.empty");*/
	    
	    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "First_name", "error.first_name.empty","please enter firstname");
	    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Last_name", "error.first_name.empty","please enter lastname");
	    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Email_id", "error.first_name.empty","please enter emailid");
	    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Password", "error.first_name.empty","please enter password");
		
/*	if(registration.getEmail_id().contains("@")!=true)
   {
		errors.rejectValue("Email_id", "error.email.first.rule");
		
	} else 
		if (registration.getEmail_id().contains(".com") != true
			 ) {
		errors.rejectValue("Email_id", "error.email.second.rule");
	} 
	
	if(registration.getPassword().length()>=18 )
	{
	errors.rejectValue("Password", "error.password.less");
	}
	else 
		if (registration.getPassword().length()<=6 ) {
		errors.rejectValue("Password", "error.password.greater");
	} */
	
	}
	
}

