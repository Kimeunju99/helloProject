package com.yedam.stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileEx {
	public static void main(String[] args) {
		try {
//			FileOutputStream fos = new FileOutputStream("sample.txt");
//			fos.write(10);
//			fos.close();
			//MempApp.java 읽어서 출력
			InputStream is = new FileInputStream("src/com/yedam/memo/MemoApp.java");
			InputStreamReader isr =new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String str = "";
			
			while((str = br.readLine()) != null)
				System.out.println(str);
			br.close();
			isr.close();
			is.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
