package com.yedam.classes;
//field: int[]
//method: 전체 출력, 합계, 최대값
public class KorScore {
	int[] kor = new int[] {100, 80, 70};
	
	KorScore(){}
	KorScore(int[] scores){
		kor = scores;
	}
	
	public void print() {
		System.out.println("목록");
		for(int score : kor) {
			System.out.printf("%d ", score);
		}
		System.out.println();
	}
	
	public void total() {
		int sum = 0;
		System.out.println("총합");
		for(int score : kor) {
			sum += score;
		}
		System.out.println(sum);
	}
	
	public void max() {
		int max = 0;
		for(int score : kor) {
			if(max < score)
				max = score;
		}
		System.out.println("최고 점수");
		System.out.println(max);
	}
}
