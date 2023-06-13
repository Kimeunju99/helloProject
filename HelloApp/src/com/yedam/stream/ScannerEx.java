package com.yedam.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("c:/temp/sample.txt"));
		
		while(true) {
			try {
				String input = scan.nextLine();
//				System.out.println(input); //한줄 분할 x
				String[] ins = input.split(" ");
				System.out.printf("사번:%s 이름:%s 급여:%s\n",ins[0], ins[1], ins[2]); //한줄 분할 o
				
			}catch(NoSuchElementException e) {
				
			}
		}
		
	}
}
