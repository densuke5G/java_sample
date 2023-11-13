package lesson13;

public class Sample1302 {

	public static void main(String[] args) {
		Human1302 human = new Human1302();
		
		Phone1302 phone = new Phone1302();
		
		human.name = "田中太郎";
		human.phone = phone; // HumanクラスのフィールドphoneにPhoneクラスのオブジェクトを代入→理解しにくい。省略できないか？
		human.phone.fee = 5000;
		
		
		System.out.println("料金は" + human.phone.fee);
		System.out.println("持ち主は" + human.name);
	}

}
