package main.java.kr.sangj.iostreamnav.IoStreamNav07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.SynchronousQueue;

public class IoStreamNav07 {
	
	Person person = new Person(23, "lee", new int[] {1,2,3}) ;
	
	public void print() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		System.out.println(person.age + person.name + person.arr[0] + person.arr[1] + person.arr[2]);				
		System.out.println("person.toString() : " + person.toString());
					
		System.out.println("==============================================");
		System.out.println("stream 을 통한 객체 입출력");
		System.out.println("==============================================");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/IoTest/IoStreamNav07.dat"));		
		oos.writeObject(person);		
		oos.flush();
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/IoTest/IoStreamNav07.dat"));		
		Person p = (Person) ois.readObject();						
		ois.close();
		
		System.out.println(p.age + p.name + p.arr[0] + p.arr[1] + p.arr[2]);	
		System.out.println("p.toString() : " + p.toString());
	}		
}
