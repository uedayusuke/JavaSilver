public class Main2 {
	public static void main(String[] args) {
		String s1 = "A";
		final String s2 = "B";
		final String[] s3 = {"c"};

		switch("X"){
			/*
			s1は変数のためコンパイルエラー
			case s1:
				System.out.println("case s1:の実行");
			*/

			//s2は変数だが、final修飾子つまり定数のためok
			case s2:
				System.out.println("case s2:の実行");

			/*
			s3はfinal修飾子を用い、参照先は固定しているが、格納する要素は変更可のためコンパイルエラー
			case s3:
				System.out.println("case s3:の実行");
			*/
		}
	}
}