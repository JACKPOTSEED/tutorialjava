package kr.sangj.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collect04 {

	//Set 인터페이스 의 contatins 메소드사용해보기
	//is empty
	//linkedlist arraylist vector 차이
	//LinkedhashMap TreeMap HashMap 차이
	
	public void print() {
	
		Set set = new HashSet<String>();
		
		set.add("딸기");
		set.add("곶감");
		set.add("바나나");
		set.add("용과");
		
		System.out.println("set : " + set);
	}
	
	public void print2() {
		
		Set treeSet = new TreeSet<String>();
		
		treeSet.add("딸기");
		treeSet.add("곶감");
		treeSet.add("바나나");
		treeSet.add("용과");
		treeSet.add("가과");
		treeSet.add("흐과");
		
		System.out.println("treeSet : " + treeSet);
	}
	
	public void print3() {
		
		Set linkSet= new LinkedHashSet<String>();
		
		linkSet.add("딸기");
		linkSet.add("곶감");
		linkSet.add("바나나");
		linkSet.add("용과");
		linkSet.add("가과");
		linkSet.add("흐과");
		
		System.out.println("linkSet : " + linkSet);
	}
}
