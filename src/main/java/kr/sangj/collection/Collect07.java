package main.java.kr.sangj.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class Collect07 {

	HashMap<String, Integer> map = new HashMap<String,Integer>();

	public void mapInit() {
		
		map.put("�̻���", 23);
		map.put("�ż�ȣ", 24);
		map.put("�찡��", 20);	
	}
		
	public void print() {
		
		mapInit();
		
		System.out.println("map ��� ");
		
		for (String  str : map.keySet()) {
			
			Integer value = map.get(str);
			
			System.out.println("����� ��� : " + value);
		}	
	}
}

