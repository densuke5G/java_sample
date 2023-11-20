package lesson23;

import java.util.ArrayList;
import java.util.List;

public class Sample2301 {
	public static void main(String[] args) {
		// スーパークラスの配列を作成(要素数3)
		List<Worker2301> workers = new ArrayList<>();

		//		Worker2301[] workers = new Worker2301[3];
		// スーパークラスの配列に、継承したサブクラスを生成して格納
		//		workers[0] = new Police2301("田中", 28);
		//		workers[1] = new Teacher2301("佐藤", 53);
		//		workers[2] = new Chef2301("鈴木", 31);
		Worker2301 tanaka = new Police2301("田中", 28);
		workers.add(tanaka);
		//		workers.add(new Police2301("田中", 28));
		workers.add(new Teacher2301("佐藤", 53));
		workers.add(new Chef2301("鈴木", 31));

		//テキストのコード理解しにくいので、コメント化
		// Display2301.displayWorkers(workers);
		// 上記呼び出し先で実行している、拡張for文を転記
		for (Worker2301 worker : workers) {
			worker.showIntroduction();
			worker.doWork();
		}
	}
}
