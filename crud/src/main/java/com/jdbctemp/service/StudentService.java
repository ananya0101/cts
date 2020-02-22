package com.jdbctemp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdbctemp.dao.StudentDao;
import com.jdbctemp.model.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDao studentDao;
	
    public List<Student> getAllStudents(){
    	return studentDao.getStudents();
    }
    
    public int saveStudent(Student student) {
    	return studentDao.saveStudent(student);
    }
    
    public int dalateStudent(int sid) {
    	return studentDao.deleteStudent(sid);
    }
    
    public Student getStudent(int sid) {
    	return studentDao.getStudent(sid);
    }
    
    public int editStudent(Student student) {
    	return studentDao.editStudent(student);
    }
}