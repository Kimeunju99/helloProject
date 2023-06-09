package _20230609.stringExam;

public class StringEqualEx {
	public static void main(String[] args) {
		String str1 = new String("신민철");
		String str2 = "신민철";
		
		if(str1 == str2) {
			System.out.println("equal obj");
		}else {
			System.out.println("noneqyal obj");
		}
		
		if(str1.equals(str2)) {
			System.out.println("same string");
		}else {
			System.out.println("not same string");
		}
	}
}
