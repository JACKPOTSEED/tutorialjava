package main.java.kr.sangj.function;

public class Pr01 {

	public int x,y = 0;
	
	public Pr01(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
	public String quarterInit() {
		
		if (x > 0 && y > 0) {
			
			return "1��и�";
		} else if(x < 0 && y > 0){
			
			return "2��и�";
		} else if(x < 0 && y < 0) {
			
			return "3��и�";
		} else if(x > 0 && y < 0) {
			
			return "4��и�";
		} else {
			
			return "��и��� �߽�";
		}		
	}
	
	public void print() {
		
		System.out.println("��ǥ �ʱ�ȭ : " + "x=" + x + ",y=" + y);
		
		System.out.println(quarterInit());
	}
}
