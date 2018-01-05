package main.java.kr.sangj.stack;

import main.java.kr.sangj.stack.StackExam;
import main.java.kr.sangj.stack.StackTest;

public class StackMain {

	public static void main(String[] args) {

		try {
			
			StackTest stackTest = new StackTest();
			
			stackTest.print();
			
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("오류발생");
		}			
	}
}
