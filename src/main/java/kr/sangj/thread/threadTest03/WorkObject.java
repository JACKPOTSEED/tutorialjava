package main.java.kr.sangj.thread.threadTest03;

public class WorkObject {

	public synchronized void methodA() {
		
		System.out.println("methoA�� �۾�����");
		
		notify();
		
		try {
			
			wait();
			
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	
	public synchronized void methodB() {
		
		System.out.println("methoB�� �۾�����");
		
		notify();
		
		try {
			
			wait();
			
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}
