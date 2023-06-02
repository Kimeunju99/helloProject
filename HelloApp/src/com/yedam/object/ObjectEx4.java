package com.yedam.object;

//Member에 가족(Person) 정보 등록
public class ObjectEx4 {
	public static void main(String[] args) {
		
		Person[] families = {
				new Person("홍아빠", 60),
				new Person("홍엄마", 55),
				new Person("홍동생", 18)
		};
		
		Member m1 = new Member();
		m1.memberId = "user1";
		m1.memberName = "홍길동";
		m1.point = 1000;
		m1.families = families;
		
//		System.out.println(m1.families[0].getName());
//		System.out.println(m1.families[0].getAge());

		Member m2 = new Member();
		
		Member[] members = new Member[10];
		members[0] = m1;
		members[1] = m2;
		
		for(int i=0; i<members.length;i++) {
			String name = members[i].families[0].getName();
		}
		
		
	}
}
