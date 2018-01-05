package main.java.kr.sangj.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Collect05 {

	HashMap<String,Object> hashMap = new HashMap<String,Object>();
	
	public void hashMapInit() {
		
		hashMap.put("이상정", 23);
		hashMap.put("신선호", 24);
		hashMap.put("우가인", 20);		
	}
	
	public void print() {
		
		hashMapInit();
		System.out.println("hashMap 테스트");
		System.out.println(hashMap);
	}
}