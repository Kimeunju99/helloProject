package _20230609.collectionExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employ{
	int empNo;
	String empName;
	int salary;
	Employ(int empNo, String empName, int salary){
		this.empName = empName;
		this.empNo = empNo;
		this.salary = salary;
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Employ> employees = new ArrayList<>();
		System.out.println("ex) 100 홍길동 1000");
		
		while(true) {
		String input = scan.nextLine();
		String[] inputs = input.split(" ");
		if(inputs[0].equals("quit")) {
			System.out.println("종료합니다.");
			break;
		}
		if(inputs.length !=3) {
			System.out.println("값을 정확하게 입력.");
			continue;
		}
		employees.add(new 
				Employ(Integer.parseInt(inputs[0]), inputs[1], Integer.parseInt(inputs[2])));
		}
		
		for(Employ emp : employees) {
			System.out.printf("사번:%d, 이름:%s, 급여:%d \n",
					emp.empNo, emp.empName, emp.salary);
		}
		
	}
}
