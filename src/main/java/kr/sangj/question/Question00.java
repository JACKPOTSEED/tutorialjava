package main.java.kr.sangj.question;

public class Question00 {

	String str1 = "�̻���";
	String str2 = new String("�̻���");
	
	public void print() {
		
		// A. str1 �� str2�� ������� syso�� ������ ��ȣ�� ������
		// TODO ������ �켱���� �����ΰ� ���� �ٽ� �����غ���
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
	}
}
