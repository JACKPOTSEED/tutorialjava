package main.java.kr.sangj.capsulation;

public class Capsule01 extends CapsuleVO {
	
	public Capsule01(String name,String age,String gender) {
		
		setName(name);
		setAge(age);
		setGender(gender);	
	}
	
	public void print() {
				
		System.out.println("�̸� : " + getName() + "���� : " + getAge() + "����" + getGender());
	}
}
