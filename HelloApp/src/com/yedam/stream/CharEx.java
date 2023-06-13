package com.yedam.stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//reader writer
public class CharEx {
	public static void main(String[] args) {
		try{
			write1();		
			reade1();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void write1() throws IOException{
		FileWriter fw = new FileWriter("c:/temp/addr.txt");
		Scanner scan = new Scanner(System.in);
		System.out.print("종료는 quit>");
		String input = "";
		while(true) {
			input = scan.nextLine();
			if(input.equals("quit"))
				break;
			fw.write(input + "\n");
		}
		fw.flush();
		fw.close();
		scan.close();
		System.out.println("end of write");
	}

	public static void reade1() throws IOException{
		FileReader fr = new FileReader("c:/temp/addr.txt");
		while(true) {
			int reader = fr.read();
			//읽을 값이 많다면 배열 크기로 읽어들이면 빠르다. (char[] buf =new char[n]; fr.read(buf);)
			if(reader == -1)
				break;
			System.out.print((char)reader); //2바이트씩 읽음
		}
		fr.close();
		System.out.println("end of read");
	}
}
