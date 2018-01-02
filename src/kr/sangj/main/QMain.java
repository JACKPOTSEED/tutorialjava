package kr.sangj.main;

import kr.sangj.question.Question01;
import kr.sangj.question.Question04;
import kr.sangj.question.question02.People;
import kr.sangj.question.question03.HashMapExam;

public class QMain {

	public static void main(String[] args) {
		
		/**
		 * ArrayList에 Map을 추가하는 예제
		 * for문을 통해 같은 map에 Key값이 같은  정보를 리스트에 추가할때 주소를 저장하기때문에 오류가 날 수 있다. 
		 */
		Question01 question01 = new Question01();
		
		question01.print();
		
		/**
		 * 컬렉션프레임워크의 toString메소드 오버라이딩 출력 예제 01
		 */
		People people = new People();
		
		people.print();
		
		/**
		 * 컬렉션프레임워크의 toString메소드 오버라이딩 출력 예제 02
		 * HashMap 의 Key값으로 들어간 객체
		 */
		HashMapExam HashMapExam = new HashMapExam();
		HashMapExam.print();
		
		Question04 question04 = new Question04();
		question04.mapInit();
		question04.listAdd();
		System.out.println(question04.toString());
		
		Integer i = 10;
		
	}
}
