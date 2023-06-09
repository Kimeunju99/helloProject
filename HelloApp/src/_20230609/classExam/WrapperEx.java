package _20230609.classExam;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		int n1 = i1; // 객체 -> 기본 (언박싱)
		i1 = 100;    // 기본 -> 객체 (박싱)
		n1 = 50;
		Integer result = i1 + n1;
		System.out.println(result);
		n1 = Integer.parseInt("100");
		
		byte b1 = Byte.parseByte("100"); //기본
		Byte b2 = Byte.valueOf("10"); //객체
		b2.byteValue(); //객체 -> 기본
		
		Short s1 = Short.valueOf("100");
		short s2 = s1.shortValue();
		
		
		Integer w1 = Integer.valueOf("100");
		Integer w2 = Integer.valueOf("100");
		System.out.println(w1.intValue() == w2.intValue()); //객체의 값 비교 x -> 기본타입 변경
		System.out.println(w1.equals(w2));
	}
}
