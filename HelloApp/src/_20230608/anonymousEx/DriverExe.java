package _20230608.anonymousEx;

public class DriverExe {
	public static void main(String[] args) {
		BusDriver busDriver = new BusDriver();
		busDriver.drive(new Runnable() {
			@Override
			public void run() {
				System.out.println("버스를 운전합니다.");
			}
		});
		
		//간단 표현식
		busDriver.drive(()->System.out.println("45인승 버스를 운전합니다"));
	}
}
