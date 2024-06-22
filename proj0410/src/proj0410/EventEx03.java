package proj0410;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EventEx03 extends JFrame {
	EventEx03(){
		this.setTitle("익명 클래스 리스너 작성");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = this.getContentPane();
		cp.setLayout(new FlowLayout());
		JButton btn1 = new JButton("빨간색");
		JButton btn2 = new JButton("초록색");
		JButton btn3 = new JButton("노란색");
		cp.add(btn1);
		cp.add(btn2);
		cp.add(btn3);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cp.setBackground(Color.red);
			}
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cp.setBackground(Color.green);
			}
		});
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cp.setBackground(Color.yellow);
			}
		});
		this.setSize(350,150);
		this.setVisible(true);
	}
}
