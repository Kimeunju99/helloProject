package _20230607.emp;

public class EmpArray extends EmpList{
	Employee[] employees;
	int empNum;
	
	@Override
	void init() {
		System.out.println("사원 수 입력>");
		int num = Integer.parseInt(scan.nextLine());
		employees = new Employee[num];
	}

	@Override
	void input() {
		System.out.printf("%d 사번> ", empNum);
		int no = scan.nextInt();
		System.out.print("이름> ");
		String name = scan.next();
		System.out.print("급여> ");
		int salary = scan.nextInt();
		employees[empNum++] = new Employee(no,name,salary);
	}

	@Override
	String search(int employeeId) {
		for(int i=0;i<employees.length;i++) {
			if(employees[i] != null && employees[i].getEmpId() == employeeId) {
				return employees[i].getEmpName();
			}
		}
		return null;
	}

	@Override
	void print() {
		for(int i=0;i<employees.length;i++) {
			if(employees[i] != null) {
				System.out.printf("%5d %10s %7d\n",
						employees[i].getEmpId(), employees[i].getEmpName(), employees[i].getSalary());
			}
		}
	}

}
