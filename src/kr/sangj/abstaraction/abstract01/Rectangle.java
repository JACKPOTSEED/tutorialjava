package kr.sangj.abstaraction.abstract01;

public class Rectangle extends Shape {

	@Override
	public void draw() {

		System.out.println("사각형을 그리는 기능");
	}

	@Override
	public void computerArea(double a, double b) {

		System.out.println("사각형의 넓이 : " + (a * b));
	}
}
