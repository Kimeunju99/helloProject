package com.yedam.classes;

public class Department {
	private int departId; //부서번호
	private String departName; //부서명
	private int manageId; //부서장
	
	//생성자
	Department(){}
	Department(int departId){
		this.departId = departId;
	}
	Department(int departId, String departName){
		this.departId = departId;
		this.departName = departName;
	}
	Department(int departId, String departName,int manageId){
		this.departId = departId;
		this.departName = departName;
		this.manageId = manageId;
	}
	
	public void setDepartId(int departId) {
		this.departId = departId;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	public void setDepartManageId(int manageId) {
		this.manageId = manageId;
	}
	
	public int getDepartId() {
		return departId;
	}
	
	public String getDepartName() {
		return departName;
	}
	public int getManageId() {
		return manageId;
	}
	
	@Override
	public String toString() {
//		return super.toString(); //부모(Object)의 toString() 실행
		return "부서번호: " + departId + ", 부서명: " + departName
				+ ", 부서장: " + manageId;
	}
}
