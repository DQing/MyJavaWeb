package javabeans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class ISzhuce {

	public boolean zhuce(LinkedList<String> list){

		boolean flag = false;
		String url = "jdbc:mysql://localhost/test";
		String username = "root";
		String password2 = "mysql";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, username, password2);
			Statement stmt = conn.createStatement();

			String sql = "insert into user" + "(username,password,name,age,sex,phone)" + "values('" +list.get(0) + "','"
					+list.get(1) + "','" + list.get(2) + "','" +list.get(3)+ "','" +list.get(4) + "','" +list.get(5) + "')";
			stmt.executeUpdate(sql);
		String sql1 = "insert into login" + "(usename,password)" + "values('" +list.get(0) + "','" + list.get(1) + "')";
			stmt.executeUpdate(sql1);
		   flag=true;
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFound:");
			System.out.println(e.getMessage());
		} catch (SQLException se) {
			System.out.println("Êý¾Ý¿âÓÐ´íÎó¡£¡£");
			while (se != null) {
				System.out.println(se.getSQLState());
				System.out.println(se.getMessage());
				System.out.println(se.getErrorCode());
				se.printStackTrace();
				se = se.getNextException();
			}
		}
		return flag;
	}
}
