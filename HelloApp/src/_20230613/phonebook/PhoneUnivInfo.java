package _20230613.phonebook;

import java.io.Serializable;

public class PhoneUnivInfo extends PhoneInfo implements Serializable{
	private String major;
	private int year;
	
	public PhoneUnivInfo(String name, String phoneNumber, String major, int year){
		super(name, phoneNumber);
		this.major = major;
		this.year = year;
	}
	
	//파일 저장 시 저장형태
	@Override
	public String toString() {
		return INPUT_SELECT.UNIV + "," + this.getName() + "," + this.getPhoneNumber() + ","+ major +","+ year +"\n";
	}
	
	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("major: " + major);
		System.out.println("year: " + year);
	}
}
