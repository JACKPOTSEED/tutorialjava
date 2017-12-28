package kr.sangj.example;

public class Pr05 {

	public int n,sum = 0;
	
	public Pr05(int n) {
		
		this.n = n;
	}
	
	public int sum() {
		
		for (int i = 1; i <= n; i++) {
			
			sum = sum + i;			
		}
		
		return sum;
	}
	
	public void print() {
		
		System.out.println(sum());				
	}
}
