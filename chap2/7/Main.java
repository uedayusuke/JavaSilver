public class Main {
	public static void main(String[] Args) {
		int x = 100;
		x = 200;
	}

	public static void method() {
		/*
		変数には有効範囲(スコープ)があり、ブロック内で宣言されたものを
		下記のようにブロック外で使用すると"コンパイルエラー"が起こる
		x = 300;
		*/
	}
}