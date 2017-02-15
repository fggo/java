package PhoneBookProject.PhoneInfo;

import java.io.Serializable;

public class PhoneInfo implements Serializable{
	private String name;
	private String phoneNum;

	public PhoneInfo(String name, String phoneNum){
		this.name = name;
		this.phoneNum =phoneNum;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public int hashCode(){
		return name.hashCode();
	}
	
	public boolean equals(Object obj){
		PhoneInfo cmp = (PhoneInfo)obj;
		
		if(getName().compareTo(cmp.getName()) == 0)
			return true;
		else
			return false;
	}
	
	public String toString(){
		return "name: " +getName() + " phone: "+getPhoneNum();
	}
	
	public void showPhoneInfo(){
		System.out.println("name: " + getName());
		System.out.println("phone: " + getPhoneNum());
	}
}
