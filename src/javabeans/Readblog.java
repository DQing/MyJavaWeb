package javabeans;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Readblog {

	public boolean read(String id) {
		boolean flag = false;
		String url = "jdbc:mysql://localhost/test";
		String username = "root";
		String password2 = "mysql";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, username, password2);
			Statement stmt = conn.createStatement();

			String sql = "select * from blog where idblog='" + id + "'";
			stmt.executeQuery(sql);// 执行查询语句
		     flag=true;
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFound:");
			System.out.println(e.getMessage());
		} catch (SQLException se) {
			System.out.println("数据库有错误。。");
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
