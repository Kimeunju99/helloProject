package _20230607.inherit;

public class CompFriend extends Friend{
	private String comp;
	private String depart;
	
	public CompFriend() {super();}
	public CompFriend(String name, String phone, String comp, String depart) {
		super(name, phone);
		this.comp=comp;
		this.depart=depart;
	}
	
	public String getComp() {	return comp;}
	public String getDepart() {return depart;}
	
	
	public void setComp(String comp) {this.comp = comp;}
	public void setDepart(String depart) {this.depart = depart;}
	
	@Override
	public String showInfo() {
		// TODO Auto-generated method stub
		return "이름:" + getName() + ", 연락처:" + getPhone() + ", 회사:" + comp + ", 부서:" + depart;
	}
}
