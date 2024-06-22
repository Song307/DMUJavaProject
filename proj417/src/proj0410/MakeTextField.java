package proj0410;

import java.awt.Button;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MakeTextField extends JFrame{
	public MakeTextField() {
		this.setTitle("Making TextField");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(2);
		
		Container cp = getContentPane();
		cp.setLayout(grid);
		
		cp.add(new JLabel("Name : "));
		JTextField nameTxt = new JTextField();
		cp.add(nameTxt);
		
		cp.add(new JLabel("Dept : "));
		JTextField deptTxt = new JTextField();
		cp.add(deptTxt);
		
		cp.add(new JLabel("Location : "));
		JTextField loTxt = new JTextField();
		cp.add(loTxt);
		
		JButton btnOk = new JButton("Ok");
		cp.add(btnOk);
		
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nameInput = nameTxt.getText();
				String deptInput = deptTxt.getText();
				int intInput = Integer.parseInt(deptInput);
				String loInput = loTxt.getText();
				
				System.out.println("Name : " + nameTxt.getText());
				System.out.println("Dept : " + deptTxt.getText());
				System.out.println("Location : " + loTxt.getText());
			}
		});
		
		JButton btnNo = new JButton("No");
		cp.add(btnNo);
		
		this.setSize(300,150);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MakeTextField();
	}

}
