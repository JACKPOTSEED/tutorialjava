package main.java.kr.sangj.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collect06 {
	
	ArrayList<String> list = new ArrayList<String>();
	
	public void listInit() {					
			
			list.add("포도");
			list.add("딸기");
			list.add("복숭아");
			list.add("바나나");
			
			/*System.out.println("indexOf test : " + list.indexOf("복숭아"));	*/		
		}
	
	@SuppressWarnings("rawtypes")
	public void print() {
		
		listInit();
		
		System.out.println("for문안에 iterator 사용");
		
		for (ListIterator iterator = list.listIterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			
			System.out.println("list 의 값 하나씩 출력 : " + string);
		}
	}
}
