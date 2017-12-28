package kr.sangj.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collect04 {

	//Set �������̽� �� contatins �޼ҵ����غ���
	//is empty
	//linkedlist arraylist vector ����
	//LinkedhashMap TreeMap HashMap ����
	
	public void print() {
	
		Set set = new HashSet<String>();
		
		set.add("����");
		set.add("����");
		set.add("�ٳ���");
		set.add("���");
		
		System.out.println("set : " + set);
	}
	
	public void print2() {
		
		Set treeSet = new TreeSet<String>();
		
		treeSet.add("����");
		treeSet.add("����");
		treeSet.add("�ٳ���");
		treeSet.add("���");
		treeSet.add("����");
		treeSet.add("���");
		
		System.out.println("treeSet : " + treeSet);
	}
	
	public void print3() {
		
		Set linkSet= new LinkedHashSet<String>();
		
		linkSet.add("����");
		linkSet.add("����");
		linkSet.add("�ٳ���");
		linkSet.add("���");
		linkSet.add("����");
		linkSet.add("���");
		
		System.out.println("linkSet : " + linkSet);
	}
}
