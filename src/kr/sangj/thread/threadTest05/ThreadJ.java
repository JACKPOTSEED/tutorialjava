package kr.sangj.thread.threadTest05;

public class ThreadJ extends Thread{

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("threadJ : " + i);
		}
	}

}
