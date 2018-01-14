package main.java.kr.sangj.iostream.ioStream21;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;

public class PersonDaoMain {

	public static void main(String[] args) {

		PersonDao fileManager = null;
		
		try {
		
			fileManager = new PersonDao("C:/IoTest/Person/Person.dat");
			
			fileManager.saveRecord(new Person("�����",24,51.22,"010-9146-7529"));
			
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			
		} catch (Exception e) {

		}
		
		System.out.println("====== ��ϵ� ��� ģ�� ����Ʈ ======" + fileManager.getRecordCount() + " �� ======");
		
		try {
			
			ArrayList<Person> list = (ArrayList<Person>) fileManager.getRecord();
			
			for (Person person : list) {
				
				System.out.println(person);
			}
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
	}
}
