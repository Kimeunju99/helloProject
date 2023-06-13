package _20230609.collectionExam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("user1", 96);
		map.put("user2", 88);
		map.put("user3", 92);
		
		entryResult(map);
		setResult(map);
	}
	
	public static void entryResult(Map map) {
		Iterator<Entry<String, Integer>> iter = map.entrySet().iterator();
		String name =""; //최고점 유저이름
		int max = 0; //최고점
		int total = 0; //점수 합계
		
		while(iter.hasNext()) {
			Entry ent = iter.next();
			total += (int)ent.getValue();
			if(max < (int)ent.getValue())
				max = (int)ent.getValue();
			if((int)ent.getValue() == max)
				name = (String)ent.getKey();
		}
		System.out.printf("평균: %d, 최고점:%d, 1등:%s\n", total, max, name);
	}

	public static void setResult(Map map) {
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		String name =""; //최고점 유저이름
		int max = 0; //최고점
		int total = 0; //점수 합계
		
		while(iter.hasNext()) {
			String key = iter.next();
			Object val = map.get(key);
			if(max < (int)val) {
				max = (int)val;
				name = key;
			}
			total += (int)val;
		}
		System.out.printf("평균: %d, 최고점:%d, 1등:%s\n", total, max, name);
	}
}
