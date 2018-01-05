package main.java.kr.sangj.thread.threadTest01;

public class RunnableTest implements Runnable{

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			
			System.out.println("두번째쓰레드 실행 : " + i);
		}
	}
}
