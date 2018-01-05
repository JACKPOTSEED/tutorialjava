package main.java.kr.sangj.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collect04 {

	//Set 인터페이스 의 contatins 메소드사용해보기
	//is empty
	//linkedlist arraylist vector 차이
	//LinkedhashMap TreeMap HashMap 차이
	Set<String> set = new HashSet<String>();	
	Set<String> treeSet = new TreeSet<String>();
	Set<String> linkSet= new LinkedHashSet<String>();
	
	public void hashSetInit() {
		
		set.add("딸기");
		set.add("곶감");
		set.add("바나나");
		set.add("용과");
	}
	
	public void treeSetInit() {
		
		treeSet.add("딸기");
		treeSet.add("곶감");
		treeSet.add("바나나");
		treeSet.add("용과");
		treeSet.add("가과");
		treeSet.add("흐과");
	}
	
	public void linkedHashSetInit() {
		
		linkSet.add("딸기");
		linkSet.add("곶감");
		linkSet.add("바나나");
		linkSet.add("용과");
		linkSet.add("가과");
		linkSet.add("흐과");
	}
	
	public void print() {
	
		hashSetInit();
		treeSetInit();
		linkedHashSetInit();
		
		System.out.println("set : " + set);
		System.out.println("treeSet : " + treeSet);
		System.out.println("linkSet : " + linkSet);
	}	
}
