package kr.sangj.main;

import kr.sangj.stack.StackExam;
import kr.sangj.stack.StackTest;

public class MainExam {

	public static void main(String[] args) {

		try {
			
			StackTest stackTest = new StackTest();
			
			stackTest.print();
			
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("오류발생");
		}			
	}
}
