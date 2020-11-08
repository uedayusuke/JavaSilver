public class Main {
	public static void main(String[] args) {
		/*
		暗黙型変換
		byte → short → int → long → float → double

		キャストによる型変換
		double → float → long → int → short → byte
		(目的の型)値
		*/

		double d = 10.5;
		//int i = d; → 暗黙型変換のためコンパイルエラー
		//キャスト演算子を利用して変換
		int i = (int)d;

		//doublr型をint型に当てはめるため、小数点以下は切り捨てられる
		System.out.println("iの値:" + i);

		//foo(i); → 暗黙型変換のためコンパイルエラー
		//キャスト演算子を用いてint型をshort型に変換
		foo((short)i);
	}

	//fooメソッド
	static void foo(short a) {
		System.out.println("aの値:" + a);
	}
}