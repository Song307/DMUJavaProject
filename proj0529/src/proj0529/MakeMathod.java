package proj0529;

public class MakeMathod {
    // x와 y를 받아서 합을 리턴해주는 메소드
    public int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        // getTop 클래스의 인스턴스 생성
    	MakeMathod getTop = new MakeMathod();

        // add 메소드를 호출하여 결과 출력
        int result = getTop.add(5, 10);
        System.out.println("The sum of x and y is: " + result);
    }
}


/*
package proj0529;

//하나의 파일안에는 두 개의 public 불가
interface MyFunction {	//람다식은 함수형 인터페이스가 있어야함
	int calc(int x, int y); //람다식으로 구현할 추상 메소드( 메소드는 하나만 존재 해야함 )
}


public class ramdaEx1 {		//ramdaEx1 파일명하고 같은 곳에 public 이 있어야함
	static int getSum(int x, int y){
		return x + y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Sum = getSum(1, 2);
		System.out.println("더하기" + Sum);
	}
}




 */