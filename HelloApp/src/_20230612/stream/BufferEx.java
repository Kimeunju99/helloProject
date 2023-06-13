package _20230612.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferEx {
	public static void main(String[] args) {
		try {
			bufferStrm();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void bufferStrm() throws IOException{
		//읽고 쓰는 값을 버퍼에 저장 ->성능 향상
		FileInputStream fis = new FileInputStream("c:/temp/vscode.exe");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("c:/temp/copy2.exe");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		while(bis.read() != -1) {
			int reader = bis.read();
			bos.write(reader);
		}
		bos.flush();	bos.close();
		fos.flush();	fos.close();
		fis.close();
		bis.close();
		System.out.println("end of bufferStrm");
	}
}
