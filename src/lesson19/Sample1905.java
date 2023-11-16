package lesson19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sample1905 {

	public static void main(String[] args) {
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日(E)ahh:mm:ss");
		
		System.out.println("今日の日付");
		System.out.println(sdf.format(date));
	}

}
