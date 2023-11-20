package lesson25;

public class Sample2501 {

	public static void main(String[] args) {
		try {
			calc();
		} catch (ArithmeticException e) {
			System.out.println("計算中に例外が発生しました");
		} finally {
			System.out.println("終了しました");
		}
		
	}
	
	public static void calc() {
		int a = 3 / 0;
		
		System.out.println("答えは" + a);
	}

}
