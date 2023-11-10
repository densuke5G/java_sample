package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0904 {

	public static void main(String[] args)throws IOException {
		System.out.println("いくつ＊を出力しますか？");
		BufferedReader reader = new BufferedReader(new  InputStreamReader(System.in));
		
		String str = reader.readLine();
		int num = Integer.parseInt(str);
		
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
//			System.out.print("*");
			
			sum += i;	//1からループ回数を繰り返し足す
		}
		System.out.println("1から" + num + "までの合計は" + sum);
	}

}
