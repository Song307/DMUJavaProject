package proj0313;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student("���ϼ�", 2127, "�ļ�", "01093970958");
		Student stu2 = new Student("���ϻ�", 2128, "�ļ�", "01032313219");
		
		System.out.println("�л�1�� ���� : " + stu1.getName() + ", " + stu1.getStuld() + ", " + stu1.getDept() + ", " + stu1.getTel());
		System.out.println("�л�2�� ���� : " + stu2.getName() + ", " + stu2.getStuld() + ", " + stu2.getDept() + ", " + stu2.getTel());
	}

}
