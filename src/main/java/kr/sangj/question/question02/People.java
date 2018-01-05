package main.java.kr.sangj.question.question02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People {

	List<Person> people = new ArrayList<>();
	
	public void peopleAdd() {
		
		people.add(new Person("lee"));
		people.add(new Person("kim"));
		people.add(new Person("park"));
		people.add(new Person("lee"));
	}
	
	public void print() {
		
		peopleAdd();		
		System.out.println(people);
		
		/*for (Iterator iterator = people.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator.next();
			
			System.out.println("people : " + person);
		}*/
	}
}
