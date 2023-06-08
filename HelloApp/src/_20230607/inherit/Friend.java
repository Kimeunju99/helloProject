package _20230607.inherit;

public class Friend {
	//FIELDS
	private String name;
	private String phone;
	
	//CONSTRUCTOR
	public Friend(){}
	public Friend(String name, String phone){this.name=name; this.phone=phone;}
	
	
	//GETTER
	public String getName() {		return name;	}
	public String getPhone() {		return phone;	}
	
	//SETTER
	public void setName(String name) {	 this.name = name;	}
	public void setPhone(String phone) { this.phone = phone;}
	
	public String showInfo() {
		return "이름:" + name + ", 연락처:" + phone ;
	}
	
}
