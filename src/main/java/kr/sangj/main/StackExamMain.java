package main.java.kr.sangj.main;

import main.java.kr.sangj.stack.StackExam;
import main.java.kr.sangj.stack.StackTest;

public class StackExamMain {

	public static void main(String[] args) {

		try {
			
			StackTest stackTest = new StackTest();
			
			stackTest.print();
			
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("�����߻�");
		}			
	}
}
