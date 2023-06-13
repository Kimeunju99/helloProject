package _20230612.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Emp implements Serializable { //직렬화 역질렬화를 할 수 있는 클래스(객체를 저장-불러오기 가능)임을 명시
	int empNo;
	String empName;
	String dept;
	public Emp(int empNo, String empName, String dept) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
	}
}

public class ObjectEx {
	public static void main(String[] args) throws Exception{
		writer();
		reader();
		System.out.println("end");
	}
	
	public static void writer() throws Exception{
		List<Emp> list = new ArrayList<>();
		list.add(new Emp(101,"홍길동", "인사"));
		list.add(new Emp(102,"김길동", "개발"));
		list.add(new Emp(103,"이길동", "총무"));
		FileOutputStream fos = new FileOutputStream("c:/temp/list.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos); //보조스트림
		
		oos.writeObject(list);
		oos.flush();		fos.flush();
		oos.close();		fos.close();
	}
	
	public static void reader() throws Exception{
		FileInputStream fis = new FileInputStream("C:/temp/list.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		List<Emp> list = (List<Emp>)ois.readObject(); //역직렬화
		for(Emp emp: list) {
			System.out.printf("사번:%d | 이름:%s | 부서:%s\n", emp.empNo, emp.empName, emp.dept);
		}
	}
}
