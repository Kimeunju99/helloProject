package com.yedam.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StudentEx {
	public static void main(String[] args){
		// /c:/temp/students.txt 읽어서 평균을 구하기
		//최고점 학생 이름, 점수 출력
		try{
			mycode();
			profcode();
			profcode2();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
	}
	
	public static void mycode() throws IOException{
		Scanner scan = new Scanner(new File("c:/temp/students.txt"));
		double avg = 0;
		int max = 0, sum =0, count=0;
		String name = "";
		try{
			while(true) {
				try {
					String line = scan.nextLine();
					String[] info = line.split(" ");
					int score = Integer.parseInt(info[2]);
					if(max < score) {
						max = score;
						name = info[1];
					}
					sum += Integer.parseInt(info[2]);
					count++;
				}catch(NoSuchElementException e) {
					break;
				}
			}
			avg = sum/count;
			System.out.printf("최고:%d 이름:%s 평균:%.2f \n",max,name,avg);
			scan.close();
		}catch(NoSuchElementException e) {
		}
	}

	public static void profcode() throws IOException{
		Scanner scan = new Scanner(new File("c:/temp/students.txt"));
		String name = "";
		int sum=0, cnt=0, max =0;
		double avg = 0;
		
		while(true) {
			String values = "";
			
			try {
				values = scan.nextLine();
			}catch(NoSuchElementException e) {
				break;
			}
			
			String[] val = values.split(" ");
			sum += Integer.parseInt(val[2]);
			cnt++;
			
			if(max<Integer.parseInt(val[2])){
				max = Integer.parseInt(val[2]);
				name = val[1];
			}
		}
		avg = (double)sum/cnt;
		System.out.printf("평균점수: %.2f\n", avg);
		System.out.printf("최고점:%d 이름:%s \n", max, name);
	}
	
	public static void profcode2() throws IOException{
		InputStream is = new FileInputStream("c:/temp/students.txt");
		InputStreamReader isr = new InputStreamReader(is);
		char[] buf = new char[200];
		isr.read(buf); //read 입력을 통해 buf에 저장;
		String str = new String(buf);
		String[] strArr = str.split("\n");
		
		int sum=0, max=0, count=0;
		double avg = 0;
		String name ="";
		
		for(String student: strArr) {
			if(student != null) {
				String[] std = student.split(" ");
//				if(Integer.parseInt(std[2]) > max) {
//					max = Integer.parseInt(std[2]);
//					name = std[1];
//					}
//				sum += Integer.parseInt(std[2]);
//				count++;
				System.out.printf("학생번호 %s | 이름: %s | 점수: %s", std[0], std[1], std[2]);
			}
		}
//		avg = sum/count;
//		System.out.printf("평균 %f | 1등: %s | 최고점: %d", avg, name, max);
		
		isr.close();
		is.close();
	}
}
