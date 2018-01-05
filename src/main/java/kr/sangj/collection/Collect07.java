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
		
		map.put("이상정", 23);
		map.put("신선호", 24);
		map.put("우가인", 20);	
	}
		
	public void print() {
		
		mapInit();
		
		System.out.println("map 출력 ");
		
		for (String  str : map.keySet()) {
			
			Integer value = map.get(str);
			
			System.out.println("밸류값 출력 : " + value);
		}	
	}
}

