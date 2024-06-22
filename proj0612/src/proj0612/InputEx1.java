package proj0612;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;


public class InputEx1 extends JFrame {
	JButton btnInsert, btnDelete, btnUpdate, btnSelect, btnSearch;
	JTextField tfId, tfName, tfDept, tfSearch;
	JTextArea ta;
	JRadioButton rbId, rbName, rbDept;
	Connection conn;
	Statement stmt;
	ResultSet rs;
	String inTfId, inTfName, inTfDept;
	
	public InputEx1() {
		this.setTitle("학생 관리 프로젝트");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createGUI();
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				inTfId = tfId.getText();
				inTfName = tfName.getText();
				inTfDept = tfDept.getText();
				dbInsert(); }
		});
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { dbDelete(); }
		});
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { dbUpdate(); }
		});
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { dbSelect(); }
		});
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { dbSearch(); }
		});
		
		
		this.setSize(280, 550);
		this.setVisible(true);
	}
	public void createGUI() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("학번"));
		tfId = new JTextField(20); c.add(tfId);

		c.add(new JLabel("이름"));
		tfName = new JTextField(20); c.add(tfName);
		
		c.add(new JLabel("학과"));
		tfDept = new JTextField(20); c.add(tfDept);
		
		btnInsert = new JButton("입력"); c.add(btnInsert);
		btnUpdate = new JButton("수정"); c.add(btnUpdate);
		btnDelete = new JButton("삭제"); c.add(btnDelete);
		btnSelect = new JButton("조회"); c.add(btnSelect);
		
		tfSearch = new JTextField(18);
		rbId = new JRadioButton("학번", true);
		rbName = new JRadioButton("이름");
		rbDept = new JRadioButton("학과");
		ButtonGroup group = new ButtonGroup();
		group.add(rbId);
		group.add(rbName);
		group.add(rbDept);
		
		btnSearch = new JButton("검색");
		JPanel pn1 = new JPanel();
		pn1.add(new JLabel(" "));
		pn1.add(tfSearch);
		pn1.add(btnSearch);
		
		JPanel pn2 = new JPanel();
		pn2.add(rbId);
		pn2.add(rbName);
		pn2.add(rbDept);
		
		JPanel pMiddle = new JPanel(new BorderLayout(0,0));
		pMiddle.add(BorderLayout.NORTH, pn1);
		pMiddle.add(BorderLayout.CENTER, pn2);
		TitledBorder tb = new TitledBorder("검색");
		pMiddle.setBorder(tb);
		c.add(pMiddle);
		
		ta= new JTextArea(15, 20);
		c.add(ta);
	}

	public void dbSearch() {
		try {
			conn = DBConn.dbConnection();
			stmt = conn.createStatement();
			var searchText = tfSearch.getText().toString();
			var searchSql = "";
			if (rbId.isSelected()) {
				searchSql = "select * from studenttb1 where id = '" + searchText + "';";
			} else if (rbName.isSelected()) {
				searchSql = "select * from studenttb1 where name = '" + searchText + "';";
			} else {
				searchSql = "select * from studenttb1 where dept = '" + searchText + "';";
			}
			rs = stmt.executeQuery(searchSql);
			var line = "";
			ta.setText("   id           name         dept \n");
			ta.append("-------------------------------------- \n");
			while (rs.next()) {
				var name = rs.getString("name");
				var dept = rs.getString("dept");
				var id = rs.getString("id");
				line = " | " + id + " | " + name + " | " + dept + "\n";
				System.out.println("rs=> " + line);
				ta.append(line);
			}
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void dbInsert() {
		try {
			conn = DBConn.dbConnection();
			stmt = conn.createStatement();
			String sql = "insert into studenttb1(id, name, dept) values('"+ inTfId + "', '" + inTfName +"', '"+ inTfDept +"');";		
			stmt.executeUpdate(sql);
			
			stmt.close();
			conn.close();
			System.out.println(inTfName + " 입력완료. ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void dbDelete() {
		try {
			conn = DBConn.dbConnection();
			stmt = conn.createStatement();
			String sql = "delete from studenttb1 where id='"+ inTfId + "';";		
			stmt.executeUpdate(sql);
			
			stmt.close();
			conn.close();
			System.out.println(inTfId + " 삭제완료. ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void dbSelect() {
		try {
			conn = DBConn.dbConnection();
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("select * from studenttb1;");
			var line = "";
			ta.setText("   id           name         dept \n");
			ta.append("-------------------------------------- \n");
			while (rs.next()) {
				var name = rs.getString("name");
				var dept = rs.getString("dept");
				var id = rs.getString("id");
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
	public void dbUpdate() {
		try {
			conn = DBConn.dbConnection();
			stmt = conn.createStatement();
			String in_id = tfId.getText().toString();
			String in_name = tfName.getText().toString();
			String in_dept = tfDept.getText().toString();
			stmt.executeUpdate("update studenttb1 set dept ='" + in_dept +"', name = '"+ in_name +"' where id = '"+ in_id + "'");
			System.out.println(in_name + " 수정 완료 ");
			tfId.setText("");
			tfName.setText("");
			tfDept.setText("");
			stmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("수정 에러");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InputEx1();	
	}

}
