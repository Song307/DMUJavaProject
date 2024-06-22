package proj0313;
//main() �޼ҵ尡 ���� -> class(���赵) �̱� ����
public class Car {
	//1. �Ӽ�, �ʵ�, ����
	private String color;
	private int speed;
	
	//2. ������ = class �̸� -> ��ü ���鶧 1�� ���
	//source ���� : ��Ŭ�� -> soucre -> generate Constructor using field
	public Car(String color, int speed) {
		super();
		this.color = color;
		this.speed = speed;
	}
	
	//3. ��� �޼ҵ�()
	void upspeed(int value) {
		if (speed + value >= 200)
			speed = 200;
		else
			speed = speed + value;
	}
	void downspeed(int value) {
		if (speed - value <= 0) 
			speed = 0;
		else
			speed = speed - value;
	}
	

	//source -> generate getters and sertters
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
