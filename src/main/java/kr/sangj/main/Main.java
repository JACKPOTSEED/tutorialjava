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
		 * &&연산자 예제
		 * 4사분면찍어보기
		 */
		Pr01 pr01 = new Pr01(1,3);
		pr01.print();
		
		/**
		 * if else 예제
		 * 세개의 정수중 작은 수
		 */
		Pr02 pr02 = new Pr02(7, 20, 2);
		pr02.print();
		
		/**
		 * switch case 예제
		 * 1,2,3 default 메시지 출력
		 */
		Pr03 pr03 = new Pr03(2);
		pr03.print();
		
		/** TODO Question
		 * Map의 Call By Reference 문제
		 * for문 에제
		 * 정상가격과 세일가격
		 */
		/*Question01 question01 = new Question01();
		question01.print();*/
		
		/**
		 * for문 예제1
		 * 정수값 제곱 세제곱 출력
		 */
		Pr04 pr04 = new Pr04(4);
		pr04.print();
				
		/**
		 * for문 에제2
		 * 값 누적해서 더하기
		 */
		Pr05 pr05 = new Pr05(10);
		pr05.print();
		
		/**
		 * for문 예제3
		 * 배열 돌리기
		 */
		Pr06 pr06 = new Pr06();
		pr06.print();
		
		/**
		 * 배열의 레퍼런스 비교
		 * arr1 == arr2
		 */
		Array01 array01 = new Array01();
		array01.print();
		
		/**
		 * StringBuilder를 이용한 문자열 합치기
		 */
		Collect01 collect01 = new Collect01();
		collect01.print();
		
		/**
		 * List의 메소드 사용
		 * remove, sublist 사용
		 */
		Collect02 collect02 = new Collect02();
		collect02.print();
		
		/**
		 * LinkedList, Vector 사용
		 * add한후 값 출력
		 */
		Collect03 collect03 = new Collect03();
		collect03.print();
		
		/**
		 * HashSet, TreeSet, LinkedHashSet 사용
		 * add 후 값 출력
		 */
		Collect04 collect04 = new Collect04();
		collect04.print();
		
		/**
		 * HahsMap 사용
		 * put 후 값 출력
		 */
		Collect05 collect05 = new Collect05();
		collect05.print();
		
		/**
		 * for문 Iterator문 Enhanced Loop
		 * list 순회 출력
		 */
		Collect06 collect06 = new Collect06();
		collect06.print();	
		
		/**
		 * for문 Map에서의 keyset 
		 * Map 출력		
		 */		
		Collect07 collect07 = new Collect07();
		collect07.print();
		
		/**
		 * Stack 예제
		 * 후입선출
		 */
		Collect08 collect08 = new Collect08();
		collect08.print();
		
		/**
		 * Queue 예제
		 * 선입선출
		 */
		Collect09 Collect09 = new Collect09();
		Collect09.print();
		
		/**
		 * 예외처리 01
		 * 
		 */
		Exception01 exception01 = new Exception01();
		exception01.print();
		
		/**
		 * 예외발생 시켜보기
		 */
		Exception02 exception02 = new Exception02();
		
		try {
			
			exception02.print();
			
		} catch (UserException e) {
			
			System.out.println(e.getMessage());
		}
		
		/**
		 * 예외처리 03
		 * Null 방지 코드
		 */		
		Exception03 exception03 = new Exception03();
		try {
			
			exception03.print();
			
		} catch (Exception e) {
			
			System.out.println("ERRORERRORERRORERRORERRORERROR");			
		}
		
		
		/**
		 * 상속과 오버라이딩  오버로딩
		 */
		BBB bBB = new BBB();
		bBB.setij(10, 5);
		bBB.print();
		bBB.print(18);
		
		/**
		 * 객체의 형변환 과 오버라이딩
		 */
		Am r = new Am();
		r.print();		
		
		r = new Bm();
		r.print();
		
		r= new Cm();
		r.print();
		
		/**
		 * 객체형변환과 상위클래스 객체변수에 하위클래스 참조시 스코프
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
		 * 추상클래스와 추상메소드 사용
		 */
		Circle circle = new Circle();
		circle.draw();
		circle.computerArea(5.0, 5.0);
		
		Shape s = new Circle();
		Shape c = new main.java.kr.sangj.abstaraction.abstract01.Rectangle();
		s.draw();
		c.draw();
		
		/**
		 * 인터페이스 사용
		 */
		/*Hello hello = new Hello();*/
		Ihello hello = new Hello();
		hello.sayHello("이상정");
		
		/**
		 * 캡슐화 예제
		 */
		Capsule01 capsule01 = new Capsule01("이상정", "23", "남자");
		System.out.println(capsule01.toString());
		capsule01.print();	
		
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
		/*Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
				
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("띵");
		
			try {
				
				Thread.sleep(500);
				
			} catch (InterruptedException e) {

				System.out.println("쓰레드 에러");
			}
		}	*/	
		
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
		thread003.start();
		
		*//**
		 * 쓰레드 4
		 * 공유객체와 wait notify
		 *//*
		
		WorkObject workObject = new WorkObject();
		
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
