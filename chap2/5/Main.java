public class main {
	public static void main(String[] args) {
		// int型の変数"num1"を宣言し"10"を代入
		int num1 = 10;
		// 変数num1に"20"を代入
		num1 = 20;

		// final データ型 定数名 = 初期値; で定数を宣言
		final int num2 = 10;
		// 下記のように定数に代入を行うとコンパイルエラーが起こる・再代入できない！
		num2 = 20;
	}
}