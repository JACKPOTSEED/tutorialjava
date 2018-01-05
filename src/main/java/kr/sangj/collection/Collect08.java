package main.java.kr.sangj.collection;

import java.util.Stack;

public class Collect08 {

	Stack<String> stack = new Stack<String>();
	
	public void stackInit() {
		
		stack.push("기린");
		stack.push("나비");
		stack.push("동물");
	}
	
	public void print() {
		
		stackInit();
		
		while(!stack.isEmpty()) {
			
			String str = stack.pop();
			
			System.out.println("str : " + str);
		}
	}
}
