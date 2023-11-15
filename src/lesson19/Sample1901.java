package lesson19;

public class Sample1901 {

	public static void main(String[] args) {
		String mailAddress = "hanako@mail,co,jp";
		
		String userName = mailAddress.substring(0, mailAddress.indexOf("@"));
		
		System.out.println("メールアドレス" + mailAddress);
		System.out.println("ユーザー名" + userName);

		System.out.println("文字の長さ" + userName.length());
	}

}
