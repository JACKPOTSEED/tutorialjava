package kr.sangj.question.Question05;

import java.util.ArrayList;
import java.util.Iterator;

import kr.sangj.question.question03.Student;

public class Question05 {
	
	ArrayList<Student> arrList = new ArrayList<Student>();

	public void listInit() {
		
		arrList.add(new Student("����","1"));
		arrList.add(new Student("����","2"));
		arrList.add(new Student("���","3"));
	}
	
	public void print() {
		
		listInit();
		
		//arrList.get(0) ����� ��ü�� �������� ����
		System.out.println(arrList.get(0).name);
		
		//toString �޼ҵ� �������̵� �� �̱� 1
		System.out.println(arrList.get(0));
		
		System.out.println("arrList : " + arrList);
		
		//for iterator������ �� �̱� 2
		for (Iterator iterator = arrList.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println("*****" + student.name + student.studentNO);
			
		}
	}
}
