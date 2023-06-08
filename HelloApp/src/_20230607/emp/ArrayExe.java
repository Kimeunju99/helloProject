package _20230607.emp;
import java.util.ArrayList;

class Member{
	private String id;
	private String name;
	private int score;
	
	Member(String id, String name, int score){
		this.id=id;
		this.name=name;
		this.score=score;
	}

	public String getId() {	return id;}
	public String getName() {	return name;}
	public int getScore() {	return score;}
	
	public void setId(String id) {	this.id = id;}
	public void setName(String name) {	this.name = name;}
	public void setScore(int score) {	this.score = score;}
	
	
}

public class ArrayExe {
	public static void main(String[] args) {
//		ArrayList arry = new ArrayList();
//		arry.add("홍길동");
//		arry.add("김길동");
//		arry.add("박길동");
////		arry.add(new Integer(100)); //캐스팅 에러
//		for(Object a : arry) {
//			System.out.println((String)a);
//		}
//		
//		System.out.println("-----------삭제----------");
//		arry.remove(0);		
//		for(int i=0;i<arry.size();i++)
//			System.out.println(arry.get(i));
//		
//		System.out.println("-----------변경----------");
//		arry.set(0, "황길동");
//		for(int i=0;i<arry.size();i++)
//			System.out.println(arry.get(i));
	
		ArrayList members = new ArrayList();
		members.add(new Member("001","Hong", 100));
		members.add(new Member("002","Kim", 200));
		for(int i =0; i<members.size();i++) {
			Member member = (Member) members.get(i);
			if(member.getName().equals("Hong")){
//				members.remove(i);
				members.set(i, new Member("010","김만식",150));
			}
		}
	}
}
