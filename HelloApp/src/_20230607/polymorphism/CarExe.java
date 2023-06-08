package _20230607.polymorphism;

public class CarExe {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=0;i<=6;i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
			case 1:
				System.out.println("왼쪽앞에 HankookTire로 교체");
				car.frontLeft = new HankookTire("왼쪽앞", 10);
				break;
			case 2:
				System.out.println("오른쪽앞에 KeumhoTire로 교체");
				car.frontRight = new KeumhoTire("오른쪽앞", 11);
				break;
			case 3:
				System.out.println("왼쪽뒤에 HankookTire로 교체");
				car.backLeft = new HankookTire("왼쪽뒤", 12);
				break;
			case 4:
				System.out.println("오른쪽뒤에 KeumhoTire로 교체");
				car.backRight = new KeumhoTire("오른쪽뒤", 11);
				break;
			}
			System.out.println("==============================");
		}
	}
}
