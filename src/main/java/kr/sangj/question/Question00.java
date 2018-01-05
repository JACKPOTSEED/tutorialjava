package main.java.kr.sangj.question;

public class Question00 {

	String str1 = "이상정";
	String str2 = new String("이상정");
	
	public void print() {
		
		// A. str1 과 str2의 결과값을 syso로 찍을때 괄호를 써줬음
		// TODO 연산자 우선순위 때문인것 같음 다시 생각해볼것
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
	}
}
