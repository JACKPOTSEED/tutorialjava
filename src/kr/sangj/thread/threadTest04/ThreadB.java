package kr.sangj.thread.threadTest04;

public class ThreadB extends Thread {
	
	WorkObject workObject;

	public ThreadB(WorkObject workObject) {

		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			workObject.methodB();
		}
	}
}
