package proj0313;

public class Student {
	String name;
	int stuld;
	String dept;
	String tel;
	
	public Student(String name, int stuld, String dept, String tel) {
		this.name = name;
		this.stuld = stuld;
		this.dept = dept;
		this.tel = tel;
	}
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStuld() {
		return stuld;
	}

	public void setStuld(int stuld) {
		this.stuld = stuld;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	


}



//1. �л� �̸�(name), �й�(stuld), �����а� (dept), ����ó(tel)
// student Ŭ������ �ۼ��ϰ� 2�̻� ��ü ���� �� ��� (Student, StudentEx)

//Ŭ���� (Student.java) 1.private �ʵ� ���� / 2.������ / 3. �޼ҵ�()geter, setter
//��ü����� (StudentEx.java)
//��ü.�޼ҵ�() ���� (StudentEx.jave)