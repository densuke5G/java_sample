package lesson14;

public class Phone1402 {
	int fee;
	
	double data;
	
	public void show() {
		message();
		
		System.out.println("料金は" + fee);
		System.out.println("通信量は" + data);

	}
	
	public void message() {
		System.out.println("これから携帯電話の情報を表示します。");
	}
}