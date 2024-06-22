package proj0320;

import java.util.ArrayList;

public class StudenEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> sList = new ArrayList<>();
		sList.add(new Student("송하성", 20212127, "컴소", "01093970958"));
		sList.add(new Student("학생2", 20212031, "컴소", "01012314134"));
		sList.add(new Student("학생3", 20212027, "정통", "01012754324"));
		sList.add(new Student("학생4", 20212012, "실디", "01012341345"));
		sList.add(new Student("학생5", 20212012, "실디", "01013321345"));
		sList.add(new Student("학생6", 20212012, "정통", "01012168345"));
		
		System.out.println("전체 학생 수 : " + Student.shSum);
		
		for (Student student : sList) {
			if(student.getDept().equals("컴소")) {
				System.out.println(student.getDept() + ", " + student.getName());
			}
		}
		for (Student student : sList) {
			if(student.getDept().equals("정통")) {
				System.out.println(student.getDept() + ", " + student.getName());
			}
		}
		for (Student student : sList) {
			if (student.getDept().equals("실디")) {
				System.out.println(student.getDept() + ", " + student.getName());
			}
		}

	}
}
