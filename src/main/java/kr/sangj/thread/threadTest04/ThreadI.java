package main.java.kr.sangj.thread.threadTest04;

public class ThreadI extends Thread{

	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {

		while(!stop) {
		
			if (work) {
								
				System.out.println("ThreadI : �۾�����");
				
			} else {

				Thread.yield();
			}		
		}		
	}
}
