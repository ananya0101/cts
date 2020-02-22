package cts.dao;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cts.model.User;

@Repository
@Transactional
public class UserDao {
	@Autowired
	SessionFactory sessionFactory;
	
     public List<User> getAllUser() {
    	
    	 Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
    	 return criteria.list();
     } 

	    
     public void saveOrUpdate(User u) {
 		System.out.println("DATA: "+u);
 		sessionFactory.getCurrentSession().saveOrUpdate(u);
 		System.out.println("User save upadet Done !!!");
 	}
}