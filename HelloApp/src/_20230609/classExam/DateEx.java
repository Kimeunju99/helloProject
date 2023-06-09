package _20230609.classExam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today.getTime());
		//1970.01.01 ~> 53y6m9d * 24*60*60*1000 (=현재시간,today.getTime())
		long curr = 1686283263319L/(24*60*60*1000);
		System.out.println(curr);
		
		System.out.println(today.toString()); //Fri Jun 09 13:03:35 KST 2023
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String result = sdf.format(today);
		result = "2022/01/01 13:20:22";
		try {
			Date resultDate = sdf.parse(result);
			System.out.println(resultDate);
		}catch(ParseException e) {
			e.printStackTrace();
		}
	
		result = dateToStr(today, "yyyy/MM");
		System.out.println(result);
	}
	
	
	public static String dateToStr(Date date, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String result = sdf.format(date);
		return result;
	}
}
