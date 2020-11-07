public class Main {
	public static void main(String[] args) {
		//文字列の比較の場合、変数の参照先ではなく、"参照している文字列"が同じかを比較
		String s1 = "tanaka";
		String s2 = "tanaka";

		/*
		Stringクラスでは"equals()メソッド"を使用
		文字列1.equals(文字列2)
		*/
		//中身の比較
		System.out.println("s1.equals(s2)	:" + (s1.equals(s2)));
		//参照先の比較のためおすすめできない。結果は"true"
		System.out.println("s1 == s2	:" + (s1 == s2));

		String s3 = "TANAKA";
		//内容が違うため"false"
		System.out.println("s1.equals(s3)	:" + (s1.equals(s3)));
	}
}