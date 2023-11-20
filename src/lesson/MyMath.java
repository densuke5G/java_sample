package lesson;

public class MyMath {
	/** 呼ぶと"おはよう"表示 */
	public void simpleHello() {
		System.out.println("おはよう");
		return;
	}

	/** 呼ぶと引数使って"おはよう"表示
	 * @param name 挨拶相手
	 */
	public void sayHello(String name) {
		System.out.println(name + "さん、おはよう");
		return;
	}

	/** 呼ぶと引数使って"おはよう"の文字列を返却
	 * @param name 挨拶相手
	 * @return "おはよう"の文字列
	 */
	public String getHelloMessage(String name) {
		return name + "さん、おはよう";
	}

	/**
	 * 値aとbを比較して最大値を返却
	 * @param a 値a
	 * @param b 値b
	 * @return 最大値
	 */
	public int max(int a, int b) {
		int result = a; // aを暫定最大値とする
		if (b > a) {
			result = b; // bが大きいので最大値はbで確定
		}
		return result;
	}
}
