package lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 繰り返しの演習問題 */
public class Sample1110_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int num = 1;
		String[] names = { "ちだ", "すだ", "おかだ" };
		// Q01. 0から9まで表示する10回繰り返すfor文 P.199
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		// Q02. 1から10まで表示する10回繰り返すfor文 P.204
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// Q03. 4から0まで逆順で表示する5回繰り返すfor文 P.206
		for (int i = 4; i >= 0; i--) {
			System.out.println(i);
		}
		// Q04. 配列変数namesの要素を全て表示する for文 P.207
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		// Q05. 配列変数namesの要素を全て表示する 拡張for文 P.207
		for (String name : names) {
			System.out.println(name);
		}
		// Q06. BufferedReaderを使い【numの値が0】となったら終わるwhile文 P.213
		while (num != 0) {
			System.out.print("numの値を入力:");
			str = reader.readLine();
			num = Integer.parseInt(str);

		}

		// Q07. BufferedReaderを使い【numの値が0】となったら終わるdo-while文 P.217
		do {
			System.out.print("numの値を入力:");
			str = reader.readLine();
			num = Integer.parseInt(str);

		} while(num != 0);
		
//		4分32秒
	}
}
