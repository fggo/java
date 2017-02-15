package PhoneBookProject.PhoneInfo;

public class PhoneUnivInfo extends PhoneInfo{
	private String major;
	private int gradYear;

	public PhoneUnivInfo(String name, String phoneNum, String major, int gradYear){
		super(name, phoneNum);
		this.major = major;
		this.gradYear = gradYear;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGradYear() {
		return gradYear;
	}
	public void setGradYear(int gradYear) {
		this.gradYear = gradYear;
	}
	
	public String toString(){
		return "name: " +getName() + " major: " + getMajor() + " grad year: "+ getGradYear();
	}
	
	public void showPhoneInfo(){
		super.showPhoneInfo();
		System.out.println("major: " + getMajor());
		System.out.println("grad year: " + getGradYear());
	}
}
