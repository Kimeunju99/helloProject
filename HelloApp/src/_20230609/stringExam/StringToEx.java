package _20230609.stringExam;

public class StringToEx {
	public static void main(String[] args) {
		System.out.println("------------대소문자 변경------------");
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2)); //false
		
		String low = str1.toLowerCase();
		String up = str2.toLowerCase();
		
		System.out.println(low.equals(up)); //true
		System.out.println(str1.equalsIgnoreCase(str2));//true
		
		System.out.println("------------공백 제거------------");
		//*****trim()은 앞뒤 공백만 잘라내기에 중간에 있는 공백은 제거할 수 없다
		String tel1 ="  02";
		String tel2 ="123    ";
		String tel3 = "12 34    ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}
}
