package PhoneBookProject.PhoneInfo;

public class PhoneCompanyInfo extends PhoneInfo{
	private String company;

	public PhoneCompanyInfo(String name, String phoneNum, String company){
		super(name, phoneNum);
		this.company = company;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String toString(){
		return "name: " +getName() + " company: " + getCompany();
	}
	
	public void showPhoneInfo(){
		super.showPhoneInfo();
		System.out.println("company: " + getCompany());
	}
}
