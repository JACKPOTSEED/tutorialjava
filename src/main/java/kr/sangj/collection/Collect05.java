package main.java.kr.sangj.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Collect05 {

	HashMap<String,Object> hashMap = new HashMap<String,Object>();
	
	public void hashMapInit() {
		
		hashMap.put("�̻���", 23);
		hashMap.put("�ż�ȣ", 24);
		hashMap.put("�찡��", 20);		
	}
	
	public void print() {
		
		hashMapInit();
		System.out.println("hashMap �׽�Ʈ");
		System.out.println(hashMap);
	}
}