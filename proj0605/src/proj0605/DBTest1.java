package proj0605;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "root");
			System.out.println("sampledb 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc 드라이버 로드 에러");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB 연결 오류");
			e.printStackTrace();
		}
	}

}
