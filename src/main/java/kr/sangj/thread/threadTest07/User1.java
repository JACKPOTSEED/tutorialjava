package main.java.kr.sangj.thread.threadTest07;

public class User1 extends Thread {

	private DataStack dataStack;
	
	public void setDataStack(DataStack dataStack) {
				
		this.dataStack = dataStack;
	}
	
	public void run() {
		
		System.out.println("user1 run()");
		dataStack.setData(100);
	}
}
