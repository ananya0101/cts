package project;

import java.sql.*;
import java.util.*;

public class newp {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("try"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anna","root","welcome"); 
			
			Statement stmt = con.createStatement(); 
			ArrayList<studnts1> list = new ArrayList<studnts1>();
			for(int j=0;j<2;j++) {
				int i = Integer.parseInt(sc.nextLine());
				String st=sc.nextLine();
				Boolean b=Boolean.parseBoolean(sc.nextLine());
				studnts1 so=new studnts1(i,st,b);
				list.add(so);
				PreparedStatement pstmt = con.prepareStatement("insert into studnts values(?,?,?)");
				pstmt.setInt(1, i);
				pstmt.setString(2,st);
				pstmt.setBoolean(3, b);
				pstmt.executeUpdate();
			}
			
			
		ResultSet set=stmt.executeQuery("select * from studnts");
		while(set.next())
		{
			studnt1 s=new studnt1(set.getInt(1),set.getString(2),set.getBoolean(3));
			//list.add(s);
		}
		
		/*Iterator i=list.iterator();
		while(i.hasNext())
		{
			studnts1 s=(studnts1)i.next();
			System.out.println(s);
			*/			
		
		
		con.close();
		}
		catch(Exception e)
		{ System.out.println(e);
		} 
	}

}
class studnts1
{
	int id;
	String na;
	boolean b;
	
	
	public studnts1(int id, String na, boolean b) {
		
		this.id = id;
		this.na = na;
		this.b = b;
	}


	@Override
	public String toString() {
		return "studnt1 [id=" + id + ", na=" + na + ", b=" + b + "]";
	}
	
}

