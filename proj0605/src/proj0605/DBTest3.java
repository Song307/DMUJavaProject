
package proj0605;
import java.sql.*;

public class DBTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "root");
			System.out.println("sampledb 연결 성공");
			
			Statement stmt = conn.createStatement();

//			String inid = "20230011", inname = "제니", indept = "무용과";
//			String sql = "insert into studenttb1(id, name, dept) values ('" + inid + "', '"+ inname +"', '"+ indept +"');";
//			stmt.executeUpdate(sql);
//			System.out.println(inname + "입력 완료");
			
			
			String inname = "블랙핑크 제니";
			String sql = "update studenttb1 set name='"+ inname +"' where name = '제니';";
			stmt.executeUpdate(sql);
			System.out.println(inname + " 업데이트 완료");

//			String sql = "delete from studenttb1 where name = '변우석';";
//			stmt.executeUpdate(sql);
//			System.out.println("삭제 완료");
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
