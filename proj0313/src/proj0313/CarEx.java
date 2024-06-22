package proj0313;
//��ü����� -> main �Լ� ���
public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar1 = new Car("����", 0);
		Car mycar2 = new Car("�Ķ�", 0);
		Car mycar3 = new Car("�ʷ�", 0);
		System.out.println(mycar1.getColor() + "\t" + mycar1.getSpeed());
		mycar1.upspeed(50);;
		System.out.println(mycar1.getColor() + "\t" + mycar1.getSpeed());
		mycar3.upspeed(250);
		System.out.println(mycar3.getColor() + "\t" + mycar3.getSpeed());
	}

}
