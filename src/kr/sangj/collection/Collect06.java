package kr.sangj.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collect06 {
	
	ArrayList<String> list = new ArrayList<String>();
	
	public void listInit() {					
			
			list.add("����");
			list.add("����");
			list.add("������");
			list.add("�ٳ���");
			
			/*System.out.println("indexOf test : " + list.indexOf("������"));	*/		
		}
	
	public void print() {
		
		listInit();
		
		System.out.println("for���ȿ� iterator ���");
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			
			System.out.println("list �� �� �ϳ��� ��� : " + string);
		}
	}
}