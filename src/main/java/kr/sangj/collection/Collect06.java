package main.java.kr.sangj.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collect06 {
	
	ArrayList<String> list = new ArrayList<String>();
	
	public void listInit() {					
			
			list.add("����");
			list.add("����");
			list.add("������");
			list.add("�ٳ���");
			
			/*System.out.println("indexOf test : " + list.indexOf("������"));	*/		
		}
	
	@SuppressWarnings("rawtypes")
	public void print() {
		
		listInit();
		
		System.out.println("for���ȿ� iterator ���");
		
		for (ListIterator iterator = list.listIterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			
			System.out.println("list �� �� �ϳ��� ��� : " + string);
		}
	}
}
