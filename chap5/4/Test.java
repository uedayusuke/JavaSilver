class Test {
	String myprint(int a, String b) {
		return "test";
	}

	String myprint(int a, int b) {
		return "test";
	}

	String myprint(String a, int b) {
		return "test";
	}

	/*
	戻り値の方は異なるが、引数の型・並びが同じのためコンパイルエラー
	void myprint(int a, Stirng b) {
		return "test";
	}
	*/

	/*
	引数の変数名は異なるが、型・並びが同じのためコンパイルエラー
	String myprint(int x, Stirng y) {
		return "test";
	}
	*/
}