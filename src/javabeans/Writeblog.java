package javabeans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Writeblog {

	public boolean writeblog(String title, String str) {
		boolean flag = false;
		String url = "jdbc:mysql://localhost/test";
		String username = "root";
		String password = "mysql";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stmt = conn.createStatement();

			String sql = "insert into blog" + "(idBlog,bl)" + "values('" + title + "','" + str + "')";
			stmt.executeUpdate(sql);
			sql = "select idBlog,bl from blog";
			stmt.executeQuery(sql);
			flag = true;
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
