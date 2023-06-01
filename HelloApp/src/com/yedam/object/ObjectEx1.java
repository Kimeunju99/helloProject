package com.yedam.object;

import java.util.Scanner;

public class ObjectEx1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Member[] members = new Member[2];
	
		//사용자 입력 코드
//		myInsert(members);
		profInsert(members);
		//출력
		callView(members);
			
		//멤버 아이디 조회 후 포인트 변경
		callUpdate(members);
		
		//출력
		callView(members);
		
	}//main
	
	
	public static void myInsert(Member[] members) {
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<members.length; i++) {
			System.out.printf("%d번째 사용자 입력", i+1);
			Member m1 = new Member();
			
			System.out.printf("아이디 입력: ");
			String id = scan.nextLine();
			
			if(i != 0) { //1번째 이상의 사용자 정보
				for(int j =0; j<i; j++) { //저장된 (0~i-1) 정보 중 (**i는 현재 저장하는 번호기 때문에 i-1이 최종적으로 저장된 값들임)
					if( members[j].memberId.equals(id) ) { //동일아이디가 있다.
						System.out.println("이미 있는 아이디 입니다.");
						i--;
						break; //2번째 for문 중지. 현재(i번째) 사용자 아이디 한 번 더 입력
					}else if(members[j].memberId.equals(members[i-1].memberId)){
						//저장된 마지막 번호에 닿았다. -> 최종적으로 동일한 아이디가 없다
						//남은 정보 값을 입력함
						m1.memberId= id;
						System.out.printf("이름 입력: ");
						m1.memberName = scan.nextLine();
						System.out.printf("포인트 입력: ");
						m1.point = Integer.parseInt(scan.nextLine());
						members[i] = m1;
					}
				}
			}else { //0번째 사용자의 정보 입력
				m1.memberId= id;
				System.out.printf("이름 입력: ");
				m1.memberName = scan.nextLine();
				System.out.printf("포인트 입력: ");
				m1.point = Integer.parseInt(scan.nextLine());
				members[i] = m1;
			}	
		}
	}//mycode_insert
	
	public static void profInsert(Member[] members) {
		Scanner scan = new Scanner(System.in);	
		for(int i=0; i<members.length; i++) {
			System.out.printf("%d번째 사용자 입력", i+1);
			Member m1 = new Member();
			
			System.out.printf("아이디 입력: ");
			String id = scan.nextLine();
			
			if(i != 0){
				boolean isEqual = false;
				for(int j =0; j<i; j++) { //저장된 (0~i-1) 정보 중 (**i는 현재 저장하는 번호기 때문에 i-1이 최종적으로 저장된 값들임)
					if( members[j].memberId.equals(id) ) { //동일아이디가 있다.
						isEqual = true;
						break; //2번째 for문 중지.
					}
				}
				if(isEqual) {
					System.out.println("중복된 아이디입니다.");
					i--;
					continue;
				}
			}
			m1.memberId= id;
			System.out.printf("이름 입력: ");
			m1.memberName = scan.nextLine();
			System.out.printf("포인트 입력: ");
			m1.point = Integer.parseInt(scan.nextLine());
			members[i] = m1;		
		}//first for
	}//prof
	
	public static void callUpdate(Member[] members) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("조회할 아이디 입력: ");
		String search = scan.nextLine();
		System.out.printf("변경할 point 입력: ");
		int newpoint = Integer.parseInt(scan.nextLine());

		for(int i=0; i<members.length; i++) {
			if(search.equals(members[i].memberId)) {
				members[i].point = newpoint;
				break;
			}else if(members[i].memberId == members[members.length-1].memberId)
				System.out.println("동일한 아이디가 없습니다.");
		}
	}
	
	public static void callView(Member[] members) {
		for(int i=0; i<members.length; i++) {
			System.out.printf("아이디: %s, 이름: %s, 포인트: %d \n", members[i].memberId, members[i].memberName, members[i].point);
		}
	}
}
