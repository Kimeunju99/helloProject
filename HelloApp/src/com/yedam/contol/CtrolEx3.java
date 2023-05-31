package com.yedam.contol;

public class CtrolEx3 {
	public static void main(String[] args) {
//		basicfor();
//		gugudan(3);
//		gugudan2(2, 4);
//		gugudan3(2, 7);
		
		int month = 4;
//		day1(month,getFirstDate(month), getLastDate(month));
		day2(month);
	}
	
	public static void basicfor() {
		//반복문 test
		for(int i = 0; i<10; i++) {
			if(i % 2 == 1)
				System.out.printf("i의 값은 %d \n", i);
//			else
//				System.out.printf("짝수입니다. \n");		
		}
	}

	public static void gugudan(int dan) {
		for(int i= 1; i<=9; i++)
			System.out.printf("%d * %d = %d \n", dan, i, dan*i);
	}
	
	public static void gugudan2(int start, int end) {
		for(int j=start; j<=end; j++) {
			System.out.printf("---%d단입니다---\n", j);
			for(int i= 1; i<=9; i++)
				System.out.printf("%d * %d = %d \n", j, i, j*i);
			
			System.out.printf("\n");
		}
	}
	
	public static void gugudan3(int start, int end) {
		for(int i= 1; i<=9; i++) {
			for(int j=start; j<=end; j++) {
//				System.out.printf("%d * %d = %d \t", j, i, j*i);
				System.out.printf("%2d * %2d = %2d \t", j, i, j*i);
			}
			System.out.printf("\n");
		}
	}
	
	public static void day1(int month, int firstday, int lastday) {
		System.out.println("========== "+month+"월달 ===========");
		String days = "Sun Mon Tue Wed Thr Fri Sat";
		System.out.println(days);
		System.out.println("===========================");
		String tap = " ";
		for(int i=0;i<firstday;i++)
			System.out.printf("%3s ", tap);
		
		for(int day=1; day<=lastday; day++) {
			System.out.printf("%3d ", day);
			if(month == 4 && day % 7 == 1)
				System.out.println("");
			else if(month == 5 && day % 7 == 6)
				System.out.println("");
			else if(month == 6 && day % 7 == 3)
				System.out.println("");
		}
	}
	
	public static void day2(int month) {
		int firstday = getFirstDate(month);
		int lastday = getLastDate(month);
		
		System.out.println("========== "+month+"월달 ===========");
		String days = "Sun Mon Tue Wed Thr Fri Sat";
		System.out.println(days);
		System.out.println("===========================");
		for(int i=0;i<firstday;i++) //요일 맞춤
			System.out.printf("%3s ", "");
		
		for(int day=1; day<=lastday; day++) {
			System.out.printf("%3d ", day);
			
			if((day + firstday) % 7 == 0) //줄바꿈
				System.out.println();
		}
	}
	
	//2023 4,5,6월달 달력 공백 카운트
	public static int getFirstDate(int month) {
		int first = 0;
		switch(month) {
		case 4: first = 6; break;
		case 5: first = 1; break;
		case 6: first = 4; break;
		default: break;
		}
		return first;
	}
	
	//월의 마지막 날
	public static int getLastDate(int month) {
		int lastday = 0;
		switch(month) {
		case 2: lastday = 28; break;
		case 4:
		case 6:
		case 9:
		case 11: lastday = 30; break;
		default: lastday = 31; break;
		}
		return lastday;
	}
	
}
