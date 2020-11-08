public class Main {
	public static void main(String[] args) {
		/*
		ラッパークラスをしようする事で、基本データ型の値を参照型として扱うことができる
		変換は自動的に行われる
		基本データ型 → 参照型 :Boxing
		参照型 → 基本データ型 :Unboxing
		*/

		int i1 = 100;
		Integer obj = i1; //Boxing
		int i2 = obj; //Unboxing
		method(i2); //int型で引数を渡す
	}

	//Integer型で受け取る
	static void method(Integer obj) {
		int i = obj + 100;
		System.out.println(i);
	}
}