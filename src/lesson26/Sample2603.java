package lesson26;

import java.util.HashMap;
import java.util.Map;

public class Sample2603 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("犬", "dog");
		map.put("猫", "cat");
		map.put("猿", "monkey");
		
		System.out.println("キー「猿」は" + map.get("猿"));
		
		System.out.println(map);
	}

}
