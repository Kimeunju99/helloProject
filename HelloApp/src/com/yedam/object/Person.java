package com.yedam.object;

public class Person{
	private String name;
	private int age;
	
	Person(){	name = "기본값";		age = 0;	}
	Person(String name, int age){	this.name = name;		this.age = age;	}
	
	
	void setName(String name){ this.name = name;}
	String getName(){ return this.name;}
	
	void setAge(int age) { 
		if(age < 0) this.age = 10;
		else this.age = age;
	}
	int getAge() { return this.age;}
	
	void showInfo() {
		System.out.printf("이름은 %s이고 나이는 %d입니다.\n", this.name, this.age);
	}
	
	void yearAfter(int year) {
		System.out.printf("%s의 %d년 후 나이는 %d입니다.\n", this.name, year, this.age+year);
	}
}