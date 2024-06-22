package proj0410;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboEx extends JFrame {
	private String [] fruits =  {"apple", "banana", "kiwi", "mango",
			"peach", "berry", "strawberry", "blackberry"};
	ComboEx(){
		setTitle("콤보박스 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JComboBox<String> nameCombo = new JComboBox<String>(fruits);
		c.add(nameCombo);
			
		nameCombo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object name =  nameCombo.getSelectedItem().toString();
				System.out.println(name);
				int index = nameCombo.getSelectedIndex();
				System.out.println(index + ", " + fruits[index]);
			}
		});
		
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ComboEx();
	}

}
