package kr.sangj.example;

public class Pr02 {

	public int a,b,c;
	
	public Pr02(int a, int b, int c) {
		
		this.a = a;
		this.b = b;
		this.c = c;	
	}
	
	public int minVal() {
	
		int min = 0;
		
		if (a < b) {
			
			min = a;
		} else {

			min = b;
		} 
		
		if(c < min){
			
			min = c;
		}
		
		return min;
	}
	
	public void print() {
		
		System.out.println("�� ���� ���� �߿��� ���� ���� �� : " + "a=" +a +",b=" + b + ",c=" + c);
		System.out.println(minVal());		
	}
}
