package _20230613.syncronize;

//user2: Calculator-memory => 200;
public class User2 extends Thread {
	private Calculator calculator;
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(200);
	}
}
