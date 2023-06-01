package com.yedam.object;
import java.util.Scanner;

public class ObjectEx2Bank {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Bank[] accounts = new Bank[3];
		boolean run = true;
		int count = 0;
		
		while(run) {
			System.out.println("====================================");
			System.out.println("[1]등록 [2]계좌 조회 [3]입금 [4]출금 [5]종료");
			System.out.println("====================================");
			System.out.printf("선택> ");
			int select = Integer.parseInt(scan.nextLine());
			
			if(select == 1) {
				if(count != 3) {
					System.out.printf("계좌번호: ");
					String newacc = scan.nextLine();
					System.out.printf("예금주명: ");
					String person = scan.nextLine();
					System.out.printf("초기금액: ");
					int money = Integer.parseInt(scan.nextLine());

					Bank user = new Bank(newacc, person, money);
					accounts[count] = user;
					System.out.println("예금주 생성 완료.");
					count++;
					
				}else {
					System.out.println("예금주 생성 불가.");
				}
				
			}else if(select == 2) {
				if(accounts[0] == null) {
					System.out.println("등록된 예금주가 없습니다.");
				}else {
					System.out.printf("조회할 계좌번호를 입력하세요.> ");
					String acc = scan.nextLine();
					
					for(int i=0;i<count;i++) {
						if(accounts[i].accountNo.equals(acc)) {
							System.out.println("계좌번호: " + accounts[i].accountNo);
							System.out.println("예금주: " + accounts[i].owner);
							System.out.println("예금액: " + accounts[i].balance);
							break;
						}else if(accounts[i].accountNo.equals(accounts[count-1].accountNo)) {
							System.out.println("일치하는 계좌번호가 없습니다.");
						}
					}	
				}
					
			}else if(select == 3) {
				if(accounts[0] == null) {
					System.out.println("등록된 예금주가 없습니다.");
					continue;
				}
				System.out.printf("입금할 계좌번호를 입력하세요.> ");
				String acc = scan.nextLine();
				
				for(int i=0;i<count;i++) {
					if(accounts[i].accountNo.equals(acc)) {
						System.out.printf("입금할 금액을 입력하세요.> ");
						int money = Integer.parseInt(scan.nextLine());
						accounts[i].balance += money;
						System.out.println("입금 완료.");
						break;
					}else if(accounts[i].accountNo.equals(accounts[count-1].accountNo)) {
						System.out.println("일치하는 계좌번호가 없습니다.");
					}
				}
				
			}else if(select == 4) {
				if(accounts[0] == null) {
					System.out.println("등록된 예금주가 없습니다.");
					continue;
				}
				System.out.printf("출금할 계좌번호를 입력하세요.> ");
				String acc = scan.nextLine();
				
				for(int i=0;i<count;i++) {
					if(accounts[i].accountNo.equals(acc)) {
						System.out.printf("출금할 금액을 입력하세요.> ");
						int money = Integer.parseInt(scan.nextLine());
						if(accounts[i].balance-money <0)
							System.out.println("잔액 부족. 현재 예금액: " + accounts[i].balance);
						else {
							accounts[i].balance -= money;
							System.out.println("출금 완료.");
							break;
						}
					}else if(accounts[i].accountNo.equals(accounts[count-1].accountNo)) {
						System.out.println("일치하는 계좌번호가 없습니다.");
					}
				}
			}else if(select == 5) {		run = false;
			}else {	System.out.println("[1]~[5] 사이의 숫자만 선택 가능합니다.");	}
			
		}//while
		System.out.println("End of Program.");
		
	}//main
}
