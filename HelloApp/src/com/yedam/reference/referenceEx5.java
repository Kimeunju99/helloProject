package com.yedam.reference;

public class referenceEx5 {
	public static void main(String[] args) {
		// intAry의 제일 첫번째는 제일 큰값, 마지막은 제일 작은 값을 넣음
		int a = (int) (Math.random() * 100) + 1;
		int b = (int) (Math.random() * 100) + 1;
		int c = (int) (Math.random() * 100) + 1;
		int d = (int) (Math.random() * 100) + 1;
		int intAry[] = { a, b, c, d };

		System.out.println("처음 순서");
		callseq(intAry);
		System.out.println();
		
		//정렬
//		mycode(intAry);
		profcode(intAry);

		System.out.println("바뀐 순서");
		callseq(intAry);

	}
	
	
	
	public static void callseq(int intAry[]) {
		for (int i = 0; i < intAry.length; i++) {
			System.out.printf("%d ", intAry[i]);
		}
	}

	public static void mycode(int intAry[]) {
		int temp = 0;
		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry.length - 1; j++) {
				if (intAry[i] > intAry[j]) {
					temp = intAry[i];
					intAry[i] = intAry[j];
					intAry[j] = temp;
				}
			}
		}
	}
	
	public static void profcode(int intAry[]) {
		for (int j = 0; j < intAry.length - 1; j++) {
			for (int i = 0; i < intAry.length - 1; i++) {
				int cmp = 0;
				if (intAry[i] < intAry[i + 1]) {
					cmp = intAry[i];
					intAry[i] = intAry[i + 1];
					intAry[i + 1] = cmp;
				}
			}
		}
	}
	
}
