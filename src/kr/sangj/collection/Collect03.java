package kr.sangj.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collect03 {

	public void print() {

		List list = new LinkedList<String>();

		list.add("����");
		list.add("����");
		list.add("û����");

		System.out.println(list);		

		Vector vc = new Vector();
		vc.add("����");
		vc.add("����");
		vc.add("�ٳ���");

		System.out.println(vc);
	}
}
