package Final20212127;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

import javax.swing.*;



public class InputEx1 extends JFrame {
	JButton btnInsert, btnSelect, btnPrint, btnSearch;
	JTextField tfid, tfName, tfEmail, tfTel, tfSearch;
	JTextArea ta;
	JRadioButton rbId, rbName, rbDept;
	JComboBox<String> strCombo;
	Connection conn;
	Statement stmt;
	ResultSet rs;
	int index;
	String indept;
	String [] dept = {"컴퓨터소프트웨어공학과", "인공지능학과", "컴퓨터정보공학과", "전기전자공학과", "정보통신과", "로봇공학과"};
	
	public InputEx1() {
		this.setTitle("20212127 송하성");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createGui();
		
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { dbInsert();;}  });
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { dbSelect();}  });
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { dbPrint();}  });
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { dbSearch();}  });
		this.setSize(300,500);
		this.setVisible(true);
	}
	
	public void createGui() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("학번"));
		tfid = new JTextField(20); c.add(tfid);
		c.add(new JLabel("이름"));
		tfName = new JTextField(20); c.add(tfName);
		c.add(new JLabel("e-mail"));
		tfEmail = new JTextField(20); c.add(tfEmail);
		c.add(new JLabel("연락처"));
		tfTel = new JTextField(20); c.add(tfTel);
		
		
		JComboBox<String> strCombo = new JComboBox<String>(dept);
		c.add(strCombo);
		int index = strCombo.getSelectedIndex();
		String indept = dept[index];
		
		btnInsert = new JButton("입력"); c.add(btnInsert);
		btnSelect = new JButton("조회"); c.add(btnSelect);
		btnPrint = new JButton("보고서출력"); c.add(btnPrint);
		
		tfSearch = new JTextField(17); c.add(tfSearch);
		btnSearch = new JButton("검색"); c.add(btnSearch);
		
		rbId = new JRadioButton("학번", true);
		rbName = new JRadioButton("이름");
		rbDept = new JRadioButton("학과");
		ButtonGroup group = new ButtonGroup();
		group.add(rbId);
		group.add(rbName);
		group.add(rbDept);
		ta = new JTextArea(15, 20);
		c.add(ta);
	}
	
	public void dbInsert() {
		conn = DBConn.dbConnection();
		try {
			stmt = conn.createStatement();
			String inid = tfid.getText().toString();
			String inName = tfName.getText().toString();
			String inEmail = tfEmail.getText().toString();
			String inTel = tfTel.getText().toString();

			
			String sql ="insert into tb_student(sid, sname, sdept, semail, sphone) values('"+ inid +"', '"+ inName +"', '"+ indept +"', '"+ inEmail +"', '"+ inTel +"')";
			stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
			System.out.println(inName + "입력 완료");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("입력 에러");
		}
	}
	
	public void dbSelect() {
		try {
			conn = DBConn.dbConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select sid, sname, sdept from tb_student");
			var line = "";
			ta.setText("    학번                    이름                      학과     \n");
			ta.append("--------------------------------------------------------------\n");
			while(rs.next()) {
				var name = rs.getString("sname");
				var dept = rs.getString("sdept");
				var id = rs.getString("sid");
				line = " | " + id + " | " + name + " | " + dept + "\n";
				ta.append(line);
			}
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void dbPrint() {
		try {
			conn = DBConn.dbConnection();
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void dbSearch() {
		conn = DBConn.dbConnection();
		var searchName = tfSearch.getText().toString();
		try {
			stmt=conn.createStatement();
			String sql = "select * from tb_student where sname ='" + searchName + "'; ";
			rs = stmt.executeQuery(sql);
			var line = "";
			ta.append("--------------------------------------------------------------\n");
			while(rs.next()) {
				var name = rs.getString("sname");
				var dept = rs.getString("sdept");
				var id = rs.getString("sid");
				var email = rs.getString("semail");
				var tel = rs.getString("sphone");
				var date = rs.getString("inDate");
				line = " | " + id + " | " + name + " | " + dept + "\n" + " | " + email + " | " + tel + " \n| " + date + "\n" ;
				ta.append(line);
			}
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println(searchName + "를 찾을 수 없습니다.");
		}
		
	}
	
	public void write() {
		conn = DBConn.dbConnection();
		try {
			stmt=conn.createStatement();
			rs = stmt.executeQuery("select * from tb_student");
			
			try {
				FileOutputStream fout = new FileOutputStream(".\\Final20212127");
				
				while(rs.next()){
					var name = rs.getString("sname");
					var dept = rs.getString("sdept");
					var id = rs.getString("sid");
					var email = rs.getString("semail");
					var tel = rs.getString("sphone");
					var date = rs.getString("inDate");
					String line = " | " + id + " | " + name + " | " + dept + "\n" + " | " + email + " | " + tel + " \n| " + date + "\n" ;
					System.out.println("보고서 저장 완료");
				}
				
				fout.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("보고서 저장 완료");
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InputEx1();
		
	}
}




