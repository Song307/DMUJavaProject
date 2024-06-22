package proj0320;

import java.util.ArrayList;

public class PhoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Phone> phList = new ArrayList<>();
		phList.add(new Phone("갤럭시S23", "삼성전자", 1000000));
		phList.add(new Phone("갤럭시S20", "삼성전자", 200000));
		phList.add(new Phone("아이폰14", "애플", 1500000));
		phList.add(new Phone("갤럭시A33", "삼성전자", 300000));
		phList.add(new Phone("아이폰13", "애플", 900000));

		System.out.println("전체 휴대폰 갯수 : " + Phone.phNum);
		System.out.println("");
		
		System.out.println("애플 : ");
		for (Phone phone : phList) {
			if(phone.getCompany().equals("애플"))
				System.out.println(phone.getpName());
		}
		System.out.println("");
		
		System.out.println("삼성전자 : ");
		for (Phone phone : phList) {
			if(phone.getCompany().equals("삼성전자"))
				System.out.println(phone.getpName());
		}
		System.out.println("");
		
		System.out.println("100만원 미만인 폰 : ");
		for (Phone phone : phList) {
			if(phone.getPrice() < 1000000)
				System.out.println(phone.getpName());
		}

	}
}



