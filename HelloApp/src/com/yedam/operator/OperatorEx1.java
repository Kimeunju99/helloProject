package com.yedam.operator;
import java.util.Scanner;

public class OperatorEx1 {
	//method: 객체에 소속된 함수
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		
//		String str = "";
//		try {
////			System.out.println("숫자를 입력하세요.");
////			result = scan.nextInt(); //정수 입력받기
////			System.out.println("입력 값은:" + result);
//			System.out.println("문자를 입력하세요.");
//			str = scan.nextLine(); //문자 입력받기
//			System.out.println("입력 값은:" + str);
//			
//		}catch(Exception e){
//			System.out.println("입력 오류.");
//		}finally {
//			scan.close();
//		}
		
		
		//ex1: 두 수를 입력받아 사이의 값들을 모두 더함
//		int num1 = 0, num2 = 0;
//		result = 0;
//		try {
//			System.out.println("첫 번째 숫자를 입력하세요.");
//			num1 = scan.nextInt();
//			System.out.println("두 번째 숫자를 입력하세요.");
//			num2 = scan.nextInt();
		
//			if(num1 < num2) {
//				for(int i = num1; i<=num2; i++) {
//					result = result + i;
//				}
//			}else if(num1 ==num2){
//				System.out.println("같은 값" + num1 + "을 입력하였습니다.");
//			}else {
//				for(int i = num2; i<=num1; i++) {
//					result = result + i;
//				}
//			}
//		}catch(Exception e) {
//			System.out.println("입력 오류.");
//		}finally {
//			System.out.println("두 값 사이의 합:" + result);	
//			scan.close();
//		}
		
		
		//ex2:두 값을 입력받아 짝수만 더하여 계산함
		int num1 = 0, num2 = 0;
		result = 0;
		try {
			System.out.println("첫 번째 숫자를 입력하세요.");
			num1 = scan.nextInt();
			System.out.println("두 번째 숫자를 입력하세요.");
			num2 = scan.nextInt();
			
			if(num1 < num2) {
				for(int i = num1; i<=num2; i++){
					if(i % 2 == 0) 
						result += i;
				}
			}else if(num1 > num2){
				for(int i = num2; i<=num1; i++) {
					if(i % 2 == 0)
						result += i;
				}
			}else{	System.out.println("같은 값 " + num1 + "을 입력하였습니다.");
			}
		}catch(Exception e) {
			System.out.println("입력 오류.");
		}finally {
			System.out.println("두 값 사이의 합:" + result);
			scan.close();
		}
		
		
		
	}
}
