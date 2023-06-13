package _20230609.collectionExam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;


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
		

		System.out.println("-------keySet--------");
		Set<String> keys = map.keySet();
		Iterator<String> itKey = keys.iterator();
		while(itKey.hasNext()) {
			String key = itKey.next();
			System.out.println("키: " + key + ", 값: "+ map.get(key));
		}

		System.out.println("--------------------------------------------");
		Map<Member, Integer> members = new HashMap<>();
		Member member = new Member("user1","1111");
		members.put(new Member("user1","1111"), 100);
		members.put(new Member("user2","2222"), 120);
//				members.put(new Member("user1","2222"), 140);
		members.put(member, 140); //hashcode, equals - 47번 줄과 동등 객체
		
		Integer point = members.get(new Member("user1","2222"));
		System.out.println(point);
		
		
		System.out.println("--------------------entrySet------------------------");
		//key, value
		Set<Entry<String, Integer>> entry = map.entrySet();
		Iterator<Entry<String, Integer>> iter =  entry.iterator(); 
		while(iter.hasNext()) {
			Entry<String, Integer> ent = iter.next(); //key, value 를 반환하는 entry 타입
			String key = ent.getKey();
			Integer val = ent.getValue();
		}
		
		//containsKey, containsValue
		Map<String, String> map2 = new HashMap<>();
		map2.put("spring", "11");
		map2.put("summer", "123");
		map2.put("fall", "1234");
		map2.put("winter", "12345");
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("아이디와 비밀번호 입력");
			System.out.print("아이디: ");
			String id = scan.nextLine();
			System.out.print("비밀번호: ");
			String pw = scan.nextLine();
			
			if(map2.containsKey(id)) { //map의 key 값 비교 메소드
				if(map2.get(id).equals(pw)) {//map의 value 값 비교
					System.out.println("로그인되었습니다.");
					break;
				}else{
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("입력한 아이디가 존재하지 않습니다.");
			}
		}
		
		System.out.println("end of program.");
	}
}
