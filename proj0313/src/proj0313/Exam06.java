package proj0313;

public class Exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100, num2 = 0;
		try {
			System.out.println(num1/num2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("��꿡 ������ �־��");
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
