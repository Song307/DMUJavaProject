package proj0410;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class EventEx01 extends JFrame {
	
	EventEx01(){
		this.setTitle("이벤트 예제1");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = this.getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(new JLabel("자바는 재미있나요 ?"));
		JButton yesbt = new JButton("Yes");
		JButton nobt = new JButton("No");
		cp.add(yesbt);
		cp.add(nobt);
		yesbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Yes, 자바는 재미있습니다.");
			}
		});
		nobt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("No, 자바는 재미없습니다.");
			}
		});
		
		this.setSize(500, 100);
		this.setVisible(true);
	}
	
}

