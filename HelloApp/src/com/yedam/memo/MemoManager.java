package com.yedam.memo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoManager {
	Scanner scan = new Scanner(System.in);
	List<Memo> storage = new ArrayList<>();
	
	MemoManager(){
		readFromFile();
	}
	
	//insert
	public void inputData() {
		System.out.print("번호>");
		int no = Integer.parseInt(scan.nextLine());
		System.out.print("날짜>");
		String date = scan.nextLine();
		System.out.print("내용>");
		String content = scan.nextLine();
		
		storage.add(new Memo(no,date,content));
	}
	
	public void storeToFile() {
		try{
			FileOutputStream fos = new FileOutputStream("c:/temp/memobook.dat");	
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(storage);
			oos.close();
			fos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//search
	public void searchData() {
		System.out.print("날짜> ");
		String date = scan.nextLine();
		boolean isYn = false;
		for(int i=0;i<storage.size();i++) {
			if(date.equals(storage.get(i).getDate())) {
				System.out.println(storage.get(i));
				isYn =true;
			}
		}
		if(!isYn) {
			System.out.println("해당 날짜 x");
		}
	}
	
	//delete
	public void deleteData() {
		System.out.print("번호> ");
		int no = Integer.parseInt(scan.nextLine());
		boolean isYn = false;
		for(int i=0;i<storage.size();i++) {
			if(storage.get(i).getNo() == no) {
				System.out.println("삭제 완료");
				isYn =true;
				storage.remove(i);
			}
		}
		if(!isYn) {
			System.out.println("해당 번호 x");
		}
	}
	
	public void readFromFile() {
		try {
			FileInputStream fis = new FileInputStream("c:/temp/memobook.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			storage = (List<Memo>) ois.readObject();
			ois.close();
			fis.close();
		}catch(FileNotFoundException | ClassNotFoundException e){
			
		}catch(IOException e) {}
	}
}
