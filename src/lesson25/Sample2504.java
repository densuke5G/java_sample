package lesson25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2504 {

	public static void main(String[] args) {
		start();
		
	}
	
	public static void start() {
		try {
			inputName();
		}catch (ArrayIndexOutOfBoundsException | IOException e) {
			e.printStackTrace();
			System.out.println("例外が発生");
		}
	}
	
	public static void inputName() throws ArrayIndexOutOfBoundsException, IOException {
		String[] name = new String[2];
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("一人目の名前を入力してください");
		name[0] = reader.readLine();
		System.out.println("二人目の名前を入力してください");
		name[1] = reader.readLine();
		
		System.out.println("一人目の名前は" + name[0]);
		System.out.println("二人目の名前は" + name[1]);
		System.out.println("三人目の名前は" + name[2]);
	}

}
