package lesson07;

public class Sample0705 {

	public static void main(String[] args) {
		int[][] score = {{98, 66,79},{78, 34, 65}};
		
		System.out.println("試験を受けた人数は" + score.length);
		System.out.println("1人目が受けた試験数は" + score[0].length);
		System.out.println("2人目が受けた試験数は" + score[1].length);
		System.out.println("");
		
		System.out.println(score.hashCode());
		System.out.println(score[0].hashCode());
		System.out.println(score[1].hashCode());
		System.out.println("");

		System.out.println("1人目が受けた試験" + score[0][0] + "点");
		System.out.println("1人目が受けた試験" + score[0][1] + "点");
		System.out.println("1人目が受けた試験" + score[0][2] + "点");
		System.out.println("");

		System.out.println("2人目が受けた試験" + score[1][0] + "点");
		System.out.println("2人目が受けた試験" + score[1][1] + "点");
		System.out.println("2人目が受けた試験" + score[1][2] + "点");

	}

}
