package proj0410;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumberGame extends JFrame{
	int rndNum;

	NumberGame(){
		this.setTitle("숫자 게임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pn1 = new JPanel();
		JLabel lbInfo = new JLabel("숫자를 추측하시오 ");
		JTextField txtInput = new JTextField(10);
		pn1.add(lbInfo); pn1.add(txtInput);
		
		JPanel pn2 = new JPanel();
		JLabel lbResult = new JLabel("숫자를 입력하시오. (1~100)");
		pn2.add(lbResult);
		
		JPanel pn3 = new JPanel();
		JButton btn1 = new JButton("확인");
		JButton btn2 = new JButton("취소");
		pn3.add(btn1);pn3.add(btn2);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String strInput = txtInput.getText();
				int intInput = Integer.parseInt(strInput); 
				if (intInput > rndNum) {
					System.out.println("너무 큽니다. 다시 입력하시오");
					lbResult.setText("너무 큽니다. 다시 입력하시오");
				} else if (intInput < rndNum) {
					System.out.println("너무 작습니다. 다시 입력하시오");
					lbResult.setText("너무 작습니다. 다시 입력하시오");
				} else {
					System.out.println("정답입니다.");
					lbResult.setText("정답입니다.");
				}
			}
		});
		
		
		
		JPanel pnMain = new JPanel();
		pnMain.add(pn1);
		pnMain.add(pn2);
		pnMain.add(pn3);
		this.add(pnMain);
		
		this.setRandomNum();
		
		this.setSize(300,200);
		this.setVisible(true);
		
	}
	
	public void setRandomNum() {
		rndNum = (int)(Math.random() * 100) + 1;
		System.out.println("정답은 : " + rndNum);
	}
}
