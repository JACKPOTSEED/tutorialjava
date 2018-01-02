package kr.sangj.exception;

import java.awt.Transparency;

public class Exception01 {
		
	public int add(int a,int b) throws Exception {
		
		int rs = a + b;
		
		if (rs < 0) {
			
			throw new Exception("0보다 작음@@@@@@@@@");
		}
		
		return b;		
	}
	
	public void print() {
				
		try {
			
			add(-5,3);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}		
	}	
}
