package kr.sangj.example;

public class Pr03 {

	int n = 0;
	
	public Pr03(int n) {
		
		this.n = n;
	}
	
	//case문에서 break를 쓰지않고 return을 사용함.
	public String switchTest() {
		
		switch (n) {
		case 1:
			return "1 리턴";
		case 2:
			return "2 리턴";
		case 3:
			return "3 리턴";	
		default:
			return "1,2,3 이 아닌 수";
		}
	}
	
	public void print() {
		
		String str = switchTest();
		
		System.out.println("스위치 초기화 : " + "n=" + n);
		System.out.println(str);
	}
}
