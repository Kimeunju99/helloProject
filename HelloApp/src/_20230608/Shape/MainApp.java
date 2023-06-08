package _20230608.Shape;

public class MainApp {
	public static void main(String[] args) {
		Shape shape = new Triangle();
		shape.setColor("white");
		if(shape instanceof Triangle)
			((Triangle)shape).draw();
		
		shape = new Circle();
		if(shape instanceof Circle) {
			((Circle)shape).draw();
			((Circle)shape).move();
		}
	}
}
