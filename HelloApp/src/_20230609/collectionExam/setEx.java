package _20230609.collectionExam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("hello");
		set.add("world");
		set.add("hello");
		
		Iterator<String> iter = set.iterator(); //반복자 지정
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		System.out.println("------------------------");
		for(String str : set) {
			System.out.println(str);
		}
		
		System.out.println("------------------------");
		Set<Integer> iset = new HashSet<>();
		iset.add(100);
		iset.add(200);
		iset.add(100);
		for(Integer i : iset) {
			System.out.println(i);
		}
		
		//정수[] 선언 -> 임의의 값(1~10) 5개 저장
		System.out.println("------------중복 없는 임의의 숫자 5개------------");
		int[] numbers = new int[5];
		randomFiveArr(numbers);
		for(int i=0;i<numbers.length;i++)
			System.out.println(numbers[i]);
		System.out.println("------------중복 없는 임의의 숫자 5개------------");
		Set<Integer> setting = randomFiveSet();
		for(int i: setting)
			System.out.println(i);
		
	}
	
	public static Set<Integer> randomFiveSet(){
		Set<Integer> setting = new HashSet<>();
		while(setting.size()!=5) {
			int num = (int)(Math.random()*10)+1;
			setting.add(num);
		}
		return setting;
	}
	
	public static int[] randomFiveArr(int[] numbers) {
		for(int i=0;i<5;i++) {
			boolean isIt =false;
			int num = (int)(Math.random()*10)+1;
			for(int j=0;j<=i;j++) {
				if(num == numbers[j]) {
					isIt = true;
					i--;
					break;
				}
			}
			if(!isIt)
				numbers[i] = num;
		}
		return numbers;
	}
}
