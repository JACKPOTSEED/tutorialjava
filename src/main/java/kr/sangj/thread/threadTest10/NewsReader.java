package main.java.kr.sangj.thread.threadTest10;

public class NewsReader implements Runnable{

	NewsPaper paper;

	public NewsReader(NewsPaper paper) {
		
		this.paper = paper;
	}

	@Override
	public void run() {

		System.out.println(paper.getTodayNews());
		
	}		
}
