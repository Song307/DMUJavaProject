package proj0410;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelEx extends JFrame {
	public LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("사랑합니다");
		
		ImageIcon beauty = new ImageIcon("D:\\CS\\javaProject\\workSpace\\proj0508\\Love.jpg");
		JLabel imageLabel = new JLabel(beauty);
		c.add(textLabel);
		c.add(imageLabel);
		
		setSize(400, 600);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx();
	}

}
