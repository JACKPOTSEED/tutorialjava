package main.java.kr.sangj.iostream.IoStream17;

public class Friend {
	
	private String name;	
	private int age;
	private double weight;
	private String telephone;
	
	public Friend() {
		
		this(null,0,0,null);
	}
	
	public Friend(String name, int age, double weight, String telephone) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.telephone = telephone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	@Override
	public String toString() {
		return "Friend [name=" + name + ", age=" + age + ", weight=" + weight + ", telephone=" + telephone + "]";
	}
}
