package com.yedam.contol;

public class CtrolEx5 {
	public static void main(String[] args) {
		boolean isTrue = true;
		int sum = 0, cnt = 0;
		
		do {
			System.out.println("print");
			int result = (int)(Math.random()*6)+1;
			sum += result;
			cnt++;
			if(sum > 100)
				isTrue = false;
		}while(isTrue);
		System.out.println("평균: " + sum/cnt);
	
		isTrue = true; cnt = 0;
		while(isTrue) {
			cnt++;
			System.out.println("print");
			
			if(cnt++> 5) {
				isTrue = false;
			}
			if(cnt % 2 == 0)
				System.out.println("짝수입니다.");
			else {
				continue;
//				System.out.println("홀수입니다.");
			}
			
		}
		System.out.println("END");
		
		
	}
}
