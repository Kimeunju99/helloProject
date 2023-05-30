package com.yedam.variable;

//클래스명은 대문자로 시작하는 게 관례.
public class VariableEx1 {
	public static void main(String[] args) {
		//변수: 변하는 값을 저장, 컴퓨터의 메모리 저장 공간에 값을 저장
		int num1; //정수 -, 0 , +
		num1 = 100;
		
		double num2; // 실수
		num2 = 12.3;
		num2 = 123; // 정수 -> 실수로 자동 형변환
		
		double result = 0;
//		result = num1 + num2; //<- 타입 오류로 연산 불가 (변수 범위 int < double)
		result = (double) num1 + num2; //명시적 형변환
		System.out.println(result);
		
		//변수의 종류
		//정수: byte(1), short(2), int(4), long(8)
		//실수 : float(4), double(8)
		//boolean: true/false
		//객체(class): 문자열(String)
		//1byte -> 8bit -> 2*2*2*2*2*2*2*2 (=2^8) : -128 ~ 127
//		byte b1 = 128; //범위를 넘어섬
		System.out.println(Integer.MAX_VALUE);
		
		
		byte b1 = 127;
		short s1 = 128;
		//정수 연산의 기준은 int 
//		short readd = (short) b1 + s1; 그래서 에러가 난다
		int readd1 = b1 + s1;
		long l1 = 2147483648L; // L을 붙이지 않으면 int로 인식
		long readd2 = (long)b1+ (long)s1 + l1;
		
		b1++;
		System.out.println("b1의 값: " + b1); // result = -128  (why)byte의 최대값을 넘겼기 때문
		
		
	}
}
