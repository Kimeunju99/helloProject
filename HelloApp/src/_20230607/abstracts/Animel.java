package _20230607.abstracts;

public abstract class Animel {
	String kind;
	
	Animel(){}
	Animel(String kind){
		this.kind = kind;
	}
	
	void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	abstract void sound(); //자식클래스에서 반드시 구현!!!!!
	
}
