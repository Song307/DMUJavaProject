package proj0522;

class TimerRunnable1 implements Runnable {
	int n = 0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println(n);
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
		}
		
	}
}

public class TestRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th = new Thread(new TimerRunnable1());
		th.start();
	}

}
