package proj0410;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginEx extends JFrame {
	public LoginEx() {
		setTitle("LOGIN FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(3);
		
		Container cp = getContentPane();
		cp.setLayout(grid);
		
		cp.add(new JLabel("Email"));
		JTextField emailtxt = new JTextField();
		cp.add(emailtxt);
		
		cp.add(new JLabel("Password"));
		JPasswordField pstxt = new JPasswordField();
		cp.add(pstxt);
		
		JButton logbt = new JButton("Login");
		
		cp.add(logbt);
		//로그인 이벤트 처리
		logbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String email = emailtxt.getText();
				String passwd = pstxt.getText();
				System.out.println("Email : " + email + ", Pw : " + passwd);
			}
		});
		JButton cancelbt = new JButton("Cancel");
		cp.add(cancelbt);
		//취소 이벤트 처리
		cancelbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				emailtxt.setText("");
				pstxt.setText("");
			}
		});

		setSize(300, 150);
		setVisible(true);
		
	}
	
}
