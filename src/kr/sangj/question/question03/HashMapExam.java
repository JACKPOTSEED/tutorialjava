package kr.sangj.question.question03;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExam {

	HashMap<String, Student> map = new HashMap<String,Student>();
	
	public void studentAdd() {
		
		map.put("lee", new Student("201485021","leesj"));
		map.put("kim", new Student("201485022","leesj"));	
		map.put("park", new Student("201485023","leesj"));	
		map.put("jeong", new Student("201485024","leesj"));	
	}
	
	public void print() {
		
		System.out.println("#################");
		
		studentAdd();
		
		Student stu = map.get("lee");
		
		System.out.println("str : " + stu.print());
		
		System.out.println("Student Map : " + map.get("lee"));
		
		/*for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();) {
			String str = (String) iterator.next();
			
			System.out.println("key : " + str);									
			System.out.println("value : " + map.get(str));				
		}*/				
	}
}
