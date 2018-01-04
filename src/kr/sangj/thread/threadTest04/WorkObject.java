package kr.sangj.thread.threadTest04;

public class WorkObject {

	public synchronized void methodA() {
		
		System.out.println("methoA의 작업실행");
		
		notify();
		
		try {
			
			wait();
			
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	
	public synchronized void methodB() {
		
		System.out.println("methoB의 작업실행");
		
		notify();
		
		try {
			
			wait();
			
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}
