package main.java.kr.sangj.exception;

public class Exception03 {
	
	public Byte ref_b;
	
	public void print() throws NullPointerException{
		
		/*wrapperŬ������ �ڵ����� new�� ���ش�. 
		ref_b = 10;
		ref_b = new Byte((byte) 10);*/
		
		/*ref_b = 11;*/
		
		/*�����߻�*/
		/*System.out.println(ref_b);
		System.out.println(ref_b.toString());*/

		/*�����ذ� 1*/
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(ref_b == null ? "0" : ref_b.toString());
		
		/*�����ذ� 2
		if (ref_b == null) {
			
			System.out.println("nulló��");
		} else {
			
			ref_b.toString()
		}*/	
	}
}
