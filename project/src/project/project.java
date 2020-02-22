package project;

import java.sql.*;
import java.util.*;


public class project {

	public static void main(String[] args)  {
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("try"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anna","root","welcome"); 
			
			Statement stmt = con.createStatement(); 
			ArrayList<studnt1> list = new ArrayList<studnt1>();
			
		ResultSet set=stmt.executeQuery("select * from studnt");
		while(set.next())
		{
			studnt1 s=new studnt1(set.getInt(1),set.getString(2),set.getBoolean(3));
			list.add(s);
		}
		Iterator i=list.iterator();
		while(i.hasNext())
		{
			studnt1 s=(studnt1)i.next();
			System.out.println(s);
		}
		con.close();
		}
		catch(Exception e)
		{ System.out.println(e);
		} 
	}

}
class studnt1
{
	int id;
	String na;
	boolean b;
	
	
	public studnt1(int id, String na, boolean b) {
		
		this.id = id;
		this.na = na;
		this.b = b;
	}


	@Override
	public String toString() {
		return "studnt1 [id=" + id + ", na=" + na + ", b=" + b + "]";
	}
	
}