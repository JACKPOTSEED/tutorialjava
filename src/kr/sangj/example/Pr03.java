package kr.sangj.example;

public class Pr03 {

	int n = 0;
	
	public Pr03(int n) {
		
		this.n = n;
	}
	
	//case������ break�� �����ʰ� return�� �����.
	public String switchTest() {
		
		switch (n) {
		case 1:
			return "1 ����";
		case 2:
			return "2 ����";
		case 3:
			return "3 ����";	
		default:
			return "1,2,3 �� �ƴ� ��";
		}
	}
	
	public void print() {
		
		String str = switchTest();
		
		System.out.println("����ġ �ʱ�ȭ : " + "n=" + n);
		System.out.println(str);
	}
}
