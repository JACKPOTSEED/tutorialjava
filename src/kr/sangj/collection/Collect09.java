package kr.sangj.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Collect09 {

	Queue<String> queue = new LinkedList<>();
	
	public void queueInit() {
		
		queue.offer("°¡");
		queue.offer("³ª");
		queue.offer("´Ù");
	}
	
	public void print() {
		
		queueInit();
		
		if(queue.peek() != null) {
			
			/*String str =  queue.poll();*/
			String str =  queue.peek();			
			
			System.out.println(str);	
		}
		
		System.out.println("queue : " + queue);
	}
}
