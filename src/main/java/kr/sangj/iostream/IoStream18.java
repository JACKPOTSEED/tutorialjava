package main.java.kr.sangj.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IoStream18 {

	public void printObject() throws IOException, ClassNotFoundException {
		
		//dat를 txt로 하면 안되는지 바로 해보기 -> 가능하다.
		FileOutputStream fs = new FileOutputStream("C:/IoTest/IoStream18.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fs);
		
		oos.writeObject(new Integer(10));
		oos.writeObject(new int[] {1,2,3});
		oos.writeObject(new String("홍길동"));
		
		oos.flush();
		oos.close();
		fs.close();	
		
		FileInputStream fis = new FileInputStream("C:/IoTest/IoStream18.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Integer obj1 = (Integer) ois.readObject(); 
		int []  obj2 = (int[]) ois.readObject();
		String  obj3 = (String) ois.readObject();
		
		ois.close();
		fis.close();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}	
}
