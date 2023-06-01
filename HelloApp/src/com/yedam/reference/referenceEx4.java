package com.yedam.reference;

public class referenceEx4 {
	public static void main(String[] args) {
		String[] strAry = { "홍길동", "김민수", "최수민" };
		strAry[0] = "Hong";
//		System.out.println(strAry[0]);

		for (int i = 0; i < strAry.length; i++) {
//			System.out.println(strAry[i]);
			if(strAry[i].equals("김민수"))
				System.out.printf("%s은(는) %d번째에 있습니다.\n", strAry[i], i+1);
		}
		for (String s : strAry) {
			System.out.println(s);
		}
		
		//문자열의 값에서도 인덱스 기준 스펠링카운터
		String s1 = "hongkildong";
		char result = s1.charAt(4); //index search -> char return
		System.out.println("charAt: " + result);
		int idx = s1.indexOf('k'); //char search -> index return , not find -> -1
		System.out.println("indexOf: " + idx);
		
		//주민번호 배열 950304-1234567, 950404-2234567
		String idAry[] = {"950304-1234567", "950404-2234567"};
		//문자 ='', 문자열=""
		for(int i=0; i<idAry.length;i++) {
			if(idAry[i].charAt(7) == '1')
				System.out.println(idAry[i] + ": 남자");
			else
				System.out.println(idAry[i] + ": 여자");
	
		}
		
	}
}
