package _20230608.memo;

import java.util.Scanner;

public class MemoApp {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		MemoList app = new MemoListImpl();
		boolean run = true;

		while(run) {
			//추가, 수정(번호&날짜), 삭제(번호,날짜), 조회(번호, 날짜), 전체 조회, 종료
			System.out.println("====================================================================");
			System.out.println("1.추가, 2.수정(번호&날짜), 3.삭제(번호,날짜), 4.조회(번호, 날짜), 5.전체 조회, 6.종료");
			System.out.println("====================================================================");
			System.out.printf("선택:");
			int select = 0;
			try {
				select = Integer.parseInt(scan.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("숫자를 입력하세요");
				continue;
			}
			if(select ==1) {
				System.out.printf("메모 번호:");
				int seq = Integer.parseInt(scan.nextLine());
				System.out.printf("메모 날짜(yyyyMMdd) *미입력 시 현재시간을 저장합니다.:");
				String date = scan.nextLine();
				System.out.printf("내용:");
				String content = scan.nextLine();
				Memo memo;
				if(date.equals(""))
					memo = new Memo(seq, content);
				else
					memo = new Memo(seq, date, content);
				app.input(memo);
				
			}else if(select ==2) {
				if(app.getList().size() == 0){
					System.out.println("메모가 없습니다.");
					continue;
				}
				System.out.printf("메모 번호:");
				int seq = Integer.parseInt(scan.nextLine());
				System.out.printf("메모 날짜(yyyyMMdd):");
				String date = scan.nextLine();
				Memo memo = new Memo(seq,date,"");
				app.update(memo);
				
			}else if(select ==3) {
				if(app.getList().size() == 0){
					System.out.println("메모가 없습니다.");
					continue;
				}
				System.out.println("1.번호로 삭제 2.날짜로 삭제");
				System.out.printf("선택:");
				select = Integer.parseInt(scan.nextLine());
				if(select ==1) {
					System.out.printf("찾는 번호:");
					int num = Integer.parseInt(scan.nextLine());
					app.delete(num); //번호					
				}else if(select ==2){
					System.out.printf("찾는 날짜(yyyyMMdd):");
					String date = scan.nextLine();
					app.delete(date); //날짜					
				}else {
					System.out.println("입력 오류");
				}
				
			}else if(select ==4) {
				if(app.getList().size() == 0){
					System.out.println("메모가 없습니다.");
					continue;
				}
				System.out.println("1.번호로 조회 2.날짜로 조회");
				System.out.printf("선택:");
				select = Integer.parseInt(scan.nextLine());
				if(select ==1) {
					System.out.printf("찾는 번호:");
					int num = Integer.parseInt(scan.nextLine());
					app.search(num); //number
				}else if(select ==2){
					System.out.printf("찾는 날짜(yyyyMMdd):");
					String date = scan.nextLine();
					app.search(date);//string
				}else {
					System.out.println("입력 오류");
				}
				
			}else if(select ==5) {
				if(app.getList().size() == 0){
					System.out.println("메모가 없습니다.");
					continue;
				}
				app.print();
			}else if(select ==6) {
				run = false;
			}else {
				System.out.println("입력 오류");
			}
		}//while
		System.out.println("End of Program");
	}//main
}
