package kr.sangj.polymorphism.poly01;

public class AAA {

	int i;
	int j;
	
	public void setij(int x,int y) {
		i = x;
		j = y;	
	}
	
	public void print() {
		
		System.out.println("����Ŭ���������� print");
	}
	
	public void print(int a) {
		
		System.out.println("����Ŭ���������� �����ε�" + a + "print");
	}
}
