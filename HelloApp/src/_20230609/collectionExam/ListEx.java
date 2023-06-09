package _20230609.collectionExam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		List<String> strList;
		System.out.println("-------ARRAY--------");
		strList = new ArrayList<String>();
		strList.add("hello");
		strList.add("world");
		strList.add(0, "good");		
		for(int i=0;i<strList.size();i++) {
			System.out.println(strList.get(i).toString());
		}
		
		System.out.println("---------------");
		strList.set(0, "nice");
		strList.remove(1);
		for(String word :strList)
			System.out.println(word);
		strList.clear();

		System.out.println("---------------");
		long start = System.currentTimeMillis();
		for(int i=0;i<100000;i++)
			strList.add(0, "i" + i);
		long end = System.currentTimeMillis();
		System.out.printf("걸린시간: %d \n" , end-start);
		
		System.out.println("-------LINKED--------");
		strList = new LinkedList<String>();
		start = System.currentTimeMillis();
		for(int i=0;i<100000;i++)
			strList.add(0, "i" + i);
		end = System.currentTimeMillis();
		System.out.printf("걸린시간: %d \n" , end-start);
	
	}
}
