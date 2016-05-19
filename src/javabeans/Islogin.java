package javabeans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Islogin {

	public boolean login(String usename, String password) throws Exception {

		 Statement stmt = null;
		 Connection conn = null;
		String url = "jdbc:mysql://localhost/test";
		String username = "root";
		String password2 = "mysql";

		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, username, password2);
		stmt = conn.createStatement();
		boolean flag = false;
		String sql = "select * from login where usename='" + usename + "'";
		stmt.executeQuery(sql);// ÷¥––≤È—Ø”Ôæ‰
		ResultSet rs = stmt.getResultSet();
		while (rs.next()) {
			String name = rs.getString(1);
			String pass = rs.getString(2);
			if (name.equals(usename) && pass.equals(password)) {
				flag = true;
			}
		}

		rs.close();
		stmt.close();
		conn.close();
		return flag;
	}

}
