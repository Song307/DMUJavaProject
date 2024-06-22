package proj0529;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class rambdaEx2 extends JFrame {
	public rambdaEx2() {
		setTitle("Ranbda Example 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel lb = new JLabel("아이스크림을 좋아하나요?");
		JButton btnOk = new JButton("예");
		JButton btnNo = new JButton("아니오");
		c.add(lb);
		c.add(btnOk);
		c.add(btnNo);

		
		btnOk.addActionListener( e -> System.out.println("예, 아이스크림을 좋아합니다."));
		btnNo.addActionListener( e -> System.out.println("아니요, 아이스크림을 싫어합니다."));
		
		setSize(300,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new rambdaEx2();
		
	}

}
