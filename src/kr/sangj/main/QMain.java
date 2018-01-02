package kr.sangj.main;

import kr.sangj.question.Question01;
import kr.sangj.question.Question04;
import kr.sangj.question.question02.People;
import kr.sangj.question.question03.HashMapExam;

public class QMain {

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
		
	}
}
