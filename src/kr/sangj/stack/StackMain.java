package kr.sangj.stack;

import kr.sangj.stack.StackExam;
import kr.sangj.stack.StackTest;

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
