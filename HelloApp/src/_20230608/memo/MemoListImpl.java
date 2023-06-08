package _20230608.memo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoListImpl implements MemoList{
	Scanner scan = new Scanner(System.in);
	List<Memo> list = new ArrayList<Memo>();
	
	@Override
	public List<Memo> getList(){
		return list;
	}
	
	@Override
	public void input(Memo memo) {
		for(Memo m: list) {//중복체크
			if(m.getNo()==memo.getNo() && m.getDate().equals(memo.getDate())
					&& m.getContent().equals(memo.getContent())){	
				System.out.println("이미 있는 메모입니다.");
				return;
			}
		}
		for(int i=0; i<list.size();i++){ //순번대로 저장
			if(list.get(i).getNo()> memo.getNo()) {
				list.add(i,memo);
				System.out.printf("추가 완료.\n");
				return;
			}else if(Integer.parseInt(list.get(i).getDate())>=Integer.parseInt(memo.getDate()) &&
					list.get(i).getNo()>= memo.getNo()) {
				list.add(i,memo);
				System.out.printf("추가 완료.\n");
				return;
			}
		}
		list.add(memo);
		System.out.println("추가 완료.");
	}

	@Override
	public void update(Memo memo) {
		boolean isTrue = false;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getNo()==memo.getNo() &&
					list.get(i).getDate().equals(memo.getDate())) {
				System.out.printf("내용 수정하기:");
				list.get(i).setContent(scan.nextLine());
				isTrue= true;
				System.out.println("수정 완료");
			}			
		}
		if(!isTrue)
			System.out.println("찾는 메모가 없습니다.");
	}

	@Override
	public void delete(int no) {
		boolean isTrue = false;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getNo() == no) {
				list.remove(i);
				i--;
				System.out.println(no + "번호의 메모 삭제 완료");
				isTrue= true;
			}			
		}
		if(!isTrue)
			System.out.println("찾는 메모가 없습니다.");
	}

	@Override
	public void delete(String date) {
		boolean isTrue = false;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getDate().equals(date)) {
				list.remove(i);
				i--;
				System.out.println(date + "날짜의 메모 삭제 완료");
				isTrue= true;
			}			
		}
		if(!isTrue)
			System.out.println("찾는 메모가 없습니다.");
	}

	@Override
	public void search(int no) {
		boolean isTrue = false;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getNo() == no) {
				System.out.println(list.get(i).toString());
				isTrue= true;
			}			
		}
		if(!isTrue)
			System.out.println("찾는 메모가 없습니다.");
	}

	@Override
	public void search(String date) {
		boolean isTrue = false;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getDate().equals(date)) {
				System.out.println(list.get(i).toString());
				isTrue= true;
			}			
		}
		if(!isTrue)
			System.out.println("찾는 메모가 없습니다.");
	}

	@Override
	public void print() {
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
	}

}
