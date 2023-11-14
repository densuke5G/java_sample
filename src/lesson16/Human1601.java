package lesson16;

public class Human1601 {
	private String name;
	private int age;
	
	public void setProfile(String name) {
		this.name = name;
		System.out.println("名前" + this.name);
	}
	
	public void setProfile(int age) {
		this.age = age;
		System.out.println("年齢" + this.age);
		
	}
	public void setProfile(String name, int age) {
		this.name = name;
		this.age = age;
		
		System.out.println("名前" + this.name + "年齢" + this.age);
		
	}
	
}
