package _20230609.collectionExam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		//키,값
		Map<String, Integer> map;
		map = new HashMap<>();
		map.put("홍길동", 90);
		map.put("김민기", 88);
		map.put("김이수", 85);
		
		//조회 get
		System.out.println("-------KEY: 홍길동--------");
		Integer result = map.get("홍길동");
		System.out.println(result);
		map.remove("홍길동");
		result = map.get("홍길동");
		System.out.println(result);
		
		System.out.println("-------KEY: 김이수--------");
		result = map.get("김이수");
		System.out.println(result);
		map.put("김이수", 77);
		result = map.get("김이수");
		System.out.println(result);
		

		System.out.println("-------키셋--------");
		Set<String> keys = map.keySet();
		Iterator<String> itKey = keys.iterator();
		while(itKey.hasNext()) {
			String key = itKey.next();
			System.out.println("키: " + key + ", 값: "+ map.get(key));
		}

		System.out.println("--------------------------------------------");
		Map<Member, Integer> members = new HashMap<>();
		members.put(new Member("user1","1111"), 100);
		members.put(new Member("user2","2222"), 120);
		members.put(new Member("user1","2222"), 140);
		Integer point = members.get(new Member("user1","2222"));
		System.out.println(point);
	}
}
