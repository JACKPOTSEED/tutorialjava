package main.java.kr.sangj.function;

public class Pr01 {

	public int x,y = 0;
	
	public Pr01(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
	public String quarterInit() {
		
		if (x > 0 && y > 0) {
			
			return "1사분면";
		} else if(x < 0 && y > 0){
			
			return "2사분면";
		} else if(x < 0 && y < 0) {
			
			return "3사분면";
		} else if(x > 0 && y < 0) {
			
			return "4사분면";
		} else {
			
			return "사분면의 중심";
		}		
	}
	
	public void print() {
		
		System.out.println("좌표 초기화 : " + "x=" + x + ",y=" + y);
		
		System.out.println(quarterInit());
	}
}
