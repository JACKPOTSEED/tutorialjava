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
		 * ������ ���� 01
		 * ������ ���� �ΰ��� ���
		 */
		/*RunnableTest runnableTest = new RunnableTest();
		Thread t= new Thread(runnableTest);
		
		Thread01 thread01 = new Thread01();
		
		System.out.println(thread01.getName());
		
		t.start();		
		thread01.start();*/
		
		/**
		 * ������ ���� 2.0
		 * ���ξ����� ����
		 */
		/*Toolkit toolkit = Toolkit.getDefaultToolkit();
				
			for (int i = 0; i < 5; i++) {
				
				toolkit.beep();
				
				try {
					
					Thread.sleep(500);
					
				} catch (InterruptedException e) {
					
					System.out.println("������ ����");
				}
			}
			
			for (int i = 0; i < 5; i++) {
				
				System.out.println("����");
				
				try {
					
					Thread.sleep(500);
					
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}*/
		
		/**
		 * ������ ���� 2.5
		 * thread�� main ������ ����
		 */		
		/*BeepTask beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
				
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("��");
		
			try {
				
				Thread.sleep(500);
				
			} catch (InterruptedException e) {

				System.out.println("������ ����");
			}
		}*/		
		
		/**
		 * ������ ���� 3.0
		 * join ����
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
		 * ������ 4
		 * ������ü�� wait notify
		 */
				
		/*WorkObject workObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start();
		threadB.start();*/
		
		/**
		 * ������ 5
		 * yield�� �������
		 * �������� �ٸ� �����忡�� �纸�ϰ� ��������°� �ȴ�. �� �ѹ��� �纸�Ѵ�.
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
		 * ������ü�� �߸��� �ʱ�ȭ
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
		 * ������Ǯ ����
		 */
		
		/*ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		Thread01 thread01 = new Thread01();
		
		for (int i = 0; i < 13; i++) {
		
			executorService.submit(thread01);
		}	
		
		executorService.shutdown();*/
		
		/**
		 * Queue ������ ����
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
