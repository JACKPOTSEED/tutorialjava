package kr.sangj.example;

public class Pr04 {
	
	public int d = 0;
	
	public Pr04(int d) {
		
		this.d = d;
	}
	
	public void print() {
		
		System.out.println("Á¤¼ö Á¦°ö ¼¼Á¦°ö");
		
		for (int i = 1; i <= d; i++) {
			
			System.out.println(i + "\t" + (i*i) + "\t" + (i*i*i));
		}
	}
}
