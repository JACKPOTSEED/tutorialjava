package main.java.kr.sangj.abstaraction.abstract02;

public class Hello implements Ihello {

	@Override
	public void sayHello(String name) {

		System.out.println("인터페이스 사용예제");
		System.out.println(name + "씨 안녕하세요!");
	}	
}
