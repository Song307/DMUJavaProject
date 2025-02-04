package proj0522;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.tools.FileObject;

class TimerRunnable implements Runnable {
	private JLabel timerLabel;
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n = 0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);		// 1초동안 잠을 잔다.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				return;
			}		
		}
	}
}

public class ThreadInterruptEx extends JFrame {
	private Thread th;
	public ThreadInterruptEx() {
		setTitle("hreadInterruptEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		th = new Thread(runnable); // 스레드 생성
		c.add(timerLabel);
		
		//버튼을 생성하고 Action 리스너 등록
		JButton btn = new JButton("Kill Timer");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				th.interrupt();		//타이머 스레드 강제 종료
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false);		//버튼 비활성화
			}
		});
		c.add(btn);
		setSize(300,170);
		setVisible(true);
		
		th.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadInterruptEx();
	}

}
