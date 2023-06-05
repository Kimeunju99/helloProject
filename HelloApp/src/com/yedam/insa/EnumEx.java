package com.yedam.insa;
public class EnumEx {
	public static void main(String[] args) {
		Student s1 = new Student("23-01","Hong",80,Gender.MEN);
		Student s2 = new Student("23-02","Kim",83,Gender.MEN);
		Student s3 = new Student("23-03","Park",79,Gender.WOMEN);
		Student s4 = new Student("23-04","Lee",95,Gender.WOMEN);
		
		Student[] list = {s1,s2,s3,s4};
		
		for(int i=0; i<list.length;i++)
			if(list[i].getGender() == Gender.WOMEN)
				System.out.println("이름: " +list[i].getName()+", 점수: "+list[i].getScore());
	}
}
