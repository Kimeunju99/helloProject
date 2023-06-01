package com.yedam.reference;

public class referenceEx3 {
	public static void main(String[] args) {
		//점수:89.5, 78.9, 90.4 저장 -> sum, avg
		
		double stu[] = {89.5, 78.9, 90.4};
		double sum=0,avg=0, maxv=0, min=100;
		for(double sc : stu) {
			sum += sc;
			if(maxv < sc)
				maxv = sc;
			if(min> sc)
				min =sc;
		}
		avg = sum/stu.length;
		System.out.println("합계: "+ sum + " 평균: " + avg + " 최고점: " + maxv +" 최저점: " + min);
		System.out.printf("합계: %.2f  평균: %.2f 최고점: %.2f 최저점: %.2f\n",sum, avg, maxv, min);
	}
}