package proj0403;
//설계도

import java.awt.*;
import javax.swing.*;

public class ConPaneEx extends JFrame {
	ConPaneEx() {
		this.setTitle("학번 이름");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = this.getContentPane();
		cp.setBackground(Color.white);
		cp.setLayout(new FlowLayout());
		
		
		JButton btok = new JButton("OK");	
		cp.add(btok);		// = cp.add(new JButton("Ok"));
		
		JButton btcancel = new JButton("Cancel");	
		cp.add(btcancel);		// = cp.add(new JButton("Cancel"));
		
		cp.add(new JButton("무시"));
		
		this.setSize(300, 150);
		this.setVisible(true);
	}

}
