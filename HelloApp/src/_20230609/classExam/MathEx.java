package _20230609.classExam;

public class MathEx {
	public static void main(String[] args) {
		for(int i=0; i<5;i++)
			System.out.println(Math.random());
			
		System.out.println(Math.round(3.5)); //반올림 4
		System.out.println(Math.rint(-2.3)); //반올림 -2.0

		System.out.println(Math.ceil(3.2)); //올림 4.0
		System.out.println(Math.ceil(-2.3)); // -2.0
		
		System.out.println(Math.floor(3.7)); //내림3.0
		System.out.println(Math.floor(-2.3)); // -3.0
		
		System.out.println(Math.max(10, 20)); //둘 중 큰 값
		System.out.println(Math.min(10, 20)); //둘 중 작은 값
		
	}
}
