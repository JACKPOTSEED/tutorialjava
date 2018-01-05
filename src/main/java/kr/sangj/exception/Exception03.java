package main.java.kr.sangj.exception;

public class Exception03 {
	
	public Byte ref_b;
	
	public void print() throws NullPointerException{
		
		/*wrapper클래스는 자동으로 new를 해준다. 
		ref_b = 10;
		ref_b = new Byte((byte) 10);*/
		
		/*ref_b = 11;*/
		
		/*에러발생*/
		/*System.out.println(ref_b);
		System.out.println(ref_b.toString());*/

		/*에러해결 1*/
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(ref_b == null ? "0" : ref_b.toString());
		
		/*에러해결 2
		if (ref_b == null) {
			
			System.out.println("null처리");
		} else {
			
			ref_b.toString()
		}*/	
	}
}
