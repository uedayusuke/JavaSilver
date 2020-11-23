public class Main {
	public static void main(String[] args) {
		//int型の配列に初期値を代入
		int[] num = {10, 20, 30};

		//配列の中身を出力　→ 要素外にアクセスする為例外(エラー)が発生　→ 強制終了　
		for (int i = 0; i < 4; i++ ) {
			System.out.println("num :" + num[i]);
			System.out.println(" : " + (i + 1) + "回目のループ");
		}

		//for文で例外が発生し強制終了する為、下記は出力されない
		System.out.println("----- end ----");
	}
}