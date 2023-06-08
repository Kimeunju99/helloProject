package com.dev;

public class HelloEx {
	public static void main(String[] args) {
		com.dev.emp.Hello hello1 = new com.dev.emp.Hello();
//		hello1.name ="private 접근 불가"
//		hello1.age = 20; //default 다른 패키지 내 접근 불가
		hello1.height = 166.7; //public
		
//		World world = new World(); // default 접근 불가
	}
}
