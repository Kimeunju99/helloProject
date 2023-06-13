package _20230609.collectionExam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<HashMap<Integer, String>, Integer> map = new HashMap<>();
		
		System.out.println("사번  이름  급여");
		while(true) {
			String input = scan.nextLine();
			String[] inputs = input.split(" ");
			if(inputs[0].equals("quit")) {
				System.out.println("EXIT");
				break;
			}
			if(inputs.length != 3) {
				System.out.println("ERROR");
				continue;
			}
			HashMap<Integer, String> key = new HashMap<>();
			key.put(Integer.parseInt(inputs[0]), inputs[1]);
			map.put(key, Integer.parseInt(inputs[2]));
		}
		System.out.println("=======================");
		Set<HashMap<Integer, String>> keys = map.keySet();
		Iterator<HashMap<Integer, String>> iter = keys.iterator();
		while(iter.hasNext()) {
			HashMap<Integer, String> key = iter.next();
			Integer val = map.get(key);
			Set<Entry<Integer, String>> entry = key.entrySet();
			for(Entry<Integer,String> ent : entry) {
				System.out.printf("사번:%d, 이름:%s, 급여:%d\n",
						ent.getKey(), ent.getValue(), val);
			}
			
		}
	}
}
