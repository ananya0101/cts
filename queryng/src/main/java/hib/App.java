package hib;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

public class App 
{
    public static void main( String[] args )
    {
    	 System.out.println( "Hello World!" );
         Session session = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
 		Transaction transaction = session.beginTransaction();
 			
 		//INSERT		
 		/*  User u = new User(); 
 		  //p1.setPid(101);
 		  u.setN("Ananya");
 		  u.setS(5000000);
 		  session.save(u);		 */
 		
 		//FROM
 		/*String hql = "from User";
		Query query = session.createQuery(hql);
		List list = query.list();
		for (int i = 0; i < list.size(); i++) {
			User u = (User)list.get(i);
			System.out.println(u.getId()+","+u.getN());
		}*/
 		
 		//SELECT
 		/*String hql = "select u.n from User u";
		Query query = session.createQuery(hql);
		List list = query.list();
		for (int i = 0; i < list.size(); i++) {
			String name = (String)list.get(i);
			System.out.println("Name :"+name);
		}*/
 		
 		//WHERE
 		/*String hql = "from User u WHERE u.id = 1";
		Query query = session.createQuery(hql);
		List list = query.list();
		for (int i = 0; i < list.size(); i++) {
			User u = (User)list.get(i);
			System.out.println(u.getId()+","+u.getN());
		}*/
 		
 		//Using Named Parameter
 		/*String hql = "from User u WHERE u.id = :sudId";
		Query query = session.createQuery(hql);
		query.setParameter("sudId", 2);	
		List list = query.list();
		for (int i = 0; i < list.size(); i++) {
			User u= (User)list.get(i);
			System.out.println(u.getId()+","+u.getN());
		}*/
 		
 		//Criteria
 		/*Criteria cr = session.createCriteria(User.class);
		List results = cr.list();
		Iterator it = results.iterator();
		while (it.hasNext()) {
			User u = (User) it.next();
			System.out.println("Name :"+u.getN());
		}*/
 		
 		//Restrictions with Criteria
 		/*Criteria cr = session.createCriteria(User.class);
		cr.add(Restrictions.eq("id", 2));
		List results = cr.list();
		Iterator it = results.iterator();
		while (it.hasNext()) {
			User u = (User) it.next();
			System.out.println("Name :"+u.getN());
		}*/
 		
 		//Native SQL Quary
 		 String sql = "select * from User";
 		SQLQuery sqlQuery = session.createSQLQuery(sql).addEntity(User.class);
 		List list = sqlQuery.list();
 		Iterator it = list.iterator();
 		while (it.hasNext()) {
 			User u = (User) it.next();	
 			System.out.println(u.getId()+","+u.getN());
 		}
 		transaction.commit();
 		
 		session.close();
 		System.out.println("annot done ...");
    }
}