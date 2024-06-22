package proj0410;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventEv01 extends JFrame{

	EventEv01() {
		this.setTitle("이벤트 예제1");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pn1 = new JPanel(); //JFrame 기본 배치 관리자 : 보더, //JPanel 기본 배치 관리자 : flowlayout
		JLabel lbtxt = new JLabel("커피를 좋아하나요?");
		pn1.add(lbtxt);
		JButton btnYes = new JButton("Yes");
		JButton btnNo = new JButton("No");
		pn1.add(btnYes); pn1.add(btnNo);
		btnYes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("커피를 좋아합니다.");
				System.out.println(e);
			}
		});
		btnNo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("커피를 싫어합니다.");
				System.out.println(e);
			}
		});
		
		this.add(pn1);
				
		this.setSize(350, 150);
		this.setVisible(true);
	}
	
}
