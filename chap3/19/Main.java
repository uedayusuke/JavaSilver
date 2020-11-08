public class Main {
	public static void main(String[] args) {
		int num = 20;
		String str = "numの値は";

		/*
		条件演算子
		条件式 ? 式1 : 式2

		条件式が"true"の時 → 式1を実行
		条件式が"false"の時 → 式2を実行
		*/

		//"+="を用いて文字列を結合
		str += num < 10 ? "10未満" : "10以上";
		System.out.println(str);
	}
}