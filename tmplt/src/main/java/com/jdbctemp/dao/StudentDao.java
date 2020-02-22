package com.jdbctemp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jdbctemp.model.Student;

@Repository("studentDao") // // bean id="studentDao" in spring-servlet.xml
public class StudentDao {
	    
    JdbcTemplate template;
	
	/*
	 * this method set the JdbcTemplate by the Spring framework.
	 */
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	 
    public List<Student>  getAllStudents() {   	
   	
    	List<Student> students = template.query("select * from student",
			    new RowMapper() {         // RowMapper
			        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			        	Student std = new Student();
			        	std.setSid((rs.getInt("sid")));
			        	std.setName(rs.getString("name"));
			        	std.setAge(((rs.getInt("age"))));
			            return std;
			        }
			    });
         return students;
    }    
}
