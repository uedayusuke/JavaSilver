public class Main {
	public static void main(String[] args) {
		int a = 10, b = 10, c = 10, d = 10;

		//論理演算子
		boolean result1 = a++ > 10 & ++b > 10;
		System.out.println("result1:" + result1 + " a:" + a + " b:" + b);
		/*
		"&"のため両方評価され、両方"true"の時だけ"true"
		a++ > 10 → まずaと10を比較し"false"
		++b > 10 → まずbをインクリメント、その後比較し"true"
		→ 結果"false"
		*/

		boolean result2 = c++ > 10 && ++d > 10;
		System.out.println("result2:" + result2 + " c:" + c + " d:" + d);
		/*
		"&&"のため左が"false"の場合、右は評価されない
		c++ > 10 → ますcと10を比較し"false" → 終了 dは評価されずインクリメントも無し！！
		*/
 	}
}