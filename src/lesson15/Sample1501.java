package lesson15;

public class Sample1501 {

	public static void main(String[] args) {
		Phone1501 phone = new Phone1501();
		
		phone.setFee(5000);
		
		phone.setData(3.5);
		
		System.out.println("誤った通信量を設定します");

		phone.setFee(-1000);
		
		phone.setData(9999.99);
	}

}
