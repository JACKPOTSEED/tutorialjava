package main.java.kr.sangj.iostream.ioStream21;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public class PersonDao {

	private String filePath;
	private File file;
	
	private RandomAccessFile randomAccessFile;
	
	private int recordCount = 0;
	
	public static final int RECORD_LENGTH = 48;
	public static final int RECORD_COUNT_LENGTH = 4;
	public static final int NAME_LENGTH = 10;
	public static final int TELEPHONE_LENGTH = 26;	

	public PersonDao(String filepath) throws Exception {
		
		this.filePath = filepath;
		this.file     = new File(filepath);
		
		try {
		
			randomAccessFile = new RandomAccessFile(file, "rw");
			
			if (randomAccessFile.length() != 0) {
				
				recordCount = randomAccessFile.read();
				
			} else {

				System.out.println("처음으로 실행하여 파일에 등록된 친구 없음");
			}
			
		} catch (Exception e) {
		
			throw new Exception("파일 처리오류");
		}		
	}
	
	public RandomAccessFile getRandomAccessFile() {

		return randomAccessFile;
	}
	
	public int getRecordCount() {
		
		return recordCount;
	}
	
	public void saveRecord(Person person) {
		
		try {
			
			randomAccessFile.seek((recordCount * RECORD_LENGTH) + RECORD_COUNT_LENGTH);
			
			String name 	 = person.getName();
			int age 		 = person.getAge();
			double weight    = person.getWeight();
			String telephone = person.getTelephone();
			
			int charCount = name.length();
			charCount	  = name.length();
			
			for (int i = 0; i < NAME_LENGTH / 2; i++) {
				
				randomAccessFile.writeChar(i<charCount ? name.charAt(i) : ' ');				
			}
			
			randomAccessFile.writeInt(age);
			randomAccessFile.writeDouble(weight);
			
			for (int i = 0; i < TELEPHONE_LENGTH/2 ; i++) {
				
				randomAccessFile.writeChar(i<charCount ? telephone.charAt(i) : ' ');							
			}
			
			randomAccessFile.seek(0);
			randomAccessFile.writeInt(++recordCount);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	public List<Person> getRecord() throws IOException {
		
		ArrayList<Person> recordList = new ArrayList<Person>();
		
		for (int i = 0; i < recordCount; i++) {
			
			Person person = getRecord(i);
			recordList.add(person);
		}
		
		return recordList;
	}
	
	public Person getRecord(int i) throws IOException {
		
		Person person = null;
		String name = "";
		
		randomAccessFile.seek((i * RECORD_LENGTH) + RECORD_COUNT_LENGTH);
		
		for (int j = 0; j < (NAME_LENGTH/2); j++) {
			
			name += randomAccessFile.readChar();
		}
		
		name = name.trim();
		
		int age = 0;
		age = randomAccessFile.readInt();
		
		double weight = 0.0;
		weight = randomAccessFile.readDouble();
		
		String telephone = "";
		for (int j = 0; j < (TELEPHONE_LENGTH / 2); j++) {
			
			telephone += randomAccessFile.readChar();
		}
		
		telephone.trim();				
		
		person = new Person(name, age, weight, telephone);
		
		return person;
	}
	
	public void close() {
		
		if (randomAccessFile != null) {
			
			try {
				
				randomAccessFile.close();
				
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
	}
}