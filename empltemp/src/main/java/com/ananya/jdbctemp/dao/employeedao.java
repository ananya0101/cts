package com.ananya.jdbctemp.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ananya.jdbctemp.model.Employee;

@Repository("employeeDao") // // bean id="studentDao" in spring-servlet.xml
public class employeedao {
	    
    JdbcTemplate template;
	
	/*
	 * this method set the JdbcTemplate by the Spring framework.
	 */
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	 
    public List<Employee>  getAllEmployees() {   	
   	
    	List<Employee> employee = template.query("select * from employee",
			    new RowMapper() {         // RowMapper
			        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			        	Employee e = new Employee();
			        	e.setEid((rs.getInt("eid")));
			        	e.setName(rs.getString("name"));
			        	e.setSalary(((rs.getInt("salary"))));
			            return e;
			        }
			    });
         return employee;
    }    
}
