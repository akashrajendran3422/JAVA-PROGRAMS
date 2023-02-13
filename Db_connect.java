package javaprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Db_connect {

	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/linuxhint","root","root");
			PreparedStatement ps=conn.prepareStatement("select * from family");
			ResultSet rs=ps.executeQuery();
			while(rs.next());
			{
				System.out.println(rs.getString("1"));
			}
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
