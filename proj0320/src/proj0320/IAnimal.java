package proj0320; 
//인터페이스 (p.47)

interface IAnimal {
	abstract void eat(); //public abstract 자동으로 컴파일러 만듦. -> abstract 생략 가능
}

//---------------
class iCat implements IAnimal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("생선을 좋아한다.");	
	}	
}
//---------------
class iTiger extends Animal implements IAnimal {      //Animal <- 클래스, IAnimal <- 인터페이스

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("멧돼지를 좋아한다.");
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("네 발로 움직인다.");
	}
	
	
	
	
	
	
	
}