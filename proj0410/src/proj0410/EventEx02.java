package proj0410;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventEx02 extends JFrame{
	EventEx02(){
		this.setTitle("2번째 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Container cp = this.getContentPane();
		//cp.setLayout(new FlowLayout());
		JPanel pn1 = new JPanel();
		JButton btred = new JButton("Red");
		JButton btgre = new JButton("Green");
		JButton btyel = new JButton("Yello");
		pn1.add(btred); pn1.add(btgre); pn1.add(btyel);
		
		JPanel pn2 = new JPanel();
		JLabel lbInfo = new JLabel("Info : click the Button!");
		
		JPanel pnMain = new JPanel();
		pnMain.add(pn1);
		pnMain.add(pn2);
		
		btred.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Red button Clicked!");
				lbInfo.setText("Red button Clicked!");
				pn1.setBackground(Color.red);
				pnMain.setBackground(Color.red);
			}
		});

		btgre.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Green button Clicked!");
				lbInfo.setText("Green button Clicked!");
				pn1.setBackground(Color.green);
				pnMain.setBackground(Color.green);
			}
		});
		
		btyel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Yellow button Clicked!");
				lbInfo.setText("Yellow button Clicked!");
				pn1.setBackground(Color.yellow);
				pnMain.setBackground(Color.yellow);
			}
		});
		
		pn2.add(lbInfo);
		
		
		
		this.add(pnMain);
		
		
		this.setSize(350, 150);
		this.setVisible(true);
	}
}
