package _20230609.stringExam;

import java.util.Scanner;

public class SystemEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long stime = System.currentTimeMillis(); //현재시점의 시간
		
		while(true) {
			System.out.println("1.출력 2.종료");
			System.out.println("------------");
			System.out.printf(">>선택");
			int menu = scan.nextInt();
			if(menu ==1) {
				System.out.println("print");
			}else if(menu == 2){
//				System.exit(0); //강제 종료
				break;
			}
		}
		
		System.out.println("시스템 종료");
		long etime = System.currentTimeMillis(); //현재시점의 시간
		System.out.printf("실행시간 %d\n", etime - stime);
		
	
	}
}
