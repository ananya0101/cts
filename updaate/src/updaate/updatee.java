package updaate;
import java.util.*;
import java.sql.*;

public class updatee {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/anna", 
				"root", 
				"welcome");
		
		Statement stmt = con.createStatement();
		
		String newName = sc.nextLine();
		int id = sc.nextInt();
		
		String update = "UPDATE customer set fname='"+newName+"' where cid="+id+"";
		stmt.executeUpdate(update);
		ResultSet rs=stmt.executeQuery("select * from customer");  
		  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)); 
		con.close();
	}

}
