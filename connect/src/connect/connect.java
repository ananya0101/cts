package connect;
import java.sql.*;
public class connect {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/anna","root","welcome");  
			
			Statement stmt = con.createStatement();  
			  
			int cid = 400;
			String fname = "Jain";
		    String lname = "Jan";
		    String city= "Delhi";
		    String sql = "INSERT INTO customer values ("+cid+", '"+fname+"',+'"+lname+"',+'"+city+"')";
		    
		    stmt.executeUpdate(sql);
		    
		    ResultSet rs=stmt.executeQuery("select * from customer");  
			  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));  
			  
						
			System.out.println("Done !!!!!!!!");
			}catch(Exception e){ System.out.println(e);
			} 
	}
}
