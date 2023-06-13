package _20230609.collectionExam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Student{
	int studentNum; //고유한 값
	String name;
	Student(int studentNum, String name){
		this.studentNum = studentNum;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student stu = (Student)obj;
			if(stu.hashCode() == this.studentNum)
				return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.studentNum;
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
		students.add(new Student(1, "hong"));
		students.add(new Student(2, "kim"));
		students.add(new Student(1, "park"));
		
		Iterator<Student> iter = students.iterator();
		while(iter.hasNext()) {
			Student result = iter.next();
			System.out.printf("%d, %s\n", result.studentNum, result.name);
		}
	}
}
