package com.jdbctemp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jdbctemp.model.Student;

@Repository("studentDao")
public class StudentDao {
    
JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
    public List<Student> getStudents(){    	
    	List<Student> students = template.query("select * from student", new RowMapper() {
    			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student stud = new Student();
				stud.setSid(rs.getInt("sid"));
				stud.setName(rs.getString("name"));
				stud.setAge(rs.getInt("age"));
				return stud;
			}
    		
    	});    	
    	return students;
    }
    public int saveStudent(Student student) {
    	return template.update("insert into student values("+student.getSid()+",'"+student.getName()+"',"+student.getAge()+")");
    }
    
    public int deleteStudent(int sid) {
    	return template.update("delete from student where sid="+sid+"");
    }
    
    public Student getStudent(int id) {
		String sql = "select * from student where sid=?";
		Student student = template.queryForObject(sql, new Object[] {id}, new BeanPropertyRowMapper<Student>(Student.class));
		System.out.println("getStudent :: "+student);
		return student;
	}
    
    public int editStudent(Student student) {
    	String sql = "update student set name='"+student.getName()+"', age="+student.getAge()+" where sid="+student.getSid()+"";
    	return template.update(sql);
    }
}

