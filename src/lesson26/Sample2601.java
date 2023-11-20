package lesson26;

import java.util.ArrayList;
import java.util.List;

public class Sample2601 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(3);
		list.add(5);
		
		list.remove(1);
		list.set(0, 9);
//		list.clear();
		
		if (list.isEmpty()) {
			System.out.println("空です");
		}
		
//		System.out.println("数値は" + list.get(0));
//		System.out.println("数値は" + list.get(1));
//		System.out.println("数値は" + list.get(2));
		
		for (int value : list) {
			System.out.println(value);
		}
	}

}
