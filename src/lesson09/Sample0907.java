package lesson09;

public class Sample0907 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i * j < 10) {
					System.out.print(" ");
				}
				System.out.print(i * j);
				System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}
