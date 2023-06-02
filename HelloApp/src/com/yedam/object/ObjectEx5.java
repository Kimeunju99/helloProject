package com.yedam.object;

//static <-> instance
public class ObjectEx5 {
	public static void main(String[] args) {
		int num1 =10; int num2 =20;

		ObjectEx5 o5 = new ObjectEx5(); //memory 로딩
		int result = o5.sum(num1, num2);
		int result2 = sum2(num1, num2);
		double result3 = div(num1, num2);
		result = sum(new int[] {1,2,3});
		
		makePerson("홍길동", 20);
		
		int []res = makeArr(5);
		for(int r : res)
			System.out.println(r);
		showNumber(makeArr(5));
	}

	
	public int sum(int n1, int n2) { return n1 + n2; } //instance method ->실체가 없음
	public static int sum2(int n1, int n2) { return n1 + n2; } //runtime에 바로 생성되어 메모리에 준비되어 있음
	public static double div(int n1, int n2) { return (double) n1 / n2; }
	
	//메소드 오버로딩 method 이름은 같은데 매개변수가 다름
	public static int sum(int[] ary) {
		int result =0;
		for (int num: ary)
			result += num;
		return result;
	}
	
	public static Person makePerson(String name, int age) {
		return new Person(name, age);
	}
	
	public static int[] makeArr(int size) {
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++)
			arr[i] = (int)(Math.random()*10);
		return arr;
	}
	
	public static void showNumber(int[] arr) {
		for(int n : arr)
			System.out.println(n);
	}
}
