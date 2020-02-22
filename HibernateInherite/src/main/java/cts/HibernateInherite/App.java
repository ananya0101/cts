package cts.HibernateInherite;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee_1 employee = new Employee_1("Ananya","Srivastava",new Date(),"hr");
		session.save(employee);
		
		transaction.commit();
		session.close();
		System.out.println("done...");
    }
}
