package lesson;

public class Sample1110 {

	public static void main(String[] args) {
		int age = 18; // 年齢
		int gender = 1;// 1:男性、2:女性
		// Q01. ageが18以上であれば成年と表示するif文
		if (age >= 18) {
			System.out.println("成年");
		}
		// Q02. ageが18以上であれば成年と表示し、それ以外であれば未成年とするif-else文
		if (age >= 18) {
			System.out.println("成年");
		} else {
			System.out.println("未成年");

		}

		// Q03. ageが20以上であれば飲酒可と表示し、18以上であれば成年と表示し、
		// それ以外であれば未成年とするif-else if文
		if (age >= 20) {
			System.out.println("飲酒可");
		} else if (age >= 18) {
			System.out.println("成年");

		} else {
			System.out.println("未成年");

		}

		// Q04. ageが16または18であれば「16または18」と表示し、
		// それ以外であれば「それ以外」と表示するif-else文
		if (age == 16 || age == 18) {
			System.out.println("16または18");
		} else {
			System.out.println("それ以外");

		}

		// Q05. ageが18かつgenderが1であれば「18才男性」と表示し、
		// それ以外であれば「それ以外」と表示するif-else文
		if (age == 18 && gender == 1) {
			System.out.println("18歳男性");
		} else {
			System.out.println("それ以外");

		}

		// Q06. ageが16、18、20、それ以外の時、
		// それぞれ「二輪免許可」「成年」「飲酒可」「それ以外」表示するswitch文
		switch (age) {
		case 16: {
			System.out.println("二輪免許可");
			break;
		}
		case 18: {
			System.out.println("成年");
			break;
		}
		case 20: {
			System.out.println("飲酒可");
			break;
		}
		default:
			System.out.println("それ以外");
		}
		//			9分28秒 7分50秒　7分14秒
		
		
	}
}
