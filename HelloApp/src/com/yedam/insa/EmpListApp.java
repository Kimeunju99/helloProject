package com.yedam.insa;

import java.util.Scanner;

public class EmpListApp {	
	public static void main(String[] args) {
		empList app = empList.getInstance(); //EmpList사원정보 등록,조회,출력
		Scanner scan = new Scanner(System.in);
		int selectNo = 0;
		boolean run = true;
		//Employee: 데이터 입출력 정보
		
		while(run) {
			System.out.println("1.사원수 2.사원등록 3.사원목록 4.검색 5.급여총합 6.종료");
			System.out.print("선택> ");
			selectNo = scan.nextInt();
			
			if(selectNo ==1) {
				app.init();
			}else if(selectNo ==2) {
				app.input();
			}else if(selectNo ==3) {
				app.print();
			}else if(selectNo ==4) {
				System.out.print("조회할 사원번호 입력>");
				int id = scan.nextInt();
				System.out.println("사원 이름: " + app.search(id));
			}else if(selectNo ==5) {
				app.sumSal();
			}else if(selectNo ==6)
				run = false;
			else {
				System.out.println("1~6 사이 숫자만 입력");
			}
		}//while

		System.out.println("프로그램 종료.");
		scan.close();
	}
}
