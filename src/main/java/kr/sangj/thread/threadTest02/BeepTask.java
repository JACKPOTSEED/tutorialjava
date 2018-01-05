package main.java.kr.sangj.thread.threadTest02;

import java.awt.Toolkit;

public class BeepTask implements Runnable{
	
	@Override
	public void run() {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i = 0; i < 5; i++) {
			
			toolkit.beep();
			
			try {
				
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				
				System.out.println("쓰레드 에러");
			}
		}
	}	
}
