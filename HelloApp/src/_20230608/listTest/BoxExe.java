package _20230608.listTest;

public class BoxExe {
	public static void main(String[] args) {
		Box box = new Box();
		box.setObj("Apple");
		String result = (String) box.getObj();
		System.out.println(result);
		
//		Box nbox = new Box();
//		nbox.setObj(10);
//		String nResult= (String)nbox.getObj(); //if) 개발자의 실수
//		System.out.println(nResult); //런타임에러
		Box<Integer> nbox = new Box<Integer>();
		nbox.setObj(10);
		Integer nResult= nbox.getObj();
		System.out.println(nResult);
	}
}
