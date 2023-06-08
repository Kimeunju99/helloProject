package _20230608.anonymousEx;

public class AnonymousEx {
	public static void main(String[] args) {
		//---------------------------------------------------------------------
		RunClass run = new RunClass();
		run.run();
		//------------익명구현객체:인터페이스 구현객체로 선언x 이름없는 클래스로 사용-------------
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("고양이가 달립니다.");
			}
		};
		runnable.run();
		//---------------------------------------------------------------------
		runnable = () -> { System.out.println("기차가 달립니다.");
		};
		runnable.run();
		//---------------------------------------------------------------------
		runnable = () -> System.out.println("버스가 달립니다.");
		runnable.run();
	}
}
