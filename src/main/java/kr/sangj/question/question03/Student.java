package main.java.kr.sangj.question.question03;

public class Student {

	public String name;
	public String studentNO;
	
	public Student(String name, String studentNO) {
		
		this.name 	   = name;
		this.studentNO = studentNO; 
	}
	
	public String print() {
		
		String str = toString();
		
		return str;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", studentNO=" + studentNO + "]";
	}
}
