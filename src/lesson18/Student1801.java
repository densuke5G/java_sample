package lesson18;

public class Student1801 {
	public static int sum = 0;
	
	private int no;
	private String name;
	private String gender;
	private int age;
	
	
	public Student1801(int no, String name, String gender, int age) {
		this.no = no;
		this.name = name;
		this.gender = gender;
		this.age = age;
		
		sum++;
		
		System.out.println("学生を作成しました");
		
	}
	
	public void show() {
		System.out.println("学生番号は" + no);
		System.out.println("氏名は" + name);
		System.out.println("性別は" + gender);
		System.out.println("年齢は" + age);
	}
	
	public static void showSum() {
		System.out.println("学生は合計" + sum);
	}
	
}
