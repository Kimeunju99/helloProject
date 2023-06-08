package _20230607.emp;

public class Employee {
	private int empId; //사원번호
	private String empName; //사원명
	private int deptId; //부서번호 10(인사), 20(개발), 30(영업:default)
	private String deptName; //부서명
	private int salary; //급여
	private String email; //이메일
	
	//생성자
	Employee(){deptId = 30;}
	Employee(int empId, String empName, int salary, int deptId){
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.deptId = deptId;
		
		if(deptId ==10) { deptName ="인사";}
		else if(deptId == 20) {deptName = "개발";}
		else {deptName = "영업";}
	}
	Employee(int empId, String empName){
		this(empId, empName, 0, 30);//생성자 호출
	}
	Employee(int empId, String empName, int salary){
		this(empId, empName, salary, 30);
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
