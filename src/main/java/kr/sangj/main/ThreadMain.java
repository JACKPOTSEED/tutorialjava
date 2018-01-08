package main.java.kr.sangj.main;

import java.awt.Toolkit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import main.java.kr.sangj.thread.threadTest01.RunnableTest;
import main.java.kr.sangj.thread.threadTest01.Thread01;
import main.java.kr.sangj.thread.threadTest02.BeepTask;
import main.java.kr.sangj.thread.threadTest03.ThreadA;
import main.java.kr.sangj.thread.threadTest03.ThreadB;
import main.java.kr.sangj.thread.threadTest03.WorkObject;
import main.java.kr.sangj.thread.threadTest04.ThreadI;
import main.java.kr.sangj.thread.threadTest04.ThreadJ;
import main.java.kr.sangj.thread.threadTest06.Queue;
import main.java.kr.sangj.thread.threadTest06.ThreadAdd;
import main.java.kr.sangj.thread.threadTest06.ThreadGet;
import main.java.kr.sangj.thread.threadTest07.DataStack;
import main.java.kr.sangj.thread.threadTest07.User1;
import main.java.kr.sangj.thread.threadTest07.User2;

public class ThreadMain {

	public static void main(String[] args) {
		
		/**
		 * 쓰레드 예제 01
		 * 쓰레드 생성 두가지 방법
		 */
		/*RunnableTest runnableTest = new RunnableTest();
		Thread t= new Thread(runnableTest);
		
		Thread01 thread01 = new Thread01();
		
		System.out.println(thread01.getName());
		
		t.start();		
		thread01.start();*/
		
		/**
		 * 쓰레드 예제 2.0
		 * 메인쓰레드 실행
		 */
		/*Toolkit toolkit = Toolkit.getDefaultToolkit();
				
			for (int i = 0; i < 5; i++) {
				
				toolkit.beep();
				
				try {
					
					Thread.sleep(500);
					
				} catch (InterruptedException e) {
					
					System.out.println("쓰레드 에러");
				}
			}
			
			for (int i = 0; i < 5; i++) {
				
				System.out.println("띵띵띵");
				
				try {
					
					Thread.sleep(500);
					
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}*/
		
		/**
		 * 쓰레드 예제 2.5
		 * thread와 main 쓰레드 실행
		 */		
		/*BeepTask beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
				
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("띵");
		
			try {
				
				Thread.sleep(500);
				
			} catch (InterruptedException e) {

				System.out.println("쓰레드 에러");
			}
		}*/		
		
		/**
		 * 쓰레드 예제 3.0
		 * join 예제
		 */
		
		/*Thread thread001 = new Thread(new Runnable() {
			
			public void print() {

					for (int i = 0; i < 5; i++) {
						
						System.out.println("i : " + i);
					}
			}
			
			@Override
			public  void run() {
				
				print();
			}
		});
		
		Thread thread002 = new Thread(new Runnable() {			
			
			public void print() {
				
					for (int i = 0; i < 5; i++) {
						
						System.out.println("j : " + i);
					}	
			}
			
			@Override
			public  void run() {
				
				print();
			}
		});
		
		Thread thread003 = new Thread(new Runnable() {
			
			public void print() {
				
				for (int i = 0; i < 5; i++) {
					
					System.out.println("k : " + i);
				}
		}
		
			@Override
			public  void run() {
				
				print();
			}
		});

		thread001.start();
		
		try {
			
			thread001.join();
			
		} catch (InterruptedException e) {

			e.printStackTrace();
			
		}
		
		thread002.start();		
		thread003.start();*/
		
		/**
		 * 쓰레드 4
		 * 공유객체와 wait notify
		 */
				
		/*WorkObject workObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start();
		threadB.start();*/
		
		/**
		 * 쓰레드 5
		 * yield의 실행순서
		 * 실행중인 다른 쓰레드에게 양보하고 실행대기상태가 된다. 즉 한번만 양보한다.
		 */
		
		/*ThreadI threadI = new ThreadI();
		ThreadJ threadJ = new ThreadJ();	
		
		threadI.start();		
		threadJ.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		threadI.work = false;
				
		try {
			
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		System.out.println("==============");
		
		threadI.work = true;
		threadJ.work = false;*/			
		
		/**
		 * 공유객체의 잘못된 초기화
		 */
		
		/*DataStack dataStack = new DataStack();
		
		User1 user1 = new User1();
		user1.setDataStack(dataStack);
		user1.start();
		
		try {
			
			user1.join();
			
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		User2 user2 = new User2();
		user2.setDataStack(dataStack);
		user2.start();*/
		
		/**
		 * 쓰레드풀 예제
		 */
		
		/*ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		Thread01 thread01 = new Thread01();
		
		for (int i = 0; i < 13; i++) {
		
			executorService.submit(thread01);
		}	
		
		executorService.shutdown();*/
		
		/**
		 * Queue 쓰레드 예제
		 */
		
		/*main.java.kr.sangj.thread.threadTest06.Queue<Integer> queue = new Queue<Integer>();
		
		ThreadAdd threadAdd = new ThreadAdd();		
		ThreadGet threadGet = new ThreadGet();
		
		threadAdd.setThreadAdd(queue);
		threadGet.setThreadGet(queue);
		
		threadAdd.start();			
		threadGet.start();*/
	}
}
