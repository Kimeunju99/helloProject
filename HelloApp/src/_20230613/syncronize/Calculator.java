package _20230613.syncronize;
//User1, User2 thread
public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("스레드명: " + Thread.currentThread().getName() + ":" + memory);
	}
}
