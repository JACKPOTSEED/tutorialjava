package kr.sangj.polymorphism.poly03;

public class Child extends Parent{

	public int i = 1;
	public int ch = 2;
	
	public void childPrint() {
		
		System.out.println("자식 고유메서드 호출");
	}
	
	public void print() {
		
		System.out.println("자식 메서드 호출");
	}
}
