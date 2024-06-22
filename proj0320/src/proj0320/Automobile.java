package proj0320; //Car.java

public class Automobile extends Car{
	//1. 필드
	private int seatNum;
	//2.생성자
	//3.메소드 만들기
	void upSpeed(int value) {
		if(speed + value >= 300)
			speed = 300;
		else
			speed = speed + value;
	}
	//source -> generate getters and setters
	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	
}



//void = 리턴값 x
