package _20230608.listTest;

public class Box<T> {
	private T obj;
	
	void setObj(T obj) {
		this.obj = obj;
	}
	
	T getObj() {
		return obj;
	}
}
