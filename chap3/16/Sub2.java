public class Sub2 {
	public static void main(String[] aegs) {
		boolean b1 = true;
		boolean b2 = false;

		if (b2 = b1) {
			System.out.println("b1	:" + b1);
			System.out.println("b2	:" + b2);
		}

		/*
		条件の箇所で代入演算子を用いているが
		結果がboolean値で返るため、if文として問題なし！
		*/
	}
}