package _20230612.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteEx {
	public static void main(String[] args) {
//		write1(); //외부파일 쓰기
//		read1(); //외부파일 읽기
		readAwrite(); //이미지 읽고 쓰기
	}
	
	public static void write1() {
		try {
			OutputStream os = new FileOutputStream("c:/temp/data1.txt");
			byte a = 10;
			byte b = 20;
			os.write(a);
			os.write(b);
			os.flush(); //캐시 정보 출력 후 비움
			os.close(); //리소스 환원
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of program");
	}
	
	public static void read1() {
		try {
			InputStream is = new FileInputStream("c:/temp/data1.txt");			
			while(true) {
				int readInt = is.read(); //1바이트씩 읽음
				if(readInt == -1)
					break;
				System.out.println(readInt);
			}
			is.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of program");
	}

	public static void readAwrite() {
		try{
			FileInputStream fis = new FileInputStream("c:/temp/vscode.exe");
			FileOutputStream fos = new FileOutputStream("c:/temp/copy.exe");
			byte[] bytes = new byte[100];
			while(true) {
				int readInt = fis.read(bytes); //bytes 크기만큼씩 읽어들이겠다.
//				System.out.println(readInt); //읽어들이는 걸 확인하는 용도
				if(readInt == -1)
					break;
				fos.write(readInt);
			}
			fis.close();
			fos.flush(); //스트림에 있는 값을 비움(파일에 씀)
			fos.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of readAwrite");
	}

}
