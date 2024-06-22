package proj0320;

public class exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car("빨강", 0);
		Car myCar2 = new Car("파랑", 0);
		Car myCar3 = new Car("초록", 0);
		System.out.println(myCar1.getColor() + "," + myCar1.getSpeed());
		System.out.println(myCar1.getColor() + "," + myCar2.getSpeed());
		System.out.println(myCar1.getColor() + "," + myCar3.getSpeed());
		//static
		System.out.println("만들어진 객체수" + Car.carCount);
		System.out.println("만들어진 객체수(메소드호출)" + Car.curCarCount());
		System.out.println("차의 최고 속도 =" + Car.MAXSPEED);
		
		System.out.println("파이 값" + Math.PI);
		System.out.println("3의 5제곱" + Math.pow(3, 5));
	}

}

//책 예제 3-12 Car.java-정적 구성 요소 추가