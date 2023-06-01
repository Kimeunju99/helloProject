package com.yedam.reference;

public class referenceEx7 {
	public static void main(String[] args) {
		//학교의 키. a반(2), b반(4), c반(3)
		double[][] heightArr = {{173.5, 168.3}, //a
								{158.7,177.9,172.4,186.2}, //b
								{164.7,169.9,176.5}}; //c
		
//		System.out.println(heightArr[1].length); //b반의 인원 수
		
		double avgArr[] = new double[heightArr.length]; //각 반의 평균키를 담을 배열
		
		for(int i=0; i<heightArr.length; i++) { //반의 수 만큼 루프 돌림
			for(int j=0;j<heightArr[i].length; j++) { //반의 학생 수 만큼 루프 돌림
				avgArr[i] += heightArr[i][j]; //i번째 반 학생의 키 총합
			}
			avgArr[i] = avgArr[i] / heightArr[i].length; //i번째 각 반의 키 평균
			System.out.println(i+1 + "번째 반의 평균 키: "+ avgArr[i]);
		}
		
	}
}
