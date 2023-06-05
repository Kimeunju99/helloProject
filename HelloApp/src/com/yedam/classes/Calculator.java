package com.yedam.classes;

public class Calculator {

	static final double PI = 3.14; //final = 상수, static 메소드 안에서 사용되려면 상수도 static
	
	public static void sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("더한 결과: " + result);
	}
	public static void minus(int num1, int num2) {
		int result = num1 - num2;
		System.out.println("뺀 결과: " + result);
	}
	
	public static void getArea(int radius) {
		double result = radius * radius * PI;
		System.out.println("원의 넓이: " + result);
	}
}
