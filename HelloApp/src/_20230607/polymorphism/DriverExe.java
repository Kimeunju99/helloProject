package _20230607.polymorphism;

public class DriverExe {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		
		Driver driver = new Driver();
		driver.drive(vehicle);
		driver.drive(bus);
		driver.drive(taxi);
	}
}
