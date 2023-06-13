package _20230613.phonebook;

import java.io.Serializable;

public class PhoneCompanyInfo extends PhoneInfo implements Serializable{
	private String company;
	
	public PhoneCompanyInfo(String name, String phoneNumber, String company){
		super(name, phoneNumber);
		this.company = company;
	}
	//파일 저장 시 저장형태
	@Override
	public String toString() {
		return INPUT_SELECT.COMPANY + "," + this.getName() + "," + this.getPhoneNumber() + ","+ company +"\n";
	}
	
	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("company: " + company);
	}
}
