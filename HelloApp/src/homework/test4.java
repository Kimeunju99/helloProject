package homework;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		
		//문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
//		System.out.println("Ex1");
//		for(int i =0; i<arr1.length;i++) {
//			if(arr1[i] == 60)
//				System.out.println(i);
//		}
		
		//문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
//		System.out.println("Ex2");
//		for(int i =0; i<arr1.length;i++) {
//			if(i != 3)
//				System.out.println(arr1[i]);
//		}
		
		//문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
  		//   입력) 인덱스: 3 ->   {10, 20, 30, 1000, 3, 60, -3}
//		System.out.println("Ex3");
//		System.out.printf("변경할 인덱스 번호(0~6): ");
//		int idx = scanner.nextInt();
//		arr1[idx] = 1000;
//		for(int i : arr1)
//			System.out.printf("%d ", i);
//		System.out.println();
//		
//		//문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
//		System.out.println("Ex4");
//		int max=arr1[0], min=arr1[0];
//		for(int i: arr1) {
//			if(max < i)
//				max = i;
//			if(min > i)
//				min = i;
//		}
//		System.out.println("최대: " + max + ",최소: " + min);
		
		//문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
//		int arrInt[] = new int[10];
//		System.out.println("Ex5");
//		System.out.println("자연수 10개를 입력하시오.");
//		for(int i=0;i<arrInt.length;i++)
//			arrInt[i] = scanner.nextInt();
//		for(int i : arrInt)
//			System.out.printf("%d, ", i);
//		System.out.println();
		
		// 문제) 다음은 키보드로부터 학생수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램입니다.
		//		 문제출처, 이것이 자바다 183페이지 9번
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		System.out.println("Ex6");
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1:
				//작성위치
				System.out.printf("학생 수를 입력하세요: ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				System.out.println("점수를 입력하세요.");
				for(int i=0;i<studentNum;i++) {
					System.out.printf("%d번째 학생> ", i+1);
					scores[i] = scanner.nextInt();
				}
				System.out.println("완료.");
				break;
			case 3:
				System.out.println("점수 목록");
				for(int i=0;i<studentNum;i++) {
					System.out.printf("%d번째 학생의 점수: %d \n", i+1, scores[i]);
				}
				break;
			case 4:
				int max =0, avg = 0;
				for(int i=0;i<studentNum;i++) {
					avg += scores[i];
					if(max < scores[i])
						max = scores[i];				
				}
				avg = avg/studentNum;
				System.out.println("최고점수: "+max+", 평균: "+avg);
				break;
			case 5:
				System.out.println("프로그램 종료.");
				run = false;
				break;
			}
			
		}
		
		
	}
}
