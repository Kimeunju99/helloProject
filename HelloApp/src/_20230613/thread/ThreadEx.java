package _20230613.thread;

import java.awt.Toolkit;

public class ThreadEx {
	public static void main(String[] args) {
		//화면 내용 출력 & 소리 출력
		//multiple-thread
		
		//1. Runnable interface -> class 구현 
//		Thread thread = new Thread(new BeepTask());
		
		//2. Runnable interface -> 익명함수
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i=0;i<5;i++) {
//					toolkit.beep(); //소리가 난다
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}	
//			}
//		});
		
		//3. Thread 클래스 상속을 받은 하위 클래스
		Thread thread = new BeepThread();

		thread.start();

		for(int i=0;i<5;i++) {
			System.out.println("print");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
