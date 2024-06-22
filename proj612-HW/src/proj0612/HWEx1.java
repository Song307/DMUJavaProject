package proj0612;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class HWEx1 extends JFrame {
	JButton btnInsert, btnSelect, btnSearch, btnUpdate, btnDelete, btnEnd;
	JTextField tfName, tfTel, tfCom;
	JTextArea ta;
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	String inName, inTel, inCom;
	
	public HWEx1() {
		this.setTitle("Homework");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createGui();
		
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { dbInsert(); } });
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { dbDelete(); } });
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { dbUpdate(); } });
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { dbSelect(); } });
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { dbSearch(); } });
		btnEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { dispose(); } });
		
		this.setSize(300,200);
		this.setVisible(true);
		
	}
	
	public void createGui() {

		GridLayout grid = new GridLayout(6, 2);
		grid.setVgap(2);
		Container c = this.getContentPane();
		c.setLayout(grid);
		
		c.add(new JLabel("Name"));
		tfName = new JTextField(20); c.add(tfName);
		c.add(new JLabel("Tel"));
		tfTel = new JTextField(20); c.add(tfTel);
		c.add(new JLabel("Com"));
		tfCom = new JTextField(20); c.add(tfCom);
		
		btnInsert = new JButton("입력"); c.add(btnInsert);
		btnSelect = new JButton("조회"); c.add(btnSelect);
		btnSearch = new JButton("검색"); c.add(btnSearch);
		btnUpdate = new JButton("수정"); c.add(btnUpdate);
		btnDelete = new JButton("삭제"); c.add(btnDelete);
		btnEnd = new JButton("종료"); c.add(btnEnd);
		
	}

	public void dbInsert() {

		conn = HWDbConn.dbConnection();
		try {
			stmt = conn.createStatement();
			inName = tfName.getText().toString();
			inTel = tfTel.getText().toString();
			inCom = tfCom.getText().toString();
			String sql = "insert into addrtbl(name, tel, com) values('"+ inName +"', '"+ inTel +"', '"+ inCom +"');";
			stmt.executeUpdate(sql);
			tfName.setText("");
			tfTel.setText("");
			tfCom.setText("");
			stmt.close();
			conn.close();
			System.out.println(inName + " 입력완료");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("입력 오류");
		}
	}
	public void dbSelect() {
		conn = HWDbConn.dbConnection();
		try {
			stmt = conn.createStatement();
			String sql = "select * from addrtbl";
			rs = stmt.executeQuery(sql);
			var line = "";
			System.out.println("  id      name      tel      com ");
			System.out.println("-----------------------------------");
			while (rs.next()) {
				var id = rs.getString("id");
				var name = rs.getString("name");
				var tel = rs.getString("tel");
				var com = rs.getString("com");
				line = " | " + id + " | " + name + " | " + tel + " | " + com + "";
				System.out.println(line);
			}
			System.out.println("\n");
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void dbDelete() {
		conn = HWDbConn.dbConnection();
		try {
			stmt = conn.createStatement();
			inName = tfName.getText().toString();
			String sql = "delete from addrtbl where name='"+ inName +"';";
			stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
			System.out.println(inName + " 삭제 완료");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("삭제 오류");
		}
	}
	public void dbUpdate() {
		conn = HWDbConn.dbConnection();
		try {
			stmt = conn.createStatement();
			inName = tfName.getText().toString();
			inTel = tfTel.getText().toString();
			inCom = tfCom.getText().toString();
			String sql = "update addrtbl set tel='"+ inTel+"', com='"+inCom+"' where name='"+inName+"';";
			stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
			System.out.println(inName + " 수정 완료");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("수정 에러");
		}
	}
	public void dbSearch() {
		conn = HWDbConn.dbConnection();
		var searchName = tfName.getText().toString();
		try {
			stmt=conn.createStatement();
			
			String sql = " select * from addrtbl where name ='" + searchName + "'; ";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				var line = "";
				var id = rs.getInt("id");
				var name = rs.getString("name");
				var tel = rs.getString("tel");
				var com = rs.getString("com");
				line = " | " + id + " | " + name + " | " + tel + " | " + com + "";
				System.out.println(line);
				System.out.println("\n");
			}
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println(searchName + "를 찾을 수 없습니다.");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HWEx1();
	}
}
