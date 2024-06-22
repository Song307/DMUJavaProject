package proj0522;

class TimerThread extends Thread {
		int n=0;
		//스레드 코드 작성 source -> override -> run()

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}
		}
		
}

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimerThread th = new TimerThread();
		th.start();
	}

}
