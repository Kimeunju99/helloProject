package _20230608.anonymousEx;

public class BusDriver implements Driver{

	@Override
	public void drive(Runnable runnable) {
		runnable.run();
	}

}
