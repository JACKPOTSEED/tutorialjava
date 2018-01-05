package main.java.kr.sangj.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collect04 {

	//Set �������̽� �� contatins �޼ҵ����غ���
	//is empty
	//linkedlist arraylist vector ����
	//LinkedhashMap TreeMap HashMap ����
	Set<String> set = new HashSet<String>();	
	Set<String> treeSet = new TreeSet<String>();
	Set<String> linkSet= new LinkedHashSet<String>();
	
	public void hashSetInit() {
		
		set.add("����");
		set.add("����");
		set.add("�ٳ���");
		set.add("���");
	}
	
	public void treeSetInit() {
		
		treeSet.add("����");
		treeSet.add("����");
		treeSet.add("�ٳ���");
		treeSet.add("���");
		treeSet.add("����");
		treeSet.add("���");
	}
	
	public void linkedHashSetInit() {
		
		linkSet.add("����");
		linkSet.add("����");
		linkSet.add("�ٳ���");
		linkSet.add("���");
		linkSet.add("����");
		linkSet.add("���");
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
