package kr.sangj.polymorphism.poly01;

public class AAA {

	int i;
	int j;
	
	public void setij(int x,int y) {
		i = x;
		j = y;	
	}
	
	public void print() {
		
		System.out.println("상위클래스에서의 print");
	}
	
	public void print(int a) {
		
		System.out.println("상위클래스에서의 오버로딩" + a + "print");
	}
}
