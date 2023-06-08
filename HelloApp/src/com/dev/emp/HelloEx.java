package com.dev.emp;

public class HelloEx {
	public static void main(String[] args) {
		Hello hello = new Hello();
//		hello.name ="private라 접근 불가";
		hello.setName("Hong");
		hello.age = 20; //default: 동일 패키지 내 접근 가능
		hello.height =166.8; //public 모두 접근 가능
	
		World world = new World();
		
		//main's parameter
		for(String str: args)
			System.out.println(str); //Run Configurations -> arguments에서 arg1 arg2 추가하면 -> sysout에서 보임
	}
}
