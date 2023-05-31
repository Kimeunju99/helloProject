package com.yedam.operator;

import java.io.IOException;

public class OperatorEx4 {
	public static void main(String[] args) {
//		profcode();
		mycode();
	}

	
	public static void mycode() {
		try {
			int result = 0;
			System.out.println("값을 입력하세요: ");
			while(true) {
				result = System.in.read();
			
				if(result >= 65 && result <= 90) {
					System.out.println("대문자");
					System.out.println("값을 입력하세요: ");
				}else if(result >= 97 && result <= 122) {
					if(result == 113)
						break;
					System.out.println("소문자");
					System.out.println("값을 입력하세요: ");
				}else if(result >= 48 && result <= 57) {
					System.out.println("숫자");
					System.out.println("값을 입력하세요: ");
				}else if(result == 13 || result == 10) {
				}else {
					System.out.println("기타값");
					System.out.println("값을 입력하세요: ");
				}
			}
		} catch (IOException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("'q' input END.");
		}
	}

	public static void profcode() { //교수님 코드, 문제점: 여러 값을 입력하면 뒤쪽 문자는 읽지 못함
		try {
			while(true) {

				System.out.println("값을 입력하세요: ");
				int result = System.in.read();
				if(result >= 65 && result <= 90) {
					System.out.println("대문자");
				}else if(result >= 97 && result <= 122) {
					if(result == 113)
						break;
					System.out.println("소문자");
				}else if(result >= 48 && result <= 57) {
					System.out.println("숫자");
				}else if(result == 13 || result == 10) {
				}else {
					System.out.println("기타값");
				}
				
				if(result == 13 || result == 10) {
				System.in.read();
				System.in.read(); //엔터 값 10,13을 소진시키기 위해 추가함
				}
			}
		} catch (IOException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("END.");
		}
	}

}
