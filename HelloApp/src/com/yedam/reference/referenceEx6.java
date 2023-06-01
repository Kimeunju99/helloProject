package com.yedam.reference;
import java.util.Scanner;

public class referenceEx6 {
	public static void main(String[] args) {
		int[][] intAry = {  new int[] { 80, 90 }, // 홍길동의 영어, 수학
							new int[] { 85, 85 }, // 김길동의 영어, 수학
							new int[] { 70, 80 } // 박길동의 영어, 수학
		};
		int engSum = 0;
		int mathSum = 0;
		int totalSum =0;
		
		//영어 점수 합계
		for (int i = 0; i < intAry.length; i++)
			engSum += intAry[i][0];
		System.out.println("영어 점수 합계: " + engSum);
		
		//수학 점수 합계
		for (int i = 0; i < intAry.length; i++)
			mathSum += intAry[i][1];
		System.out.println("수학 점수 합계: " + mathSum);
		
		//모든 점수 합계
		for(int i=0;i<intAry.length;i++)
			for(int j=0;j<intAry[i].length;j++)
				totalSum += intAry[i][j];
		System.out.println("총합계: " + totalSum);
		
		
		
		String nameArr[] = {"홍길동", "김길동", "박길동"};
		Scanner scan = new Scanner(System.in);
		System.out.printf("학생이름: ");
		String search = scan.nextLine();
		
		for (int i = 0; i < intAry.length; i++) {
			if(nameArr[i].equals(search)) { //해당하는 이름이 있음
				System.out.printf("%s의 영어점수는 %d, 수학점수는 %d\n", nameArr[i], intAry[i][0], intAry[i][1]);
				break; //for를 더이상 돌리지 않고 빠져나감
			}else if(nameArr[i] == nameArr[nameArr.length-1]) //해당하는 이름이 없고(첫번째 if->false), 현재 인덱스가 마지막에 닿음 -> 해당 인물이 존재하지 않음
				System.out.println("해당하는 이름이 없습니다.");
		}
		scan.close();
	}
}
