package _20230607.emp;

public class EmpListApp {
	public static void main(String[] args) {
		EmpList app = new EmpArray(); //배열
		app = new EmpArrayList(); //배열리스트
		
		app.init();
		app.input();
		app.print();
		app.search(0);
	}
}
