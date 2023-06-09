package _20230609.stringExam;

public class StringIndexOfEx {
	public static void main(String[] args) {
		String sub = "자바 프로그래밍";
		
		int location = sub.indexOf("프로그래밍");
		System.out.println(location);
		
		if(sub.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책");
		}else {
			System.out.println("자바와 관련없는 책");
		}
		
		System.out.println("---------------------------------");
		
		String oldstr = "자바는 객체지향 언어. 자바는 풍부한 API를 지원";
		String newstr = oldstr.replace("자바", "java");
		System.out.println(oldstr);
		System.out.println(newstr);
	}
}
