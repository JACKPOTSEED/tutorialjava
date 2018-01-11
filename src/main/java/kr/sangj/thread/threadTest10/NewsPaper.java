package main.java.kr.sangj.thread.threadTest10;

public class NewsPaper {

	String todayNews = null;
	
	public synchronized void setTodayNews(String news) {
		
		todayNews = news;		
		
		notifyAll();
	}
	
	public synchronized String getTodayNews() {			
		
		while(todayNews == null) {													
			
			try {
					
					wait();
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}			
		}			
	
		return todayNews;	
	}			
}