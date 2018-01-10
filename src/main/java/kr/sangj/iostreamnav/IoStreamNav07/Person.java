package main.java.kr.sangj.iostreamnav.IoStreamNav07;

import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable {

	public int age;
	public transient String name;
	public int[] arr;
		
	Person(int age, String name, int[] arr) {
	
		this.age = age;
		this.name = name;
		this.arr = arr;
	}
	
	public int getAge() {
		return age;
	}	
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", arr=" + Arrays.toString(arr) + "]";
	}
	
}
