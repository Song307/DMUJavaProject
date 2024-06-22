package proj0605;


import java.sql.*;

import com.mysql.cj.protocol.Resultset;

public class DBTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "root");
			System.out.println("sampledb 연결 성공");
			
			Statement stmt =  conn.createStatement();
			String sql = "select * from studenttb1;";
			ResultSet results = stmt.executeQuery(sql);
			System.out.println("select 완료");
			
			while (results.next()) {
				System.out.println(results.getString(1)+ " " + results.getString("name") + " "+ results.getString("dept"));
			}
			
			
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
