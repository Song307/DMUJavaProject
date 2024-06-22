package proj0612;

import java.sql.*;

public class DBtest2_1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "root");
			String inid = "20230009", inname = "동파랑", indept = "컴소과";
			String sql = "insert into studenttb1(id, name, dept) values(?, ?, ?);";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, inid);
			pstmt.setString(2, inname);
			pstmt.setString(3, indept);
			pstmt.executeUpdate();
			System.out.println(inname + " 입력완료. ");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
