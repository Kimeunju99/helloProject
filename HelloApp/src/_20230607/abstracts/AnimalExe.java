package _20230607.abstracts;

public class AnimalExe {
	public static void main(String[] args) {
		//추상 클래스 -> 실체 클래스x(new)
		Animel animal = null;
		animal = new Bird();
		animal.breathe();
		animal.sound();
		
		Bird bird = new Bird();
		bird.breathe();
		bird.sound();
		
		Cat cat = new Cat();
		cat.breathe();
		cat.sound();
	}
}
