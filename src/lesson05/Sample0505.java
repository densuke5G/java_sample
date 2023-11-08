package lesson05;

import java. io.BufferedReader;
import java. io.IOException;
import java. io.InputStreamReader; 

public class Sample0505 {

	public static void main(String[] args) throws IOException {
		System.out.println("電話番号と誕生月を入力してください。");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String phonenumber = reader.readLine();
		String birthmonth = reader.readLine();
		
		System.out.println("電話番号は" + phonenumber  + "です。");
		System.out.println("誕生月は" + birthmonth  + "月です。");
	
		
	}

}
