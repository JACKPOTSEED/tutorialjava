package kr.sangj.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Collect02 {

	public void print() {
		
		List list = new ArrayList<String>();
					
		list.add("����");
		list.add("������");
		list.add("����");
		list.add("�ٳ���");
		list.add("��");		
			
		System.out.println("list : " + list);
		list.remove(2);
		System.out.println("list : " + list);
		
		List list2 = new ArrayList<String>();
		list2 = list.subList(0,3);
		System.out.println("list2 : " + list2);
		
		System.out.println("=======================");		
		
		Iterator<String> itr = list.iterator();
		
		while (itr.hasNext()) {
			
			String str = itr.next();
			System.out.println("str : " + str);
		}
	}
}
