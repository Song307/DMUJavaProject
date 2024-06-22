package proj0320;

import java.util.ArrayList;

public class Exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strList = new ArrayList<>();
		strList.add("컴소과");
		strList.add("컴정과");
		strList.add("인소과");
		for (String item : strList) {         //for (String 변수명 : strList)
			System.out.println(item);
		}
		
		ArrayList<Car> carList = new ArrayList<Car>();
		Car myCar = new Car("빨강", 100);// 객체 만들기
		Car momCar = new Car("파랑", 20);
		
		carList.add(myCar);
		carList.add(momCar);
		carList.add(new Car("초록", 80));     // 안에서 객체 만들기 가능
		for (Car carone : carList) {
			if (carone.getSpeed() >= 50)
			System.out.println(carone.getColor() + ", " + carone.getSpeed());
		}
	}

}
