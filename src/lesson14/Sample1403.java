package lesson14;

public class Sample1403 {

	public static void main(String[] args) {
		Phone1403 phone = new Phone1403();
		
		phone.searchName("田中", 20);
		phone.searchName("鈴木", 51);
		phone.searchName("佐藤", 29);
		
		phone.call(1234567890);
		phone.call(1122223333);
	}

}
