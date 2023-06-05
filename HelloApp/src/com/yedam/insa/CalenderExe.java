package com.yedam.insa;
import java.util.Calendar;

public class CalenderExe {
	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance(); //실행시점 날짜정보
//		cal.set(2023,7,5); //2023,8월,5일
//		System.out.print("년:" + cal.get(Calendar.YEAR));
//		System.out.print(" 월:" + (cal.get(Calendar.MONTH)+1)); //start is 0
//		System.out.print(" 일:" + cal.get(Calendar.DATE));
//		System.out.println(" 요일:" + cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("이달 말일:" + cal.getActualMaximum(Calendar.DATE));
		
		CalenderEx cal = new CalenderEx();
		cal.set(2023, 5);
		cal.cal();
		cal.set(2023, 6);
		cal.cal();
		cal.set(2023, 7);
		cal.cal();
		cal.set(2023, 8);
		cal.cal();
		
	}
}
