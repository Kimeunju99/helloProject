package _20230608.exceptions;

public class ClassNotFoundExe {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
