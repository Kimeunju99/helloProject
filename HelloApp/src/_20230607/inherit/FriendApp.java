package _20230607.inherit;
// 친구 정보 저장. 이름, 연락처 ==> Friend.class
// 학교친구 -이름,연락처,학교,전공 ==> UnivFriend.class
// 회사친구 -이름,연락처,회사,부서 ==> CompFriend.class
public class FriendApp {
	public static void main(String[] args) {
		FriendExe exe = new FriendExe();
		exe.execute(); //실행시작 메소드
	}
	
	public static void method() {
		Friend[] friends = new Friend[10];
		
		friends[0] = new Friend("홍길동", "010-1111");
		friends[1] = new UnivFriend("김민기", "010-2222", "대구대", "역사학과");
		friends[2] = new CompFriend("박호섭", "010-3333", "네이버", "개발부");
		
		for(Friend friend : friends) {
			if(friend != null)
				System.out.println(friend.showInfo());
		}
	}
}
