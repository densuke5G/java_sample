package lesson19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sample1906 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String inputDataString;

		do {
			System.out.println("yyyy/MM/ddもの形式で日付を入力してください");

			inputDataString = reader.readLine();

		} while (isIllegalDate(inputDataString));

		System.out.println("入力した日付は正しい内容です");
	}

	private static boolean isIllegalDate(String inputDataString) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		sdf.setLenient(false);

		try {
			Date date = sdf.parse(inputDataString);
			System.out.println("日付は" + date);
			
			return false;
		} catch (ParseException e) {
			return true;
		}

	}

}
