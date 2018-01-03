package kr.sangj.abstaraction.abstract01;

public class Circle extends Shape {

	@Override
	public void draw() {
		
		System.out.println("원을 그리는 기능");
	}
	
	@Override
	public void computerArea(double a, double b) {

		System.out.println("원의 넓이 : " + (3.14 * a * b));		
	}
}
