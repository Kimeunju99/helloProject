package _20230613.syncronize;

//user1: Calculator-memory => 100;
public class User1 extends Thread{
	private Calculator calculator;
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(100);
	}
}
