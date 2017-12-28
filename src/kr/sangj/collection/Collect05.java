package kr.sangj.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Collect05<T> implements Comparable<T> {

	public static void main(String args[]) {
		
		Collect05 collect05 = new Collect05();
		
		collect05.print();
	}
	public void print() {
		
		Map testMap = new TreeMap<String,Object>();
				
		testMap.put("노트북", 1);
		testMap.put("모니터", 2);
		testMap.put("마우스", 3);
		
		System.out.println("testMap : " + testMap);
	}
	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
}
