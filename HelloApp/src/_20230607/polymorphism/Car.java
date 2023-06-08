package _20230607.polymorphism;

public class Car {
	Tire frontLeft = new Tire("왼쪽앞",6);
	Tire frontRight = new Tire("오른쪽앞",2);
	Tire backLeft = new Tire("왼쪽뒤",3);
	Tire backRight = new Tire("오른쪽뒤",4);
	
	int run() { //주행
		System.out.println("자동차가 달립니다.");
		if(frontLeft.roll() ==false) {
			stop();
			return 1;
		}
		if(frontRight.roll() ==false) {
			stop();
			return 2;
		}
		if(backLeft.roll() ==false) {
			stop();
			return 3;
		}
		if(backRight.roll() ==false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop(){System.out.println("자동차가 멈춥니다.");}
}
