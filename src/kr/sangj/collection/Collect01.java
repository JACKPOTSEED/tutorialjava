package kr.sangj.collection;

import java.util.ArrayList;

public class Collect01 {
	
	/**
	 * �����̸��� ArrayList�� �־ ��ġ��
	 */
	public void print() {
			
		ArrayList<String> list = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		
		list.add("����");
		list.add("������");
		list.add("����");
		
		int num = list.size();
		
		for (int i = 0; i < num; i++) {
			
			sb.append(list.get(i));
		}
		
		System.out.println(sb.toString());
		
	}	
}
