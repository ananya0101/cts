package com.vp.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.vp.model.Employee;

@Component
public class EmployeeValidator implements Validator{

	public boolean supports(Class<?> clazz) {		
		return Employee.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "name", "employee.name.empty");
		ValidationUtils.rejectIfEmpty(errors, "age", "employee.age.empty");
		ValidationUtils.rejectIfEmpty(errors, "email", "employee.email.empty");
		ValidationUtils.rejectIfEmpty(errors, "gender", "employee.gender.empty");
		ValidationUtils.rejectIfEmpty(errors, "skil", "employee.skil.empty");
		
		Employee employee = (Employee)target;
		
		Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
	            Pattern.CASE_INSENSITIVE);
	    if (!(pattern.matcher(employee.getEmail()).matches())) {
	    	errors.rejectValue("email", "employee.email.invalid");
	    }
	}

}