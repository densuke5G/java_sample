package lesson07;

public class Sample0701 {

	public static void main(String[] args) {
		int[] height = new int[4];
		
		height[0] = 162;
		height[1] = 177;
		height[2] = 154;
		height[3] = 185;
		
		System.out.println("1人目の身長は" + height[0] + "cm");
		System.out.println("2人目の身長は" + height[1] + "cm");
		System.out.println("3人目の身長は" + height[2] + "cm");
		System.out.println("4人目の身長は" + height[3] + "cm");
		
		System.out.println(height.hashCode()); //配列変数のハッシュコード

	}

}
