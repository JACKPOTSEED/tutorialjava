package main.java.kr.sangj.main;

import main.java.kr.sangj.array.Array01;
import main.java.kr.sangj.abstaraction.abstract01.Circle;
import main.java.kr.sangj.abstaraction.abstract01.Shape;
import main.java.kr.sangj.abstaraction.abstract02.Hello;
import main.java.kr.sangj.abstaraction.abstract02.Ihello;
import main.java.kr.sangj.capsulation.Capsule01;
import main.java.kr.sangj.collection.Collect01;
import main.java.kr.sangj.collection.Collect02;
import main.java.kr.sangj.collection.Collect03;
import main.java.kr.sangj.collection.Collect04;
import main.java.kr.sangj.collection.Collect05;
import main.java.kr.sangj.collection.Collect06;
import main.java.kr.sangj.collection.Collect07;
import main.java.kr.sangj.collection.Collect08;
import main.java.kr.sangj.collection.Collect09;
import main.java.kr.sangj.exception.Exception01;
import main.java.kr.sangj.exception.Exception02;
import main.java.kr.sangj.exception.Exception03;
import main.java.kr.sangj.exception.UserException;
import main.java.kr.sangj.function.Pr01;
import main.java.kr.sangj.function.Pr02;
import main.java.kr.sangj.function.Pr03;
import main.java.kr.sangj.function.Pr04;
import main.java.kr.sangj.function.Pr05;
import main.java.kr.sangj.function.Pr06;
import main.java.kr.sangj.polymorphism.poly01.BBB;
import main.java.kr.sangj.polymorphism.poly02.Am;
import main.java.kr.sangj.polymorphism.poly02.Bm;
import main.java.kr.sangj.polymorphism.poly02.Cm;
import main.java.kr.sangj.polymorphism.poly03.Child;
import main.java.kr.sangj.polymorphism.poly03.Parent;



/**
 * @author sangj
 * @since  2017.12.28
 */
public class Main {

	public static void main(String[] args) {

		/**
		 * &&������ ����
		 * 4��и�����
		 */
		Pr01 pr01 = new Pr01(1,3);
		pr01.print();
		
		/**
		 * if else ����
		 * ������ ������ ���� ��
		 */
		Pr02 pr02 = new Pr02(7, 20, 2);
		pr02.print();
		
		/**
		 * switch case ����
		 * 1,2,3 default �޽��� ���
		 */
		Pr03 pr03 = new Pr03(2);
		pr03.print();
		
		/** TODO Question
		 * Map�� Call By Reference ����
		 * for�� ����
		 * ���󰡰ݰ� ���ϰ���
		 */
		/*Question01 question01 = new Question01();
		question01.print();*/
		
		/**
		 * for�� ����1
		 * ������ ���� ������ ���
		 */
		Pr04 pr04 = new Pr04(4);
		pr04.print();
				
		/**
		 * for�� ����2
		 * �� �����ؼ� ���ϱ�
		 */
		Pr05 pr05 = new Pr05(10);
		pr05.print();
		
		/**
		 * for�� ����3
		 * �迭 ������
		 */
		Pr06 pr06 = new Pr06();
		pr06.print();
		
		/**
		 * �迭�� ���۷��� ��
		 * arr1 == arr2
		 */
		Array01 array01 = new Array01();
		array01.print();
		
		/**
		 * StringBuilder�� �̿��� ���ڿ� ��ġ��
		 */
		Collect01 collect01 = new Collect01();
		collect01.print();
		
		/**
		 * List�� �޼ҵ� ���
		 * remove, sublist ���
		 */
		Collect02 collect02 = new Collect02();
		collect02.print();
		
		/**
		 * LinkedList, Vector ���
		 * add���� �� ���
		 */
		Collect03 collect03 = new Collect03();
		collect03.print();
		
		/**
		 * HashSet, TreeSet, LinkedHashSet ���
		 * add �� �� ���
		 */
		Collect04 collect04 = new Collect04();
		collect04.print();
		
		/**
		 * HahsMap ���
		 * put �� �� ���
		 */
		Collect05 collect05 = new Collect05();
		collect05.print();
		
		/**
		 * for�� Iterator�� Enhanced Loop
		 * list ��ȸ ���
		 */
		Collect06 collect06 = new Collect06();
		collect06.print();	
		
		/**
		 * for�� Map������ keyset 
		 * Map ���		
		 */		
		Collect07 collect07 = new Collect07();
		collect07.print();
		
		/**
		 * Stack ����
		 * ���Լ���
		 */
		Collect08 collect08 = new Collect08();
		collect08.print();
		
		/**
		 * Queue ����
		 * ���Լ���
		 */
		Collect09 Collect09 = new Collect09();
		Collect09.print();
		
		/**
		 * ����ó�� 01
		 * 
		 */
		Exception01 exception01 = new Exception01();
		exception01.print();
		
		/**
		 * ���ܹ߻� ���Ѻ���
		 */
		Exception02 exception02 = new Exception02();
		
		try {
			
			exception02.print();
			
		} catch (UserException e) {
			
			System.out.println(e.getMessage());
		}
		
		/**
		 * ����ó�� 03
		 * Null ���� �ڵ�
		 */		
		Exception03 exception03 = new Exception03();
		try {
			
			exception03.print();
			
		} catch (Exception e) {
			
			System.out.println("ERRORERRORERRORERRORERRORERROR");			
		}
		
		
		/**
		 * ��Ӱ� �������̵�  �����ε�
		 */
		BBB bBB = new BBB();
		bBB.setij(10, 5);
		bBB.print();
		bBB.print(18);
		
		/**
		 * ��ü�� ����ȯ �� �������̵�
		 */
		Am r = new Am();
		r.print();		
		
		r = new Bm();
		r.print();
		
		r= new Cm();
		r.print();
		
		/**
		 * ��ü����ȯ�� ����Ŭ���� ��ü������ ����Ŭ���� ������ ������
		 */
		Child child = new Child();
		System.out.println(child.i);
		System.out.println(child.pa);
		child.parentPrint();
		child.childPrint();
		child.print();
		
		Parent child2 = new Child();
		System.out.println(child2.i);
		System.out.println(child2.pa);
		child2.parentPrint();
		child.childPrint();
		child2.print();
		
		Parent parent = new Parent();
		System.out.println(parent.i);
		System.out.println(parent.pa);
		parent.print();
		
		/*Child child3 = (Child) parent;
		child3.childPrint();
		System.out.println(child3.i);
		child3.print();*/
		
		/**
		 * �߻�Ŭ������ �߻�޼ҵ� ���
		 */
		Circle circle = new Circle();
		circle.draw();
		circle.computerArea(5.0, 5.0);
		
		Shape s = new Circle();
		Shape c = new main.java.kr.sangj.abstaraction.abstract01.Rectangle();
		s.draw();
		c.draw();
		
		/**
		 * �������̽� ���
		 */
		/*Hello hello = new Hello();*/
		Ihello hello = new Hello();
		hello.sayHello("�̻���");
		
		/**
		 * ĸ��ȭ ����
		 */
		Capsule01 capsule01 = new Capsule01("�̻���", "23", "����");
		System.out.println(capsule01.toString());
		capsule01.print();	
		
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
		/*Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
				
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("��");
		
			try {
				
				Thread.sleep(500);
				
			} catch (InterruptedException e) {

				System.out.println("������ ����");
			}
		}	*/	
		
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
		thread003.start();
		
		*//**
		 * ������ 4
		 * ������ü�� wait notify
		 *//*
		
		WorkObject workObject = new WorkObject();
		
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
		
		System.out.println(threadI.getPriority());
		System.out.println(threadJ.getPriority());
		
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
		
		threadI.work = true;*/
	}		
}
