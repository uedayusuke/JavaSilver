class Test {
	/*
	throws：
	メソッドないでthrows指定された例外が発生した場合に、メソッドの呼び出し元に転送される
	→ [修飾子] 戻り値の型 メソッド名 (引数リスト) throws 例外クラス名 {}
	*/
	void loop() throws ArrayIndexOutOfBoundsException {
		int[] num = {10, 20, 30};
		for (int i = 0; i < 4; i++) {
			System.out.println("num :" + num[i]);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		try {
			Test t = new Test();
			t.loop();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("例外が発生しました");
		}

		System.out.println("---- end ----");
	}
}