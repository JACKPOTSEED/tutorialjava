package main.java.kr.sangj.thread.threadTest06;

import java.util.Arrays;
import java.util.concurrent.SynchronousQueue;

public class Queue<E> {

	private transient E[] elementData;
	private int capacity;
	private int datasize;
	private final long waitTime = 10L;
	private boolean enabled = true;
	private int front = 0;
	private int rear = 0;

	public Queue() {
		
		this(10);
	}
	
	public Queue(int initialCapacity) {
		
		if (initialCapacity<0) {
			
			throw new IllegalArgumentException("Illegeal Capacity:" + initialCapacity);
		}
		
		elementData = (E[]) new Object[initialCapacity];
		capacity = initialCapacity;
	}
	
	public synchronized void add(E e) {
		
		if (e == null) {
		
			return;
		}
		
		datasize ++;
		
		System.out.println("================");
		System.out.println("front : "  + front);
		System.out.println("capacity : "  + capacity);
		System.out.println("rear : "  + rear);
		System.out.println("================");
		
		if ((front +1) % capacity == rear) {
			throw new IllegalArgumentException("Illegeal Capacity:" + "Queue is Full");
		}
		
		elementData[front] = e;
		
		front = (front + 1 ) % capacity;
		
		try {
			
			notifyAll();
		} catch (Exception e2) {

		}		
	}
	
	public synchronized E remove() {
		
		while (enabled) {
			E answer = peek();
			
			if (answer != null) {
				
				return answer;
			}
			
			try {
				
				wait(waitTime);
				
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		
		return null;
	}
	
	private E peek() {
		
		if (front == rear) {
			
			return null;
		}
		
		E oldValue = elementData[rear];
		
		if (oldValue != null) {
			
			datasize--;
			elementData[rear] = null;
			rear = (rear + 1 ) % capacity;
		}
		return oldValue;		
	}
}
