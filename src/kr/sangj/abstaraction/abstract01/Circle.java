package kr.sangj.abstaraction.abstract01;

public class Circle extends Shape {

	@Override
	public void draw() {
		
		System.out.println("���� �׸��� ���");
	}
	
	@Override
	public void computerArea(double a, double b) {

		System.out.println("���� ���� : " + (3.14 * a * b));		
	}
}
