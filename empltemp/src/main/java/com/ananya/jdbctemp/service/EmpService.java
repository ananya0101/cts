package com.ananya.jdbctemp.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ananya.jdbctemp.dao.employeedao;
import com.ananya.jdbctemp.model.Employee;

@Service
public class EmpService {
	
	@Autowired
	employeedao employeeDao;
	
    public List<Employee> getAllEmployee(){
    	return employeeDao.getAllEmployees();
    }
}
