package com.yedam.reference;

public class referenceEx1 {
	 public static void main(String[] args) {
		int age =25;
		double price = 100.5;
		
		String name =new String("홍길동"); //문자열 객체
		String hobby = "독서"; //문자열 리터럴
		
		int age1 = age;
		age=30;
		System.out.println("age: "+age+ " age1: " +age1);
		
		
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 25;
		
		Student s2 = s1; //주소를 참조
		System.out.println(s1.name +" "+ s1.age +" "+ s2.name +" "+ s2.age);
		
		s1.name = "김길동";
		s1.age = 20;
		System.out.println(s1.name +" "+ s1.age +" "+ s2.name +" "+ s2.age);		

//		int age2 =null; //null = 참조 타입에만 가능
		s1 = null; //값이 없다는 의미
		String str3 = null; //값이 없다는 의미
//		System.out.println(s1.name +" "+ s1.age +" "+ s2.name +" "+ s2.age);//nullpointException
		
	 }
}


class Student{
	String name;
	int age;
}