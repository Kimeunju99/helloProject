package _20230607.abstracts;

public abstract class Dao {
	void start() {
		System.out.println("DBMS 시작");
	}
	
	void stop() {
		System.out.println("DBMS 종료");
	}
	
	abstract void add();
	abstract void modify();
	abstract void remove();
	
}
