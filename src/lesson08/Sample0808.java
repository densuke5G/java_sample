package lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0808 {

	public static void main(String[] args) throws IOException {
		System.out.println("整数を入力してください");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str = reader.readLine();
		int num = Integer.parseInt(str);

		if (4 < num && num <= 10) {
			System.out.println(num + "は4より大きく10以下");
		} else if (num <= 4) {
			System.out.println(num + "は4以下");
		} else {
			System.out.println(num + "は10より大きい");
		}

	}

}
