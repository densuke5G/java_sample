package lesson15;

public class Phone1501 {
	private int fee;
	
	private double data;
	
	public void setFee(int f) {
		if (f >= 0) {
			fee = f;
			
			System.out.println("料金は" + fee);
		} else {
			System.out.println(f + "は正しくない");
			
		}
	}
	
	public void setData(double d) {
		if (d >= 0.0 && d <= 99.99) {
			data = d;
			
			System.out.println("通信料は" + data);
		} else {
			System.out.println(d + "は正しくない");
		}
	}
}
