package proj0529;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class AddrMain {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Addr> addlist = new ArrayList<Addr>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		while(true) {
			System.out.println("-------------");
			System.out.println("1. 주소록 입력");
			System.out.println("2. 주소록 검색");
			System.out.println("3. 주소록 전체 조회");
			System.out.println("4. 주소록 수정");
			System.out.println("5. 주소록 삭제");
			System.out.println("0. 종료");
			System.out.println("-------------");
			System.out.println("메뉴를 입력하세요: ");
			int menu = sc.nextInt();
			//여기에 if문 또는 case 문 
			switch (menu) {
			case 1: {addrInput(); break;}
			case 2: {addrSearch(); break;}
			case 3: {addrDisplay(); break;}
			case 4: {addrUpdate(); break;}
			case 5: {addrDelete(); break;}
			case 0: System.exit(0);
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
		
		
	}
	public static void addrInput() {
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		System.out.println("전화번호를 입력하세요 : ");
		String tel = sc.next();
		System.out.println("회사 이름을 입력하세요 : ");
		String com = sc.next();
		Addr one = new Addr(name, tel, com, LocalDateTime.now());
		addlist.add(one);
	}
	static void addrSearch() {
		System.out.println("검색할 이름을 입력하시오 : ");
		String name = sc.next();
		System.out.println("== 이름으로 검색 조회 ==");
		for(Addr one : addlist) {
			if(one.getName().equals(name))
				System.out.println(one);
		}
	}
	static void addrDisplay() {
		for(Addr one : addlist) {
			System.out.println(one);
		}
	}
	static void addrUpdate() {
		System.out.println("수정할 이름을 입력하시오.");
		String name = sc.next();
		System.out.println("수정할 전화번호을 입력하시오.");
		String tel = sc.next();
		System.out.println("수정할 회사이름을 입력하시오.");
		String com = sc.next();
		for(Addr one : addlist) {
			if(one.getName().equals(name)) {
				one.setTel(tel);
				one.setCom(com);
				System.out.println(one + "로 수정되었습니다.");
			}
		}
	}
	static void addrDelete() {
		System.out.println("삭제할 이름을 입력하시오.");
		String name = sc.next();
		for(int i = 0; i < addlist.size(); i++) {
			if(addlist.get(i).getName().equals(name)) {
				addlist.remove(i);
			}
		}
		
	}


	
	
}
