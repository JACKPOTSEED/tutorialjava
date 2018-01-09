package main.java.kr.sangj.thread.threadTest06;

public class ThreadGet extends Thread {

	main.java.kr.sangj.thread.threadTest06.Queue queue;
	
	public void setThreadGet(Queue queue) {
			
			this.queue = queue;
		}

	@Override
	public void run() {
	
		System.out.println("스레드 겟호출");		
		
		int i = (int) queue.remove();
		int i2 = (int) queue.remove();
		/*System.out.println("##################");*/
		// 무한 wait ? wait(10L) 이면 10초 있다가 깨워주는거 아닌가? 그러면 모니터링 락은 누가 것인가?
		int i3 = (int) queue.remove();
		/*int i4 = (int) queue.remove();*/		
		
		System.out.println("i : " + i);
		System.out.println("i2 : " + i2);
		System.out.println("i3 : " + i3);
		/*System.out.println("i3 : " + i3);
		System.out.println("i4 : " + i4);*/
		
		
	}
}