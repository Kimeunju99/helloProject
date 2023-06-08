package _20230607.pk2;
import _20230607.pk1.Parent;

public class Child extends Parent{
	public void print() {
//		this.name ="hong"; //private -> 접근 불가
//		this.id = "user2"; //default -> 접근 불가
		this.pw = "2222"; //protected -> 접근 가능
		this.addr = "Daegu"; //public
	}
}
