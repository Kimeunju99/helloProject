package _20230607.emp;

import java.util.Scanner;

public abstract class EmpList {
	Scanner scan = new Scanner(System.in);
	abstract void init(); //저장공간 초기화 (new Employee()) (new ArrayList())
	abstract void input(); //사원 추가
	abstract String search(int employeeId); //사원 조회
	abstract void print(); //전체 사원 조회
}
