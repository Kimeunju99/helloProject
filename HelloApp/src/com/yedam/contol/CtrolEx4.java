package com.yedam.contol;

public class CtrolEx4 {
	public static void main(String[] args) {
		method1();//1~100에서 3의 배수 합계 - 메소드1
		method2();//주사위 1~6(Math.random) 2번 던져 두 수의 합이 5가 되는 경우 반복 중단 - 메소드2
		method3(5);//for를 이용해 별이 라인마다 하나씩 증가하는 코드 작성.
		method4(7);// method3() 오른쪽 정렬 - 내 코드
		method5();// method3() 오른쪽 정렬 - 교수님 코드
	}
	
	
	public static void method1() {
		int sum = 0;
		for(int i =1; i<=100;i++)
			if(i%3==0)
				sum += i;
		System.out.println("1~100사이 3의 배수 합계: "+sum);
	}
	
	public static void method2() {
		int num1 = 0, num2 = 0;
		while(true) {
			num1 = (int)(Math.random() * 6)+1;
			num2 = (int)(Math.random() * 6)+1;
			if(num1 != 0 && num2 != 0) {
				if(num1+num2 != 5) {
					System.out.printf("%d , %d\n", num1, num2);
				}else break;
			}
		}
		System.out.printf("%d , %d 두 수의 합이 5입니다.\n", num1, num2);
	}
	
	public static void method3(int section) {
		for(int i=1; i<=section; i++) {
			String star = "";
			for(int j=1;j<=i; j++) {
				star += "*";
			}
			System.out.println(star);
		}
	}
	
	public static void method4(int section) {
		String space ="";
		for(int i=1; i<=section; i++) {
			String star = "";
			for(int j=1;j<=i; j++) {
				space ="";
				for(int k=j;k<section;k++)
					space += " ";
				
				star += "*";
			}
			System.out.println(space+star);
		}
	}
	
	public static void method5() {
		for(int i=1; i<=4; i++) {
			for(int j=1;j<=4; j++) {
				if(i + j >= 5) {
					System.out.printf("*");
				}else
					System.out.printf(" ");
			}
			System.out.println();
		}
	}
	
}
