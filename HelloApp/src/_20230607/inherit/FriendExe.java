package _20230607.inherit;
import java.util.Scanner;

public class FriendExe {
	Scanner scan = new Scanner(System.in);
	private boolean run = true;
	Friend[] friends = new Friend[3];
	Friend temp = new Friend();
	
	public void execute() {
		while(run) {
			// 기능 = 추가/수정/삭제/목록
			System.out.println("===================================");
			System.out.println(" [1]추가 [2]수정 [3]삭제 [4]목록 [5]종료");
			System.out.println("===================================");
			System.out.printf("선택>>");
			int select = Integer.parseInt(scan.nextLine());
			if(select == 1) {
				insert();
			}else if(select == 2) {
				update();
			}else if(select == 3) {
				delete();
			}else if(select == 4) {
				list();
			}else if(select == 5) {
				run = false;
			}else {
				System.out.println("[1] ~ [5] 입력");
			}
		
		}//while
		System.out.println("프로그램 종료.");
		scan.close();
	}//execute

	public void insert() {
		System.out.println("=======================");
		System.out.println(" [1]학교 [2]회사 [3]기타");
		System.out.println("=======================");
		System.out.printf("선택>>");
		int select = Integer.parseInt(scan.nextLine());
		System.out.printf("이름:");
		String name = scan.nextLine();
		System.out.printf("번호:");
		String phone = scan.nextLine();
		if(select == 1) {	// 학교 친구 ->학교, 전공
			System.out.printf("학교:");
			String univ = scan.nextLine();
			System.out.printf("전공:");
			String major = scan.nextLine();
			for(int i=0; i<friends.length;i++) {
				if(friends[i] == null) {
					Friend tf = new UnivFriend(name,phone,univ,major);
					friends[i] = tf;
					return;
				}
			}
			System.out.println("목록이 가득 차있습니다.");
				
		}else if(select == 2) {// 회사친구->회사, 부서
			System.out.printf("회사:");
			String comp = scan.nextLine();
			System.out.printf("부서:");
			String depart = scan.nextLine();
			for(int i=0; i<friends.length;i++) {
				if(friends[i] == null) {
					Friend tf = new CompFriend(name,phone,comp,depart);
					friends[i] = tf;
					return;
				}
			}
			System.out.println("목록이 가득 차있습니다.");
		}else if(select == 3) {// 그 외 기본정보만
			for(int i=0; i<friends.length;i++) {
				if(friends[i] == null) {
					Friend tf = new Friend(name,phone);
					friends[i] = tf;
					return;
				}
			}
			System.out.println("목록이 가득 차있습니다.");
		} else {
			System.out.println("[1] ~ [3] 입력");
		}
	}
	
	public boolean select(boolean isTrue) {
		System.out.printf("대상 이름:");
		String name = scan.nextLine();
		for(Friend f: friends) {
			if(f != null && name.equals(f.getName())) {
				if(f instanceof UnivFriend) {//학교(학교,전공)
					temp = (UnivFriend)f;
				}else if(f instanceof CompFriend) {//회사(회사,부서)
					temp = (CompFriend)f;
				}else {//그 외:연락처
					temp = f;
				}
				return true;
			}
		}
		return false;
	}
	
	public void update() {
		boolean isTrue = select(false); // 수정(이름으로 조회)
		if(!isTrue) {
			System.out.println("해당 이름이 없습니다.");
			return;
		}
		for(int i=0; i<friends.length;i++) {
			if(friends[i] instanceof UnivFriend) {//학교(학교,전공)
				if( friends[i] != null && temp.getName().equals(friends[i].getName())) {
					System.out.printf("수정할 학교를 입력하세요.:");
					String univ = scan.nextLine();
					if(!univ.equals("")) {
						((UnivFriend) friends[i]).setUniv(univ);
					}
					System.out.printf("수정할 전공을 입력하세요.:");
					String major = scan.nextLine();
					if(!major.equals("")) {
						((UnivFriend) friends[i]).setMajor(major);
					}	
				}	
			}else if(friends[i] instanceof CompFriend) {//회사(회사,부서)
				if( friends[i] != null && temp.getName().equals(friends[i].getName())) {
					System.out.printf("수정할 회사를 입력하세요.:");
					String comp = scan.nextLine();
					if(!comp.equals("")) {
						((CompFriend) friends[i]).setComp(comp);
					}
					System.out.printf("수정할 부서를 입력하세요.:");
					String depart = scan.nextLine();
					if(!depart.equals("")) {
						((CompFriend) friends[i]).setDepart(depart);
					}
				}
			}else{ //그 외:연락처
				if( friends[i] != null && temp.getName().equals(friends[i].getName())) {
					System.out.printf("수정할 번호를 입력하세요.:");
					String phone = scan.nextLine();
					friends[i].setPhone(phone);
				}
			}
		}
		System.out.println("수정 완료.");
	}

	public void delete() {
		boolean isTrue = select(false); //삭제(이름으로 조회)
		if(!isTrue) {
			System.out.println("해당 이름이 없습니다.");
			return;
		}
		for(int i=0; i<friends.length;i++) {
			if( friends[i] != null && temp.getName().equals(friends[i].getName())) {
				friends[i] = null;
			}
		}
		System.out.println("삭제 완료.");
	}

	public void list() {
		for(int i=0;i<friends.length;i++)
			if(friends[i] != null) {
				if(friends[i] instanceof UnivFriend) {//학교(학교,전공)
					System.out.printf("이름:%s",((UnivFriend)friends[i]).getName());
					System.out.printf(" 번호:%s",((UnivFriend)friends[i]).getPhone());
					System.out.printf(" 학교:%s",((UnivFriend)friends[i]).getUniv());
					System.out.printf(" 전공:%s\n",((UnivFriend)friends[i]).getMajor());
				}else if(friends[i] instanceof CompFriend) {
					System.out.printf("이름:%s",((CompFriend)friends[i]).getName());
					System.out.printf(" 번호:%s",((CompFriend)friends[i]).getPhone());
					System.out.printf(" 회사:%s",((CompFriend)friends[i]).getComp());
					System.out.printf(" 부서:%s\n",((CompFriend)friends[i]).getDepart());
				}else {//그 외:연락처
					System.out.printf("이름:%s",friends[i].getName());
					System.out.printf(" 번호:%s\n",friends[i].getPhone());
				}
			}
	}
	
}
