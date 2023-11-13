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
		
		// Q02. 1から10まで表示する10回繰り返すfor文 P.204
		
		// Q03. 4から0まで逆順で表示する5回繰り返すfor文 P.206
		
		// Q04. 配列変数namesの要素を全て表示する for文 P.207
		
		// Q05. 配列変数namesの要素を全て表示する 拡張for文 P.207
		
		// Q06. BufferedReaderを使い【numの値が0】となったら終わるwhile文 P.213
		
			System.out.print("numの値を入力:");
			str = reader.readLine();
			num = Integer.parseInt(str);
			

		// Q07. BufferedReaderを使い【numの値が0】となったら終わるdo-while文 P.217
		
			System.out.print("numの値を入力:");
			str = reader.readLine();
			num = Integer.parseInt(str);
		
		
			
//		4分32秒  4分56秒
	}
}
