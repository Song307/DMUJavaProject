package proj0320;

public class Student {
	String name;
	int stuld;
	String dept;
	String tel;
	static int shSum;
	
	public Student(String name, int stuld, String dept, String tel) {
		super();
		this.name = name;
		this.stuld = stuld;
		this.dept = dept;
		this.tel = tel;
		shSum++;
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
