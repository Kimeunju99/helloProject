package com.yedam.contol;

public class CtrolEx1 {
	public static void main(String[] args) {
		// Math.random(); //0~1 사이 임의의 수를 생성. (실수 값임)
		int result = (int)(Math.random() * 10); //0~9 까지의 난수
		System.out.println(result);
	}
}
