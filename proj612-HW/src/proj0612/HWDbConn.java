package proj0612;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HWDbConn {
	static Connection dbConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hwdb", "root", "root");
			return conn;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return conn;
		}
	}
}
