package _20230608.Shape;

public class Circle extends Shape implements Drawale, Movable{

	@Override
	public void move() {
		System.out.println("원을 이동");
	}

	@Override
	public void draw() {
		System.out.println("원 그림");
	}

}
