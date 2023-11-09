package lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0801 {

	public static void main(String[] args) throws IOException {
		System.out.println("整数を入力してください");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		int res = Integer.parseInt(str);
		
		if (res == 5) {
			System.out.println("5が入力された");
			System.out.println("式の評価値はTrue");
		}
		System.out.println("終了します");

	}

}
