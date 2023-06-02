package com.yedam.object;


public class ObjectEx3 {
	public static void main(String[] args) {
		
//		Person p1 =new Person();
		Person p1 =new Person("홍길동", 10);
//		p1.setName("hong");
//		p1.setAge(20);
		p1.showInfo();
		p1.yearAfter(5);
		
//		System.out.println(p1.getName());
//		System.out.println(p1.getAge());
	}
}
