package prep;

import java.sql.*;

public class prep {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anna","root","welcome");
		
		PreparedStatement pstmt = con.prepareStatement("insert into customer values(?,?,?,?)");
		pstmt.setInt(1, 102);
		pstmt.setString(2, "Sanal");
		pstmt.setString(3, "PSTMT");
		pstmt.setString(4, "Kpr");
		
		int res = pstmt.executeUpdate();
		if(res == 1) {
			System.out.println("Inserted .........");
		}
		
		System.out.println("Done .....");
	}

}
