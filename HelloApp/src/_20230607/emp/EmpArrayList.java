package _20230607.emp;
import java.util.ArrayList;

public class EmpArrayList extends EmpList{
	ArrayList employees;
	@Override
	void init() {
		employees = new ArrayList();
	}

	@Override
	void input() {
		System.out.printf("%d 사번> ", employees.size());
		int no = scan.nextInt();
		System.out.print("이름> ");
		String name = scan.next();
		System.out.print("급여> ");
		int salary = scan.nextInt();
		employees.add(new Employee(no,name,salary));
	}

	@Override
	String search(int employeeId) {
		for(int i=0;i<employees.size();i++) {
			Employee emp = (Employee)employees.get(i);
			if( emp != null && emp.getEmpId() == employeeId) {
				return emp.getEmpName();
			}
		}
		return null;
	}

	@Override
	void print() {
		for(int i=0;i<employees.size();i++) {
			Employee emp = (Employee)employees.get(i);
				System.out.printf("%5d %10s %7d\n", emp.getEmpId(), emp.getEmpName(), emp.getSalary());
		}
	}

}
