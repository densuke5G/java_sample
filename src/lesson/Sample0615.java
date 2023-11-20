package lesson;

/** コンストラクタの練習問題 */
public class Sample0615 {

	public static void main(String[] args) {
		// Q. 下記構文でエラー無いように、同じパッケージ内にStudentクラスを作成・完成させてください
		// ・フィールドはprivateでString nameとint ageを作成、getter/setterはEclipseの自動生成で作る
		// ・引数なしコンストラクタと引数ありコンストラクタの2つを作成(練習なので自動生成しない)
		Student chida = new Student();
		chida.setName("ちだ");
		chida.setAge(18);
		System.out.println(chida.getName() + "さんは" + chida.getAge() + "才");

		Student fujishima = new Student("すだまさき",30);
		System.out.println(fujishima.getName() + "さんは" + fujishima.getAge() + "才");
	}

	// Q2.同じパッケージ内にCatクラスを作成・完成させてください
	// ・フィールドはprivateでString nameとString genderを作成、getter/setterはEclipseの自動生成で作る
	// ・引数なしコンストラクタと引数ありコンストラクタの2つを作成(練習なので自動生成しない)

//5m39s 2m14s
}