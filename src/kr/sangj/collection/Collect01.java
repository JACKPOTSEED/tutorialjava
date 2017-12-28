package kr.sangj.collection;

import java.util.ArrayList;

public class Collect01 {
	
	/**
	 * 과일이름을 ArrayList에 넣어서 합치기
	 */
	public void print() {
			
		ArrayList<String> list = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		
		list.add("포도");
		list.add("복숭아");
		list.add("딸기");
		
		int num = list.size();
		
		for (int i = 0; i < num; i++) {
			
			sb.append(list.get(i));
		}
		
		System.out.println(sb.toString());
		
	}	
}
