package lesson20;

public class Phone2005 {
	private int fee;
	private double data;
	
	public Phone2005 () {
		System.out.println("携帯電話を生成しました");
		fee = 5000;
		data = 2.0;
		
	}
	
	public void show() {
		System.out.println("携帯電話の料金は" + fee);
		System.out.println("データ通信量は" + data);
	}
}
