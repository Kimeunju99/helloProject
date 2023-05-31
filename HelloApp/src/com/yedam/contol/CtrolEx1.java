package com.yedam.contol;

public class CtrolEx1 {
	public static void main(String[] args) {
//		oddor();
//		randomscore();
	}
	
	public static void oddor() {
		// Math.random(); //0~1 사이 임의의 수를 생성. (실수 값임)
		int result = (int)(Math.random() * 10); //0~9 까지의 난수 -> 1을 더하면 1~10
		System.out.println(result);
		if(result %2 ==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
				
	}

	public static void randomscore() {
		//10~100까지의 임의의 수 생성
		//100~90=A / 89~80=b / 79~70=c/ etc = D
		int score = (int)(Math.random() * 91) + 10;
		String str = "";
		if(score >= 90) {str="A";}
		else if (score >= 80) {str="B";}
		else if (score >= 70) {str="C";}
		else {str="D";}
		System.out.println(score +" = " + str);
	}
}
