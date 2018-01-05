package main.java.kr.sangj.thread.threadTest04;

public class ThreadJ extends Thread{

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("threadJ : " + i);
		}
	}

}
