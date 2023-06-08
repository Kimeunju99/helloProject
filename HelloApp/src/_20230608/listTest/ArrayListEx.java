package _20230608.listTest;
import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("10");
		
		//일반화 이용
		for(int i=0;i<list.size();i++) {
//			Object result = list.get(i);
//			if(result instanceof String) {
//				System.out.println((String)result);
//			}else if(result instanceof Integer) {
//				System.out.println((Integer)result);
//			}
			String result = list.get(i);
			System.out.println(result);
		}
		
		ArrayList<Integer> nList = new ArrayList<Integer>();
		nList.add(10);
		nList.add(20);
		nList.remove(1);
		nList.set(0, 100);
		nList.add(200);
		
		for(Integer n : nList)
			System.out.println(n);
			
	}
}
