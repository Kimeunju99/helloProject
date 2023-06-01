package com.yedam.reference;

import java.util.Scanner;

public class referenceEx8 {
	public static void main(String[] args) {
		//학생 수 점수 입력 -> 점수 목록 출력 ->최고점, 평균 출력
		Scanner scan = new Scanner(System.in);
		int stu = 0;
		double scoreArr[] = null;
		boolean run = true;
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.학생 수  2.점수입력  3.점수리스트  4.분석  5.종료");
			System.out.println("-----------------------------------------");
			System.out.printf("선택> ");
			int select = Integer.parseInt(scan.nextLine());
			//학생 수 결정
			if(select == 1) {
				System.out.printf("학생 수를 입력하세요.: ");
				stu =Integer.parseInt(scan.nextLine());
				scoreArr =new double[stu];
				System.out.println("학생 수 입력 완료");
			//점수 입력	
			}else if(select == 2) {
				if(scoreArr == null) {
					System.out.println("학생 수를 먼저 입력해주세요.");
				}else{
					System.out.printf("총 %d명의 점수를 입력할 수 있습니다.\n", stu);
					for(int i=0; i<scoreArr.length;i++) {
						System.out.printf("%d번째 학생의 점수> ", i+1);
						scoreArr[i] = Double.parseDouble(scan.nextLine());
					}
					System.out.printf("점수 입력 완료 \n");
				}
			//배열 출력	
			}else if(select == 3) {
				if(scoreArr == null) {
					System.out.println("학생 수를 먼저 입력해주세요.");
				}else{
					int isZero = 0;
					for(int i=0; i<stu;i++)
						isZero += scoreArr[i];
					if(isZero == 0) {
						System.out.println("점수가 입력되지 않았습니다.");	
					}else {
						System.out.println("점수 리스트입니다.");
						for(int i=0; i<stu;i++)
							System.out.println(i+1 + "번 학생: " + scoreArr[i]);
					}
				}
			//최고점, 평균	
			}else if(select == 4) { 
				if(scoreArr == null) {
					System.out.println("학생 수를 먼저 입력해주세요.");
				}else{
					double max = 0, avg = 0;
					int isZero = 0;
					for(int i=0; i<stu;i++)
						isZero += scoreArr[i];
					if(isZero == 0) {
						System.out.println("점수가 입력되지 않았습니다.");	
					}else {
						for(int i=0; i<scoreArr.length;i++) {
							avg += scoreArr[i];
							if(max < scoreArr[i])
								max = scoreArr[i];
						}
						avg = avg/stu;
						System.out.printf("최고점: %.2f, 평균: %.2f \n", max, avg);
					}
				}
				
			}else if(select == 5) {//종료
				System.out.println("END.");
				run = false;
				
			}else {
				System.out.println("1~5 사이 값을 입력해주세요.");
			}
			
		}
		
	}
}
