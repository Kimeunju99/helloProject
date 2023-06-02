package com.yedam.object;
import java.util.Scanner;

public class ObjectEx6Student {//학생정보 관리(번호-유니크/이름/성별/점수)
	static Scanner scan = new Scanner(System.in);
	static Student stuList[] = new Student[3];
	
	public static void main(String[] args) {
		boolean run = false;
		
		System.out.printf("비밀번호를 입력하세요: ");
		String pass = scan.nextLine();
		if(pass.equals("admin")) {
			System.out.println("환영합니다.");
			run = true;
			}
		else
			System.out.println("비밀번호가 틀렸습니다.");
		
		while(run) {
			System.out.println("==========================================================");
			System.out.println("[1]등록 [2]목록 [3]조회(이름으로 조회) [4]점수수정 [5]정보삭제 [6]종료");
			System.out.println("==========================================================");
			System.out.printf("==선택>>");
			int select = 0;
			try{   select =Integer.parseInt(scan.nextLine());
			}catch(Exception e) { System.out.println("입력 오류"); }
			
			if(select == 1) {
				Register();
			}else if(select == 2) {
				List();
			}else if(select == 3){
				Search();
			}else if(select == 4) {
				Modify();
			}else if(select == 5) {
				Remove();
			}else if(select == 6) {
				run = false;
			}else {
				System.out.println("1~6 사이의 값을 입력하세요.");
			}
		}//while
		System.out.println("시스템 종료.");
	}

	
	//1.등록 2.목록 3.조회(이름으로 조회) 4.점수수정 5.정보삭제 6.종료
	// register()
	public static void Register() {
		boolean isTrue = false;
		System.out.printf("학생의 아이디를 입력하세요: ");
		String id = scan.nextLine();
		
		for(int i=0; i<stuList.length; i++) { //중복 체크
			if(stuList[i] != null && id.equals(stuList[i].getId())) {
				isTrue = true;
				System.out.println("이미 있는 아이디 입니다.");
				break;
			}
		}
		if(isTrue)	return; //중복이면 메소드 종료
		
		Student stu = new Student();
		stu.setId(id);
		System.out.printf("학생의 이름을 입력하세요: ");
		stu.setName(scan.nextLine());
		System.out.printf("학생의 성별을 입력하세요(남/여): ");
		stu.setGender(scan.nextLine());
		System.out.printf("학생의 성적을 입력하세요: ");
		stu.setScore(Integer.parseInt(scan.nextLine()));
		
		for(int i=0;i<stuList.length;i++) {
			if(stuList[i] == null) {
				stuList[i] = stu;
				System.out.println("학생을 등록했습니다.");
				break;
			}
			if(stuList[i] != null && stuList[i] == stuList[stuList.length-1])
				System.out.println("학생을 더이상 추가할 수 없습니다.");
		}
	}
	
	public static int isNull() { //학생리스트가 비었음
		int c =0;
		for(int i=0; i<stuList.length;i++) {
			if(stuList[i] != null)
				c++;
		}
		return c;
	}
	
	// list()  **출력 조건: 등록된 학생 중 남학생, 여학생 / 최고 점수 & 대상 학생
	public static void List(){
		int m = 0, f = 0, max = 0;
		String maxid = "";
		
		if(isNull() == 0) {
			System.out.println("학생이 등록되어 있지 않습니다.");
			return;
		}
			
		for(Student stu: stuList) {
			if(stu != null) {
				if(max < stu.getScore()){//최고점 학생 찾기
					max = stu.getScore();
					maxid = stu.getId();
				}
			
				if(stu.getGender().equals("남"))	m++; //성별 분류
				else f++;	
			}
		}
		for(Student stu: stuList) {
			if(stu != null) {
				if(stu.getId().equals(maxid))
					System.out.printf("남학생: %d, 여학생: %d 명 중 \n최고점수: %s(%d점)\n", m, f, stu.getName(), stu.getScore());
			}
		}
	}
	
	// search() -name
	public static void Search() {
		boolean isTrue = false;
		
		if(isNull() == 0) {
			System.out.println("학생이 등록되어 있지 않습니다.");
			return;
		}
		System.out.printf("학생 이름을 입력하세요: "); //이름 받아서 비교
		String name = scan.nextLine();
		for(int i=0; i<stuList.length;i++) {
			if( stuList[i] != null && name.equals(stuList[i].getName())){//있다 -> 리스트 출력
				isTrue = true;
				System.out.printf("번호: %s, 이름: %s, 성별: %s, 점수: %d\n",
						stuList[i].getId(),stuList[i].getName(), stuList[i].getGender(), stuList[i].getScore());
			}
		}
		if(!isTrue)	System.out.println("학생이 등록되어 있지 않습니다.");
	}
	
	// modify() -id
	public static void Modify() {
		boolean isTrue = false; //찾는 학생이 없음
		//학생리스트가 비었음 
		if(isNull() == 0) {
			System.out.println("학생이 등록되어 있지 않습니다.");
			return;
		}
		
		System.out.printf("학생 아이디를 입력하세요: "); //아이디 받아서 비교
		String id = scan.nextLine();
		for(int i=0; i<stuList.length;i++) {
			if( stuList[i] != null && id.equals(stuList[i].getId())){ //있다 -> 정보 수정
				System.out.printf("수정할 점수를 입력하세요: ");
				int score = Integer.parseInt(scan.nextLine());
				stuList[i].setScore(score); //수정
				isTrue = true;
				System.out.println("수정했습니다.");
			}
		}
		if(!isTrue)	System.out.println("학생이 등록되어 있지 않습니다.");
	}
	
	// remove() -id
	public static void Remove() {
		boolean isTrue = false; //찾는 학생이 없음
		//학생리스트가 비었음 
		if(isNull() == 0) {
			System.out.println("학생이 등록되어 있지 않습니다.");
			return;
		}
		
		if(stuList[0] == null) {
			System.out.println("학생이 등록되어 있지 않습니다.");
			return;
		}
		System.out.printf("학생 아이디를 입력하세요: "); //아이디 받아서 비교
		String id = scan.nextLine();
		for(int i=0; i<stuList.length;i++) { //있다 -> 정보 삭제
			if( stuList[i] != null && id.equals(stuList[i].getId())){
				stuList[i] = null; //삭제
				isTrue = true;
				System.out.println("삭제했습니다.");
			}
		}
		if(!isTrue)
			System.out.println("학생이 등록되어 있지 않습니다.");
	}
	
}
