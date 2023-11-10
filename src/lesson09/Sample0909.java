package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0909 {

	public static void main(String[] args)throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int i = 0;
		int buyflag = 0;
		
		System.out.println("購入します");
		
		do {
			i++;
			System.out.print("購入個数:" + i + "\nさらに1つ増やしますか？");
			System.out.print("はい：0、いいえ：1＜");
			
			String choice = reader.readLine();
			buyflag = Integer.parseInt(choice);				
		} while (buyflag == 0);
		System.out.println("購入した個数は" + i + "個");
		System.out.println("購入を終了します");

	}

}
