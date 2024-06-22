package proj0403;

import javax.swing.JFrame;
public class MyFrame extends JFrame {
	MyFrame() {
		this.setTitle("Making first SwingFrame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame fr1 = new MyFrame();

	}

}
