package _20230608.exceptions;

public class NullPointerExe {
	public static void main(String[] args) {
		String msg = "hello";
		msg = null;
		try {
			System.out.println(msg.length());	
			int no = Integer.parseInt(msg);
			System.out.println(no);	
//		}catch(NullPointerException e) {
//			System.out.println("NullPointer 예외 msg 값을 확인하세요.");
//		}catch(NumberFormatException e) {
//			System.out.println("NumberFormat 예외 msg 값을 확인하세요.");
		}catch(Exception e) {
			System.out.println("알 수 없는 오류 발생");
		}
		
		System.out.println("end of pfog");
	}
}
