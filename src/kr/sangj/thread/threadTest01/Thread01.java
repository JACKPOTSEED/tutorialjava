package kr.sangj.thread.threadTest01;

public class Thread01 extends Thread {

	public Thread01() {
		
		setName("MyThread");
	}
	
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("ù��° ������ ���� : " + i);
		}
	}
}
