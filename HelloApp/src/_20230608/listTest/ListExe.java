package _20230608.listTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ListExe {
	public static void main(String[] args) {
		//인터페이스(List) - 구현클래스(ArrayList,LinkedList)
		List<String> list = null; //인터페이스
		list = new ArrayList<String>();
		list = new LinkedList<String>();	
		list.add("i");		list.add("n");		list.add("t");
		list.add("e");		list.add("r");		list.add("f");
		list.add("a");		list.add("c");		list.add("e");		
		for(String s: list)
			System.out.printf("%s ",s);
		System.out.println();
		
		
		//Date java
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(today); //Thu Jun 08 11:43:21 KST 2023
		System.out.println(sdf.format(today)); //2023-06-08
		
		String format = sdf.format(today); // Date -> 문자열
		System.out.println(format); //2023-06-08
		
		try{
			String sdate = "2023-07-22 13:13:13";
			Date date = sdf.parse(sdate); //문자열 -> Date
			System.out.println(date); //Sat Jul 22 00:00:00 KST 2023
		}catch(ParseException e){
			e.printStackTrace();
		}
	}
}
