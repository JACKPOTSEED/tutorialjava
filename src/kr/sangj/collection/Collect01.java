package kr.sangj.collection;

import java.util.ArrayList;

public class Collect01 {

	ArrayList<String> list = new ArrayList<String>();
	StringBuilder sb = new StringBuilder();
	
	public void strJoin() {
		
		list.add("����");
		list.add("������");
		list.add("����");
		
		int num = list.size();
		
		for (int i = 0; i < num; i++) {
			
			sb.append(list.get(i));
		}
	}
	
	public void print() {

		strJoin();
			
		System.out.println("Stringbuilder�� �̿��� ���ڿ� ��ġ��");
		System.out.println(sb.toString());	
	}		
}
