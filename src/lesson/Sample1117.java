package lesson;

public class Sample1117 {

	public static void main(String[] args) {
		// Q1. MyMathクラス使うための準備として、クラス変数を宣言しnewで初期化
		MyMath math = new MyMath();
		
		// Q2. 戻り値の【ない】simpleHelloメソッドを、【引数なしで呼ぶ】
		math.simpleHello();
		
		// Q3. 戻り値の【ない】sayHelloメソッドを、【String型引数渡して呼ぶ】
		math.sayHello("ちだ");
		
		// Q4. 戻り値の【ある】getHelloMessageメソッドを、
		//    【String型引数渡して呼び、String型戻り値を受取る】
		String str = math.getHelloMessage("ちだ");
		
		// Q5. 戻り値の【ある】maxメソッドを、
		//    【2つのint型引数渡して呼び、int型戻り値を受取る】
		int num = math.max(1, 8);
		
	}
//	3分40秒, 1m50s
}