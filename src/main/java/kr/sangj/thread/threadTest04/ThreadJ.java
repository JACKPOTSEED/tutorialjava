package main.java.kr.sangj.thread.threadTest04;

public class ThreadJ extends Thread{
	
	public boolean stop = false;
	public boolean work = true;
		
	@Override
	public void run() {
		
		while(!stop) {
			
			if (work) {
				
				System.out.println("threadKKK �۾�����");
				
			} else {
				
				Thread.yield();
			}
		}					
	}
}
