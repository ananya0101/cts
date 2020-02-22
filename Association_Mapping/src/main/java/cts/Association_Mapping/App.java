package cts.Association_Mapping;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cts.Association_Mapping.HibernateUtil;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Address address1 = new Address("Kanpur Road", "Lucknow", "Uttar Pradesh", "226012");
			Address address2 = new Address("NH-58", "Meerut", "Uttar Pradesh", "250005");
			Student student1 = new Student("Ananya", address1);
			Student student2 = new Student("Vishal", address2);
			session.save(student1);
			session.save(student2);
			transaction.commit();
		}
		catch (HibernateException e)
		{
			transaction.rollback();
			e.printStackTrace();
		} 
		finally 
		{
			session.close();
		}
    }
}
