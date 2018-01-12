package main.java.kr.sangj.thread.threadTest06;

public class ThreadAdd extends Thread {

	main.java.kr.sangj.thread.threadTest06.Queue queue;
	
	public void setThreadAdd(Queue queue) {
		
		this.queue = queue;
	}
	
	@Override
	public void run() {

		queue.add(3);		
		queue.add(5);		
		queue.add(534);
		
		
		/*queue.add(36);*/
		
		/*queue.add(73);*/
	}	
}
