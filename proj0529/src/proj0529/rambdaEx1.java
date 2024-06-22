package proj0529;

//하나의 파일안에는 두 개의 public 불가
interface MyFunction {	//람다식은 함수형 인터페이스가 있어야함
	int calc(int x, int y); //람다식으로 구현할 추상 메소드( 메소드는 하나만 존재 해야함 )
}
interface MyFunction2 {
	int kyesan(int x);
}
interface MyFunction3 {
	void print();
}



public class rambdaEx1 {		//ramdaEx1 파일명하고 같은 곳에 public 이 있어야함
	static int getSum(int x, int y){
		return x + y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//+, -, *, /, %, max, min
		int a = 10, b = 5;
		MyFunction add = (x, y) -> {return x + y;};
		MyFunction minus = (x, y) -> {return x - y;};
		MyFunction mul = (x, y) -> {return x * y;};
		MyFunction sub = (x, y) -> {return x / y;};
		MyFunction max = (x, y) -> x >= y ? x : y;
		MyFunction min = (x, y) -> x < y ? x : y;
		
		System.out.println(add.calc(a, b));
		System.out.println(minus.calc(a, b));
		System.out.println(mul.calc(a, b));
		System.out.println(sub.calc(a, b));
		
		MyFunction2 sq = x -> x * x;
		System.out.println(sq.kyesan(a));
		
		MyFunction3 f = () -> System.out.println("Hello ramda!");
		f.print();
		f = () -> System.out.println("hello~");
		f.print();
		
	}
}



