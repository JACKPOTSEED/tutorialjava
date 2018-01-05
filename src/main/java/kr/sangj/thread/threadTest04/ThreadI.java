package main.java.kr.sangj.thread.threadTest04;

public class ThreadI extends Thread{

	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {

		while(!stop) {
		
			if (work) {
				
				for (int i = 0; i < 10; i++) {
					
					System.out.println("ThreadI : " + i);
				}
			} else {

				Thread.yield();
			}		
		}		
	}
}
