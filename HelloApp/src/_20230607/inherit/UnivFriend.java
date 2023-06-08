package _20230607.inherit;

public class UnivFriend extends Friend {
	private String univ;
	private String major;

	public UnivFriend() {
		super();
	}

	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
	}

	public String getUniv() {
		return univ;
	}

	public String getMajor() {
		return major;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String showInfo() {
		// TODO Auto-generated method stub
		return "이름:" + getName() + ", 연락처:" + getPhone() + ", 학교:" + univ + ", 전공:" + major;
	}
}
