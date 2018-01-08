package main.java.kr.sangj.main;

import main.java.kr.sangj.question.Question01;
import main.java.kr.sangj.question.Question04;
import main.java.kr.sangj.question.Question05.Question05;
import main.java.kr.sangj.question.question02.People;
import main.java.kr.sangj.question.question03.HashMapExam;

public class QuestionMain {

	public static void main(String[] args) {
		
		/**
		 * ArrayList�� Map�� �߰��ϴ� ����
		 * for���� ���� ���� map�� Key���� ����  ������ ����Ʈ�� �߰��Ҷ� �ּҸ� �����ϱ⶧���� ������ �� �� �ִ�. 
		 */
		Question01 question01 = new Question01();
		
		question01.print();
		
		/**
		 * �÷��������ӿ�ũ�� toString�޼ҵ� �������̵� ��� ���� 01
		 */
		People people = new People();
		
		people.print();
		
		/**
		 * �÷��������ӿ�ũ�� toString�޼ҵ� �������̵� ��� ���� 02
		 * HashMap �� Key������ �� ��ü
		 */
		HashMapExam HashMapExam = new HashMapExam();
		HashMapExam.print();
		
		Question04 question04 = new Question04();
		question04.mapInit();
		question04.listAdd();
		System.out.println(question04.toString());
		
		Integer i = 10;
		
		/**
		 * ArrayList ��ü �ڷ��� �־��
		 */
		Question05 question05 = new Question05();
		question05.print();
	}
}
