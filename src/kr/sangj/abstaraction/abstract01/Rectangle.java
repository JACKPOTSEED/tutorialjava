package kr.sangj.abstaraction.abstract01;

public class Rectangle extends Shape {

	@Override
	public void draw() {

		System.out.println("�簢���� �׸��� ���");
	}

	@Override
	public void computerArea(double a, double b) {

		System.out.println("�簢���� ���� : " + (a * b));
	}
}
