package main.java.kr.sangj.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Collect02 {

	List<String> list = new ArrayList<String>();
	
	public void listInit() {
		
		list.add("����");
		list.add("������");
		list.add("����");
		list.add("�ٳ���");
		list.add("��");	
	}
	
	public void print() {
		
		listInit();							
			
		System.out.println("list : " + list);
		list.remove(2);
		System.out.println("list : " + list);
		
		List<String> list2 = new ArrayList<String>();
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
