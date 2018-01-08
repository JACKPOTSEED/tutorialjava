package main.java.kr.sangj.thread.threadTest07;

public class User2 extends Thread {

	private DataStack dataStack;
	
	public void setDataStack(DataStack dataStack) {
		
		this.dataStack = dataStack;
	}
	
	public void run() {
		
		System.out.println("user2 run()");
		dataStack.setData(50);
	} 
}
