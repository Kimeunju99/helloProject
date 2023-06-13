package _20230613.phonebook;

import java.io.Serializable;

import lombok.Data;

@Data
public class PhoneInfo implements Serializable{
	private String name;
	private String phoneNumber;
	
	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public void showPhoneInfo() {
		System.out.println("name: " + name);
		System.out.println("phone: " + phoneNumber);
	}
	
	//파일 저장 시 저장형태
	@Override
	public String toString() {
		return INPUT_SELECT.NORMAL +"," + name + "," + phoneNumber + "\n";
	}

	//논리적 동일 객체(이름이 같음)
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		PhoneInfo info = (PhoneInfo) obj;
		if(info.name.compareTo(this.name) == 0) { //값이 같음
			return true;
		}
		return false;
	}
}
