package com.yedam.insa;

import java.util.Scanner;

//사원정보 배열, 등록/조회/출력 기능
public class empList {
	Employee[] list;
	int empNum;
	Scanner scan = new Scanner(System.in);
	
	private empList(){	}
	private empList(Employee[] list){
		this.list = list;
		this.empNum = list.length;
	}
	
	//singleton
	private static empList instance = new empList();
	public static empList getInstance() {
		return instance;
	}
	
	//method
	public void init() {
		System.out.print("사원수> ");
		int num = scan.nextInt();
		list = new Employee[num];
	} //초기화
	
	public void input() {
		if(empNum >= list.length) {
			System.out.println("입력초과");
			return;
		}
		
		System.out.printf("%d 사번> ", empNum);
		int no = scan.nextInt();
		System.out.print("이름> ");
		String name = scan.next(); //엔터까지 처리
		System.out.println("급여> ");
		int sal = scan.nextInt();
		list[empNum++] = new Employee(no, name, sal);
		//empNum은 기본생성자 사용 시 초기화하지 않아서 자동 0임.
	}//등록
	
	public String search(int empId) {
		for(int i =0; i<list.length;i++) {
			if(list[i].getEmpId() == empId)
				return list[i].getEmpName();
		}
		return "";
	}//특정 사원 조회
	
	public void print() {
		System.out.printf("%5s %10s %7s\n","사번","사원명","급여");
		for(int i=0;i<list.length;i++) {
			System.out.printf("%5d %10s %7d\n",list[i].getDeptId(),
					list[i].getEmpName(), list[i].getSalary());
		}//사번, 사원명, 급여
	}//전체 조회
	
	public void sumSal() {
		int sum = 0;
		for(int i=0;i<list.length;i++)
			sum += list[i].getSalary();
		System.out.println("급여합계: " + sum);
	}
}
