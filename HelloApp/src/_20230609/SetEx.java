package _20230609;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("wolrd");
		list.add("hello");

		System.out.println("--ARRAYLIST--");
		for(String t : list)
			System.out.println(t);
		
		//SET: 중복x
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add("world");
		set.add("hello");
		
		System.out.println("--SET1--");
		for(String t : set)
			System.out.println(t);
		
		Set<Member> members = new HashSet<Member>();
		members.add(new Member("user1", "1111"));
		members.add(new Member("user2", "2222"));
		members.add(new Member("user1", "1111"));

		System.out.println("--SET2--");
		for(Member m : members)
			System.out.println(m.getId() +", "+ m.getPw());
		//**** Member에서 HashCode 오버라이드 전에는 user1이 두 번 출력되지만
		//**** HashCode 오버라이드 후에는 같은 요소로 인식해(why. id의 해시값이 같음) 한 번만 출력됨
		
	}
}
