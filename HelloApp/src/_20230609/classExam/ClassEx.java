package _20230609.classExam;

import java.lang.reflect.Method;

public class ClassEx {
	public static void main(String[] args) {
		Class cls = Member.class;
		//클래스 정보 보기1
		try {
			cls = Class.forName("com.yedam.Member");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//클래스 정보 보기2
		Member m1 = new Member();
		cls = m1.getClass();
		
		System.out.println(cls.getName());
		
		Method[] methods = cls.getDeclaredMethods();
		for(Method m: methods)
			System.out.println(m.getName());
	}
}
