package proj0320; //exam10.java

//abstract
abstract public class Animal {
	//1.필드
	private String name;
	abstract void move();
	
}


class Tiger extends	Animal {
	int age;  		//add unimplemented method

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("네 발로 이동한다.");
	} 
}
//-----------------
class Eagle extends Animal {
	String home;

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("날개로 이동한다");
	}
}
//-----------------------









