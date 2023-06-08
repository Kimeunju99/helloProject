package _20230608.exceptions;

public class ThrowExe {
	public static void main(String[] args) {
		try {
			System.out.println(divide(3,2));
			System.out.println(divide(3,0));
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눔");
		}
		
		try {
			method("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {System.out.println("알 수 없는 오류");}
	}
	
	public static void method(String cls) throws ClassNotFoundException {
		//함수 내부가 아닌 호출한 곳에서 예외를 처리하겠다.
		Class.forName(cls);
		System.out.println("end of method");
	}
	
	public static int divide(int a, int b){
		return a / b;
	}
}
