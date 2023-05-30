package com.yedam.operator;
import java.util.Scanner;

public class OperatorEx2 {
	public static void main(String[] args) {
//		firstMethod();
//		secondMethod();
		
		Scanner scan = new Scanner(System.in);
		int num1=0, num2=0;
		try {
			System.out.print("첫 번째 수를 입력: ");
			num1 = scan.nextInt();
			System.out.print("두 번째 수를 입력: ");
			num2 = scan.nextInt();
		}catch(Exception e) { System.out.println("입력오류"); }
		finally{
			thirdMethod(num1, num2);
			scan.close();
		}
	}//main end
	
	public static void firstMethod() {
		//값 2개를 입력 받아 두번째 값의 제곱승을 구하라
		Scanner scan = new Scanner(System.in);
		int num1=0, num2=0, result=1;
		try {
			System.out.println("<제곱 값 구하기>");
			System.out.println("첫 번째 숫자 입력");
			num1 = scan.nextInt();
			System.out.println("두 번째 숫자 입력");
			num2 = scan.nextInt();
			
			for(int i =0; i<num2;i++)
				result *= num1;
			
		}catch(Exception e) {
			System.out.println("숫자를 입력해 주세요.");
		}finally {
			System.out.println(num1 + "^"+num2 + " 결과: "+ result);
		}
	} //firstMethod end

	public static void secondMethod() {
		//문장 1개, 숫자 1개를 입력 받아 문장을 숫자만큼 반복하는 코드
		Scanner scan = new Scanner(System.in);
		String str = "";
		int count = 0;
		try {
			System.out.println("문장을 입력하세요.");
			str = scan.nextLine();
			System.out.println("반복 횟수를 입력하세요.");
			count = scan.nextInt();
			
		}catch(Exception e) {
			System.out.println("잘못된 값입니다.");
		}finally{
			for(int i=1; i<=count;i++)
				System.out.println(i + ": " + str);
			scan.close();
		}
	}//secondMethod end

	public static void thirdMethod(int n1, int n2) {
		System.out.print(n1 + " + " + n2 + " = ");
		System.out.println(n1 + n2);
	}//thirdMethod end

}
