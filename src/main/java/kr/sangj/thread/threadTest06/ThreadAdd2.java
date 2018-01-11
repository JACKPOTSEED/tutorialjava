package main.java.kr.sangj.thread.threadTest06;

public class ThreadAdd2 extends Thread {

	main.java.kr.sangj.thread.threadTest06.Queue queue;
	
	public void setThreadAdd(Queue queue) {
			
			this.queue = queue;
		}
	@Override
	public void run() {
	
		queue.add(7);		
		
		/*queue.add(73);*/
	}	
}
