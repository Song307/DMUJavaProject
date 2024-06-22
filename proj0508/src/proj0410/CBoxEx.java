package proj0410;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CBoxEx extends JFrame {
	private String [] names = {"사과", "배", "체리"};
	private int[] prices = {100, 500, 20000};
	int sum = 0;
	
	CBoxEx(){
		setTitle("체크박스 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		JCheckBox apCbox = new JCheckBox(names[0]);
		JCheckBox baeCbox = new JCheckBox(names[1]);
		JCheckBox cherryCbox = new JCheckBox(names[2]);
		
		c.add(apCbox);
		c.add(baeCbox);
		c.add(cherryCbox);
		
		JLabel sumLabel = new JLabel("현재 0원 입니다.");
		c.add(sumLabel);
		
		apCbox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (apCbox.isSelected())
					sum = sum + prices[0];
				else
					sum = sum - prices[0];
				sumLabel.setText("현재" + sum + "원 입니다.");
			}
		});
		
		baeCbox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (baeCbox.isSelected())
					sum = sum + prices[1];
				else
					sum = sum - prices[1];
				sumLabel.setText("현재" + sum + "원 입니다.");
			}
		});
		
		cherryCbox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (cherryCbox.isSelected())
					sum = sum + prices[2];
				else
					sum = sum - prices[2];
				sumLabel.setText("현재" + sum + "원 입니다.");
			}
		});

		
	
		setSize(250, 200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CBoxEx();
	}

}
