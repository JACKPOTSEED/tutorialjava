package main.java.kr.sangj.thread.threadTest03;

public class ThreadA extends Thread{

	WorkObject workObject;

	public ThreadA(WorkObject workObject) {
		//TODO super(); ���۰� �� ������ �����غ���
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			workObject.methodA();
		}
	}
}
