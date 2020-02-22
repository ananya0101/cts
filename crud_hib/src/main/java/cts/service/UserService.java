package cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cts.dao.UserDao;
import cts.model.User;

@Service
public class UserService 
{
	@Autowired
    UserDao userDao;
	
	public List<User> getAllUsers() {
		return userDao.getAllUser();
	}
	
	public void saveOrUpdate(User u) {
		userDao.saveOrUpdate(u);
	}
}