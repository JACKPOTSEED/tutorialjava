package main.java.kr.sangj.polymorphism.poly01;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class BBB extends AAA {

	int total;
	
	public void sum() {
		
		total = i + j;
	}
	
	public void print() {
		
		System.out.println("하위클래스에서의 print");
	}
}
