package main.java.kr.sangj.thread.threadTest03;

public class ThreadA extends Thread{

	WorkObject workObject;

	public ThreadA(WorkObject workObject) {
		//TODO super(); 슈퍼가 왜 생길지 생각해보기
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			workObject.methodA();
		}
	}
}
