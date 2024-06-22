package proj0320;

public class Phone {
	//필드
	private String pName;
	private String company;
	private int price;
	static int phNum;
	
	public Phone(String pName, String company, int price) {
		super();
		this.pName = pName;
		this.company = company;
		this.price = price;
		phNum++;
	}

	//게터세터
	public String getpName() {
		return pName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}
	
}
