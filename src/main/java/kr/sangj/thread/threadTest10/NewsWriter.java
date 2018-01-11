package main.java.kr.sangj.thread.threadTest10;

public class NewsWriter implements Runnable {

	NewsPaper paper;
	String news;
	
	public NewsWriter(NewsPaper paper,String news) {
		
		this.paper = paper;
		this.news  = news;
	}

	@Override
	public void run() {

		paper.setTodayNews(this.news);
	}	
}
