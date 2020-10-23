public class Main {
	public static void main(String[] args) {
		// int型で変数resultを宣言し"0"を代入
		int result = 0;

		// long型で変数startを宣言し"System.currentTimeMillis();"を代入
		// System.currentTimeMillis();　→　処理を開始/終了した時間
		long start = System.currentTimeMillis();

		// for文で繰り返し処理
		for(int i = 0; i < 100000000; i++) {
			result += i;
		}
		long end = System.currentTimeMillis();

		// 終了時間から開始時間を引き処理にかかった時間を出力
		System.out.println((end - start) + " ms");
	}
}