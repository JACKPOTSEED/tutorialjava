package kr.sangj.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collect03 {

	public void print() {

		List list = new LinkedList<String>();

		list.add("딸기");
		list.add("포도");
		list.add("청포도");

		System.out.println(list);		

		Vector vc = new Vector();
		vc.add("딸기");
		vc.add("포도");
		vc.add("바나나");

		System.out.println(vc);
	}
}
