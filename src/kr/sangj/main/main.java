package kr.sangj.main;

import java.util.HashMap;
import java.util.Map;

import kr.sangj.example.Pr01;
import kr.sangj.example.Pr02;
import kr.sangj.example.Pr03;
import kr.sangj.example.Pr04;
import kr.sangj.example.Pr05;
import kr.sangj.question.Question01;

/**
 * @author sangj
 * @since  2017.12.28
 */
public class Main {

	public static void main(String[] args) {

		/**
		 * &&연산자 예제
		 * 4사분면찍어보기
		 */
		Pr01 pr01 = new Pr01(1,3);
		pr01.print();
		
		/**
		 * if else 예제
		 * 세개의 정수중 작은 수
		 */
		Pr02 pr02 = new Pr02(7, 20, 2);
		pr02.print();
		
		/**
		 * switch case 예제
		 * 1,2,3 default 메시지 출력
		 */
		Pr03 pr03 = new Pr03(2);
		pr03.print();
		
		/** TODO Question
		 * Map의 Call By Reference 문제
		 * for문 에제
		 * 정상가격과 세일가격
		 */
		/*Question01 question01 = new Question01();
		question01.print();*/
		
		/**
		 * for문 예제1
		 * 정수값 제곱 세제곱 출력
		 */
		Pr04 pr04 = new Pr04(4);
		pr04.print();
		
		/**
		 * for문 에제2
		 * 값 누적해서 더하기
		 */
		Pr05 pr05 = new Pr05(10);
		pr05.print();
	}	
}
