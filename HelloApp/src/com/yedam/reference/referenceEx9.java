package com.yedam.reference;

import java.util.Scanner;

class Student1{//referenceEx1에서 Student 클래스를 만들어서 같은 이름을 쓸 수 없다
	String name;
	int eng;
	int math;
	Student1(String name, int eng, int math){
		this.name = name;
		this.eng = eng;
		this.math = math;
	}
}

public class referenceEx9 {
	public static void main(String[] args) {
		//학생 이름(String) 영어(int), 수학(int)
		Student1 stu1 = new Student1("홍길동",90,90);
		Student1 stu2 = new Student1("김길동",85,75);
		Student1 stu3 = new Student1("박길동",75,95);
		Student1[] students = {stu1, stu2, stu3};
		Scanner scan = new Scanner(System.in);

		System.out.println("검색할 이름 입력:");
		String sName = scan.nextLine();
		
		for(int i=0; i<students.length; i++) {
			if(students[i].name.equals(sName)) {
				System.out.println(students[i].name);
				System.out.println(students[i].eng);
				System.out.println(students[i].math);
				System.out.println("-------------------------");
			}
		}
		scan.close();
	}
	
}
