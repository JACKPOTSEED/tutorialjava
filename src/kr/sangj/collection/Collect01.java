package kr.sangj.collection;

import java.util.ArrayList;

public class Collect01 {

	ArrayList<String> list = new ArrayList<String>();
	StringBuilder sb = new StringBuilder();
	
	public void strJoin() {
		
		list.add("포도");
		list.add("복숭아");
		list.add("딸기");
		
		int num = list.size();
		
		for (int i = 0; i < num; i++) {
			
			sb.append(list.get(i));
		}
	}
	
	public void print() {

		strJoin();
			
		System.out.println("Stringbuilder를 이용한 문자열 합치기");
		System.out.println(sb.toString());	
	}		
}
