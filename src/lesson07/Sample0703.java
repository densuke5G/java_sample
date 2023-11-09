package lesson07;

public class Sample0703 {

	public static void main(String[] args) {
		int[] height1 = {162, 177, 154, 185};
		
		int[] height2;
			
		height2 = height1;
		
		height1[0] = 180;
		
		System.out.println("1人目の身長は" + height1[0]);
		System.out.println("2人目の身長は" + height1[1]);
		System.out.println("3人目の身長は" + height1[2]);
		System.out.println("4人目の身長は" + height1[3]);
		System.out.println(height1.hashCode());
		System.out.println("");

		System.out.println("1人目の身長は" + height2[0]);
		System.out.println("2人目の身長は" + height2[1]);
		System.out.println("3人目の身長は" + height2[2]);
		System.out.println("4人目の身長は" + height2[3]);
		System.out.println(height2.hashCode());


	}

}
