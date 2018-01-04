package kr.sangj.question.Question05;

import java.util.ArrayList;
import java.util.Iterator;

import kr.sangj.question.question03.Student;

public class Question05 {
	
	ArrayList<Student> arrList = new ArrayList<Student>();

	public void listInit() {
		
		arrList.add(new Student("도둑","1"));
		arrList.add(new Student("경찰","2"));
		arrList.add(new Student("어부","3"));
	}
	
	public void print() {
		
		listInit();
		
		//arrList.get(0) 실행시 객체의 참조값이 전달
		System.out.println(arrList.get(0).name);
		
		//toString 메소드 오버라이딩 값 뽑기 1
		System.out.println(arrList.get(0));
		
		System.out.println("arrList : " + arrList);
		
		//for iterator돌려서 값 뽑기 2
		for (Iterator iterator = arrList.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println("*****" + student.name + student.studentNO);
			
		}
	}
}
