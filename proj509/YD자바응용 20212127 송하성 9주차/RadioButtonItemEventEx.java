package proj0410;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonItemEventEx extends JFrame{
	private JRadioButton [] radio = new JRadioButton [3];
	private String [] text = {"사과", "배", "체리"};
	private ImageIcon [] image = {
			new ImageIcon("D:\\CS\\javaProject\\workSpace\\proj0508\\apple.jpg"),
			new ImageIcon("D:\\CS\\javaProject\\workSpace\\proj0508\\bae.jpg"),
			new ImageIcon("D:\\CS\\javaProject\\workSpace\\proj0508\\cherry.jpg")};
	private JLabel imageLabel = new JLabel();
	
	public RadioButtonItemEventEx() {
		setTitle("라디오버튼 ActionEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.gray);
		ButtonGroup g = new ButtonGroup();
		
		for (int i=0; i<radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if (radio[0].isSelected())
						imageLabel.setIcon(image[0]);
					else if(radio[1].isSelected())
						imageLabel.setIcon(image[1]);
					else
						imageLabel.setIcon(image[2]);
				}
			});
		}
		c.add(radioPanel);
		setSize(250, 200);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonItemEventEx();
	}

}
