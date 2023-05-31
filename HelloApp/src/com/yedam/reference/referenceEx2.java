package com.yedam.reference;

public class referenceEx2 {
	public static void main(String[] args) {
		//int s1 =90, int s2 =80; ...s20=90;
		
		//------------------------------------------------------
		int[] intarr1 = {30,40,50}; //바로 초기화, 공간 한정
		int[] intarr2 = new int[3]; //기본값 0으로 초기화됨, 공간 한정
		//배열의 크기는 정해지면 바꿀 수 없다. intarr2 = new int[]{num1,num2,num3,num4,num...} 새 배열객체로 대체하는 수밖에 없음
		System.out.println(intarr1[0]);
		intarr1[0]=33;
		System.out.println(intarr1[0]);
		int sum = intarr1[0] + intarr1[1] + intarr1[2];
		System.out.println("intarr1의 합계: "+sum);
		
		intarr2[0]= 35;
		intarr2[1]= 30;
		intarr2[2]= 28;
		sum = 0;
		for(int i=0; i<3;i++) {
			sum += intarr2[i];	
		}
		System.out.println("intarr2의 합계: "+sum);
		
		//--------------------------------------------------
		double[] douarr1 = {30, 40, 50}; //30.0, 40.0, 50.0
		double sum2 = douarr1[0] + douarr1[1] + douarr1[2];
		
		//--------------------------------------------------------
		String[] strarr1 = {"H","E","L","L","O"};

		//확장 for
		for(String str: strarr1) {
			System.out.println(str);
		}
			
		
	}
}
