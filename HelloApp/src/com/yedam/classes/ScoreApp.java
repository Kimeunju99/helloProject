package com.yedam.classes;

//라이브러리 클래스: KorScore

public class ScoreApp { //실행클래스:main
	public static void main(String[] args) {
		//---------class:KorScor--------------------
		KorScore score = new KorScore();//기본 생성자
		score.print();
		score.total();
		score.max();

		System.out.println();
		
		KorScore score1 = new KorScore(new int[]{77,88,99}); //사용자 정의 생성자
		score1.print();
		score1.total();
		score1.max();
		
		//------------class:Calculator--------------------
		Calculator cal = new Calculator();
		cal.sum(score1.kor[0], score1.kor[1]); //인스턴스 메소드 호출
		Calculator.sum(score1.kor[0], score1.kor[1]); //정적 메소드 호출
		Calculator.getArea(4);
	}
}
