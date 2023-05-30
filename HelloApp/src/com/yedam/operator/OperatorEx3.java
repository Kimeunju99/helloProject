package com.yedam.operator;
import java.util.Scanner;

public class OperatorEx3 {
	public static void main(String[] args) {
//		method1();
//		method2();
		method3();
		
	}
	
	public static void method1() {
		int num1 = 1;
		while(num1 <= 10) {
			System.out.println(num1++);
		}
		System.out.println("end of program");
		
		boolean isOK = true;
		num1 = 1;
		while(isOK) {
			System.out.println(num1++);
			if(num1 > 10)
				isOK = false;
		}
		System.out.println("end of program");
		
		
		isOK =true;
		Scanner scn = new Scanner(System.in);
		while(isOK) {
			System.out.println("문장을 입력하세요. (종료: quit)");
			String str = scn.nextLine();
			System.out.println("입력값은: " + str + "입니다.");
			if(str.equals("quit")) {
				System.out.println("end of program");
				isOK = false; //or break;
			}
		}
		scn.close();
	}//method1 end
	
	public static void method2() {
		//balance 변수 , 입력값 판단 1->balance 변수에 추가 || 2-> 값 빼기 || 3-> 콘솔에 출력 || 4-> 실행 종료
		//0 < balance < 100,000
		int balance = 0, ans = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("< 1:값 추가 | 2:값 차감 | 3:값 출력 | 4:종료 >");
			ans = scan.nextInt();
			if(ans == 1) {
				System.out.print("더할 값을 입력하세요: ");
				ans = scan.nextInt();
				if(balance+ans >100000) {
					System.out.println("100,000을 초과할 수 없습니다. 현재 예금액: "+ balance + "입니다");
				}else {
					System.out.println("예금 완료.");
					balance += ans;
				}
			}else if(ans == 2) {
				System.out.print("뺄 값을 입력하세요: ");
				ans = scan.nextInt();
				if(balance - ans < 0) {
					System.out.println("현재 : "+ balance + "입니다. 마이너스 통장이 불가합니다.");
				}else {
					System.out.println("출금 완료.");
					balance -= ans;
				}
			}else if(ans == 3) {
				System.out.println("현재 예금액은: "+ balance + "입니다");
			}else if(ans == 4){
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("1~4 사이의 값을 입력하세요.");
			}
		}
		System.out.println("end of prog");
	}

	public static void method3() {
		int balance = 0, ans = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("< 1:값 추가 | 2:값 차감 | 3:값 출력 | 4:종료 >");
			ans = scan.nextInt();
			if(ans == 1) {
				System.out.print("더할 값을 입력하세요: ");
				ans = scan.nextInt();
				if(balance+ans >100000) {
					System.out.printf("100,000을 초과할 수 없습니다. 현재 예금액: %d원입니다. \n", balance);
				}else {
					System.out.println("예금 완료.");
					balance += ans;
				}
			}else if(ans == 2) {
				System.out.print("뺄 값을 입력하세요: ");
				ans = scan.nextInt();
				if(balance - ans < 0) {
					System.out.printf("현재: %d원입니다. 마이너스 통장이 불가합니다. \n", balance);
				}else {
					System.out.println("출금 완료.");
					balance -= ans;
				}
			}else if(ans == 3) {
				System.out.printf("현재 예금액은: %d원입니다. \n", balance);
			}else if(ans == 4){
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("1~4 사이의 값을 입력하세요.");
			}
		}
		System.out.println("end of prog");
	}
}
