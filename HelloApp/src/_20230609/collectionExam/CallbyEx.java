package _20230609.collectionExam;

class Emp{
	int id;
	String name;
}

public class CallbyEx {
	public static void main(String[] args) {
		int a = 10;
		meth1(a); //call by value
		System.out.println(a);
		
		Emp emp = new Emp();
		emp.name ="홍길동";
		meth2(emp);//call by reference
		System.out.println(emp.name);
		
		//string, wrapper 객체 = 메소드의 인수 사용 call by value
		String b ="hello";
		meth3(b);
		System.out.println(b);
	}
	
	public static void meth1(int a) {
		a = a * a;
	}
	
	public static void meth2(Emp e) {
		e.name = "김길동";
	}
	
	public static void meth3(String str) {
		str ="world";
	}
}
