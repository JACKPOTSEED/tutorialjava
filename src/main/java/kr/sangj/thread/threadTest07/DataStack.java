package main.java.kr.sangj.thread.threadTest07;

public class DataStack {
	
	private int data = 0;
	
	public int getData() {
		
		return data;
	}
	
	public synchronized void setData(int data) {
		
		this.data = data;
		
		try {

			Thread.sleep(2000);
			
		} catch (Exception e) {}
		
		System.out.println(Thread.currentThread().getName() + ":" + this.data);
	}

}
