package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0908v {

	public static void main(String[] args)throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;//ループ回数のカウント
		
		System.out.println("購入しますか？");
		System.out.print("はい：0、いいえ：1＞");
		
		String choice = reader.readLine();
		int buyflag = Integer.parseInt(choice);
		
		while (buyflag == 0) {
			i++;
			System.out.println("購入個数:"+ i + " 1つ増やしますか？");
			System.out.print("はい：0、いいえ：1＞");
			choice = reader.readLine();
			buyflag = Integer.parseInt(choice);
		}
		System.out.println("購入した個数は" + i + "個です。");		
	}

}
