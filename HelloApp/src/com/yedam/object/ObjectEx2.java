package com.yedam.object;
import java.util.Scanner;

public class ObjectEx2 {

	static Bank[] accounts = new Bank[3];
	static Scanner scan = new Scanner(System.in);
	static int count = 0; //현재 등록된 사람 수
	
	public static void main(String[] args) { 							//bank get-set 구조
		boolean run = true;
		
		while(run) {
			System.out.println("===========================================");
			System.out.println("[1]등록 [2]계좌 조회 [3]입금 [4]출금 [5]종료 [6]삭제");
			System.out.println("===========================================");
			System.out.printf("선택> ");
			int select = 0;
			try{	select = Integer.parseInt(scan.nextLine());
			}catch(NumberFormatException e) { System.out.println();	}
			
			if(select == 1) {	registerAccount();	
			}else if(select == 2) {	searchAccount();		
			}else if(select == 3) {	deposit();		
			}else if(select == 4) {	withDraw();
			}else if(select == 5) {	run = false;
			}else if(select == 6){ //배열 삭제를 위한 임의의 select
				removeAccount();
			}else {	System.out.println("[1]~[5] 사이의 숫자만 선택 가능합니다.");	}
			
		}//while
		System.out.println("End of Program.");
	}//main
	
	public static void registerAccount() {
		if(count != accounts.length) {
			boolean isTrue = false;
			System.out.printf("계좌번호: ");
			String newacc = scan.nextLine();
			
			if(accounts[0] != null) { //계좌가 하나라도 있으면 중복체크
				for(int i=0; i<count; i++) {
					if (newacc.equals(accounts[i].getAccountNo())) {
						System.out.println("이미 존재하는 계좌번호입니다.");
						isTrue = true;
						break;
					}
				}
			}
			
			if(!isTrue){ //중복이 아닐 때만 실행
				System.out.printf("예금주명: ");
				String person = scan.nextLine();
				System.out.printf("초기금액: ");
				int money = Integer.parseInt(scan.nextLine());
				
				Bank user = new Bank(); // 새유저 정보
				user.setAccountNo(newacc);
				user.setOwner(person);
				user.setBalance(money);
				accounts[count] = user; // 유저 정보 배열에 저장 
				
				System.out.println("예금주 생성 완료.");
				count++; //등록된 사람이 늘었음
			}
		}else 	System.out.println("예금주 생성 불가."); //배열이 가득 차 있음
	}
	
	public static void removeAccount() { //배열 삭제를 위한 메소드
		if(!isNull()){	//else로 연결 대신 if 속 return으로 함수종료 OK
			System.out.printf("삭제할 계좌번호를 입력하세요.> ");
			String acc = scan.nextLine();
			
			for(int i=0;i<count;i++) {
				if(accounts[i].getAccountNo().equals(acc)) {
					accounts[i] = null;
					for(int j=i+1;j<count;j++)
						accounts[j-1] = accounts[j];
					count--;
					System.out.println("삭제 완료.");
					break;
				}else if(accounts[i].getAccountNo().equals(accounts[count-1].getAccountNo())) {
					System.out.println("일치하는 계좌번호가 없습니다.");
				}
			}
		}
	}
	
	public static void searchAccount() {
		if(!isNull()){
//		if(accounts[0] == null) {
//			System.out.println("등록된 예금주가 없습니다.");
//		}else {	//else로 연결 대신 if 속 return으로 함수종료 OK
			System.out.printf("조회할 계좌번호를 입력하세요.> ");
			String acc = scan.nextLine();
			
			for(int i=0;i<count;i++) {
				if(accounts[i].getAccountNo().equals(acc)) {
					System.out.println("계좌번호: " + accounts[i].getAccountNo());
					System.out.println("예금주: " + accounts[i].getOwner());
					System.out.println("예금액: " + accounts[i].getBalance());
					break;
				}else if(accounts[i].getAccountNo().equals(accounts[count-1].getAccountNo())) {
					System.out.println("일치하는 계좌번호가 없습니다.");
				}
			}	
		}
	}
	
	public static void deposit() {
		if(!isNull()){	//else로 연결 대신 if 속 return으로 함수종료 OK
			System.out.printf("입금할 계좌번호를 입력하세요.> ");
			String acc = scan.nextLine();
			
			for(int i=0;i<count;i++) {
				if(accounts[i].getAccountNo().equals(acc)) {
					System.out.printf("입금할 금액을 입력하세요.> ");
					int money = Integer.parseInt(scan.nextLine());
					int total = accounts[i].getBalance() + money;
					accounts[i].setBalance(total);
					System.out.println("입금 완료.");
					break;
				}else if(accounts[i].getAccountNo().equals(accounts[count-1].getAccountNo())) {
					System.out.println("일치하는 계좌번호가 없습니다.");
				}
			}
		}
	}
	
	public static void withDraw() {
		if(!isNull()){ //else로 연결 대신 if 속 return으로 함수종료 OK
			System.out.printf("출금할 계좌번호를 입력하세요.> ");
			String acc = scan.nextLine();
			
			for(int i=0;i<count;i++) {
				if(accounts[i].getAccountNo().equals(acc)) {
					System.out.printf("출금할 금액을 입력하세요.> ");
					int money = Integer.parseInt(scan.nextLine());
					if(accounts[i].getBalance() - money <0) {
						System.out.println("잔액 부족. 현재 예금액: " + accounts[i].getBalance());
						break;
					}else {
						int total = accounts[i].getBalance() - money;
						accounts[i].setBalance(total);
						System.out.println("출금 완료.");
						break;
					}
				}else if(accounts[i].getAccountNo().equals(accounts[count-1].getAccountNo())) {
					System.out.println("일치하는 계좌번호가 없습니다.");
				}
			}
		}
	}
	
	public static boolean isNull() {
		if(accounts[0] == null) {
			System.out.println("등록된 예금주가 없습니다.");
			return true;
		}else return false;
	}
	
}
