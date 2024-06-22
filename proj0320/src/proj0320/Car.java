package proj0320;

public class Car {
	//1. 필드, 속성, 변수
	private String color;
	protected int speed;
	// protected : 자식한테는 보여줌
	//static
	static int carCount = 0;
	final static int MAXSPEED = 200;
	final static int MINSPEED = 0;
	//2. 생성자
	//source -> generate constructor with fields
	public Car(String color, int speed) {
		super();
		this.color = color;
		this.speed = speed;
		carCount++;
		
	}
	Car() {
		carCount++;
	}
	
	//3. 메소드
	static int curCarCount() {
		return carCount;
	}
	
	//soucre -> generate getters and setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	

	
}
	


// public : 모두, private : 개인, protected 자식