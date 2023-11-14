package lesson17;

public class Dog1703 {
	private String gender;
	private String breed;
	
	public Dog1703() {
		gender = "オス";
		
		System.out.println("引数なしのコンストラクタ");
	}
	
	public Dog1703(String breed) {
		this();
		this.breed = breed;
		
		System.out.println("引数ありのコンストラクタ");
	}
	
	public void show() {
		System.out.println("性別は" + gender);
		System.out.println("犬種は" + breed);
	}
}
