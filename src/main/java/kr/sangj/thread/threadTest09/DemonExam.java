package main.java.kr.sangj.thread.threadTest09;

public class DemonExam implements Runnable{

	static boolean autoSave = false;

	@Override
	public void run() {
		
		while (true) {
			
			try {

				Thread.sleep(1000);
				
			} catch (Exception e) {

			}	
			
			autoSave();
		}
	}
	
	private void autoSave() {
		
		System.out.println("�۾������� �ڵ����� �Ǿ����ϴ�.");
	}
}
