package kr.sangj.main;

import java.util.HashMap;
import java.util.Map;

import kr.sangj.example.Pr01;
import kr.sangj.example.Pr02;
import kr.sangj.example.Pr03;
import kr.sangj.example.Pr04;
import kr.sangj.question.Question01;

/**
 * @author sangj
 * @since  2017.12.28
 */
public class main {

	public static void main(String[] args) {

		/**
		 * &&������ ����
		 * 4��и�����
		 */
		Pr01 pr01 = new Pr01(1,3);
		pr01.print();
		
		/**
		 * if else ����
		 * ������ ������ ���� ��
		 */
		Pr02 pr02 = new Pr02(7, 20, 2);
		pr02.print();
		
		/**
		 * switch case ����
		 * 1,2,3 default �޽��� ���
		 */
		Pr03 pr03 = new Pr03(2);
		pr03.print();
		
		/** TODO Question
		 * for�� ����
		 * ���󰡰ݰ� ���ϰ���
		 */
		/*Question01 question01 = new Question01();
		question01.print();*/
		
		Pr04 pr04 = new Pr04();
		pr04.print();
	}	
}
