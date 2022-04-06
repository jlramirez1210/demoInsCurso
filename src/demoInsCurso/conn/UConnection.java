package demoInsCurso.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UConnection {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/demoInsCurso";
	private static String username = "root";
	private static String password = "";

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
