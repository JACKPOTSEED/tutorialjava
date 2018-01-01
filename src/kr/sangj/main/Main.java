package kr.sangj.main;

import java.awt.Toolkit;
import java.util.HashMap;
import java.util.Map;

import kr.sangj.abstaraction.abstract01.Circle;
import kr.sangj.abstaraction.abstract01.Shape;
import kr.sangj.abstaraction.abstract02.Hello;
import kr.sangj.abstaraction.abstract02.Ihello;
import kr.sangj.array.Array01;
import kr.sangj.capsulation.Capsule01;
import kr.sangj.collection.Collect01;
import kr.sangj.collection.Collect02;
import kr.sangj.collection.Collect03;
import kr.sangj.collection.Collect04;
import kr.sangj.collection.Collect05;
import kr.sangj.collection.Collect06;
import kr.sangj.collection.Collect07;
import kr.sangj.example.Pr01;
import kr.sangj.example.Pr02;
import kr.sangj.example.Pr03;
import kr.sangj.example.Pr04;
import kr.sangj.example.Pr05;
import kr.sangj.example.Pr06;
import kr.sangj.exception.Exception01;
import kr.sangj.exception.Exception02;
import kr.sangj.exception.Exception03;
import kr.sangj.exception.UserException;
import kr.sangj.polymorphism.poly01.BBB;
import kr.sangj.polymorphism.poly02.Am;
import kr.sangj.polymorphism.poly02.Bm;
import kr.sangj.polymorphism.poly02.Cm;
import kr.sangj.question.Question01;
import kr.sangj.thread.threadTest01.RunnableTest;
import kr.sangj.thread.threadTest01.Thread01;
import kr.sangj.thread.threadTest02.BeepTask;


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
		 * �߻�Ŭ������ �߻�޼ҵ� ���
		 */
		Circle circle = new Circle();
		circle.draw();
		circle.computerArea(5.0, 5.0);
		
		Shape s = new Circle();
		s.draw();
		
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
		 */
		RunnableTest runnableTest = new RunnableTest();
		Thread t= new Thread(runnableTest);
		
		Thread01 thread01 = new Thread01();
		
		t.start();			
		thread01.start();
		
		/**
		 * ������ ���� 2.0
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
		}*/		
	}		
}
