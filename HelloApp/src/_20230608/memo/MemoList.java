package _20230608.memo;

import java.util.List;

//func 정의
public interface MemoList {
	public List<Memo> getList();
	void input(Memo memo);//추가
	void update(Memo memo);//수정(번호,날짜 기준)
	void delete(int no); //번호 기준 삭제
	void delete(String date); //날짜기준 삭제
	void search(int no); //번호로 조회
	void search(String date); //특정 날짜 기준 목록
	void print(); //전체 목록
}
