package main.java.kr.sangj.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collect03 {
	
	List<String> list = new LinkedList<String>();
	Vector<String> vc = new Vector<String>();
		
	public void linkedListInit() {
		
		list.add("����");
		list.add("����");
		list.add("û����");
	}
	
	public void vectorInit() {
		
		vc.add("����");
		vc.add("����");
		vc.add("�ٳ���");
	}
	
	public void print() {

		/* �Լ��ð�����
		 * long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();		
		long lTime = endTime - startTime;		
		System.out.println("lTime : " + lTime + "ms");*/
		
		linkedListInit();			
		vectorInit();
		
		System.out.println(list);		
		System.out.println(vc);
	}
}
