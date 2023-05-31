package com.yedam.contol;
import java.util.Scanner;
public class CtrolEx2 {
	public static void main(String[] args) {
//		sw1and2();
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("월을 입력하세요: ");
		int month = scan.nextInt();
		System.out.println(month +"월달의 마지막 날은: "+sw3(month));
		
		scan.close();
	}
	
	
	public static void sw1and2() {
		int result = (int) (Math.random() *3) + 1;
		switch(result) {
		case 1:
			System.out.println("가위");	break;
		case 2:
			System.out.println("바위");	break;
		case 3:
			System.out.println("보");	break;
		default:
			break;
		}//가위/바위/보 출력
		System.out.println("end of swith1.");
		
		int score = (int) (Math.random() *91) + 10;
		switch(score/10) {
		case 10:
			System.out.println("A+");	break;
		case 9:
			System.out.println("A");	break;
		case 8:
			System.out.println("B");	break;
		case 7:
			System.out.println("B");	break;
		default:
			System.out.println("D");	break;
		}//성적출력
		System.out.println("end of swith2.");	
	}
	
	public static int sw3(int month) {
		//getLastDate, 주어진 월의 마지막 날을 리턴
		int lastday = 0;
		switch(month) {
		case 2: 
			lastday = 28; 
			break;
		case 4:
		case 6:
		case 9:
		case 11: 
			lastday = 30; 
			break;
		default: 
			lastday = 31; 
			break;
		}
		return lastday;
	}
}
