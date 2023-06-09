package _20230609.stringExam;

public class StringCharAtEx {
	public static void main(String[] args) {
//		charAtEx(); //charAt
		
		filename();//substring,lastIndexOf,indexOf
		
		method(); //replace,charAt
		
		splitTest(); //split
	}
	public static void charAtEx() {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
		System.out.println("------------------------");
		
		String first = ssn.substring(0,6); //0(포함)~6(제외) cut
		String last = ssn.substring(7); //7~(끝까지) cut
		System.out.println(first);
		System.out.println(last);
	}
	
	public static void filename() {
		String str;
		str = "c:/temp/images/sample.jpg";
		System.out.println("파일명: " + 
		str.substring(str.lastIndexOf("/")+1 , str.indexOf(".")));
	}
	
	public static void method() {
		String[] ssn = {"950102-1234567", "960405 2345678", "9703041234567",
				"0501013456789", "0604014545678", "250903-3234567"};
		for(String s: ssn) {
			System.out.println(s+ "의 성별: " +check(s));
		}
		
	}
	
	public static String check(String str) {
		int thisyear = 23;
		String gender = str.replace("-", "").replace(" ", "");
		char c = gender.charAt(6);
		if(c == '1')
			return "남자";
		else if(c == '2')
			return "여자";
		else if( c == '3') {
			if( thisyear >= Integer.parseInt(str.substring(0,2)))
				return "남자";
		}else if(c =='4') {
			if( thisyear >= Integer.parseInt(str.substring(0,2)))
				return "여자";
		}
		
		return null;
	}

	public static void splitTest() {
		String str = "The class String includes methods for examining individual";
		String[] strs = str.split(" ");
		int cnt =0;
		for(String s: strs) {
			if(s.indexOf("for") == 0)
				cnt++;
		}
			System.out.println("for의 개수: " + cnt);
	}
}
