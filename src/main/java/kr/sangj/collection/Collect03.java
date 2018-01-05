package main.java.kr.sangj.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collect03 {
	
	List<String> list = new LinkedList<String>();
	Vector<String> vc = new Vector<String>();
		
	public void linkedListInit() {
		
		list.add("딸기");
		list.add("포도");
		list.add("청포도");
	}
	
	public void vectorInit() {
		
		vc.add("딸기");
		vc.add("포도");
		vc.add("바나나");
	}
	
	public void print() {

		/* 함수시간측정
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
