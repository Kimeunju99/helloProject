package _20230609.collectionExam;

public class Member {
	private String id;
	private String pw;
	
	public Member() {	}
	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public String getId() {	return id;	}
	public String getPw() {	return pw;	}

	public void setId(String id) {	this.id = id;	}
	public void setPw(String pw) {	this.pw = pw;	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Member)) {
			return false;
		}
		Member objs = (Member)obj;
		if(this.id.equals(objs.id) && this.pw.equals(objs.pw)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.id.hashCode();
	}
	
	@Override
	public String toString() {
		return "회원id: "+id+", 회원pw: " + pw;
	}
}
