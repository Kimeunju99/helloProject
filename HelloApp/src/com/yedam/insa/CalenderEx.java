package com.yedam.insa;
import java.util.Calendar;

public class CalenderEx {
	static int first;	static int last;
	static int year;	static int month;
	static Calendar calen;

	//CalendarEx.set(int year,int month)
	static void set(int year, int month) {
		CalenderEx.year = year;
		CalenderEx.month = month-1;
	}

	//CalendarEx.cal() => 년, 월 달력 그려줌
	static void cal() {
		calen = Calendar.getInstance();
		calen.set(year,month,1);
		first = calen.get(Calendar.DAY_OF_WEEK)-1; //처음 요일(일요일=1, 토요일=7)
		last = calen.getActualMaximum(Calendar.DATE); //달의 마지막 날
		System.out.println("-----------"+calen.get(Calendar.YEAR)+","+(calen.get(Calendar.MONTH)+1)+"-----------");
		System.out.println(" SUN MON THU WEN THR FRI SET");
		
		for(int i=0;i<first;i++) //공백
			System.out.printf("%4s", " ");
		for(int i=1;i<=last;i++) {//일(날짜) 출력
			System.out.printf("%4d", i);
			if((first + i) % 7 == 0)//한 주 끝마다 엔터
				System.out.println();
		}
		
		System.out.printf("\n");
	}
}
