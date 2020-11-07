public class Main {
	public static void main(String[] args) {
		/*
		演算子を用いて文字列を結合
		s1を書き換えているわけではなく、s2として新たに文字列を作成
		*/
		String s1 = "X";
		String s2 = s1 + "Y";
		System.out.println("s1	:" + s1);
		System.out.println("s2	:" + s2);
		System.out.println("s1 == s2	:" + (s1 == s2));

		/*
		concatメソッドを用いて文字列を結合
		元になる文字列.concat(結合したい文字列);
		s3を書き換えているだけではなく、s4として新たに文字列を作成
		*/
		String s3 = "X";
		String s4 = s3.concat("Y");
		System.out.println("s3	:" + s3);
		System.out.println("s4	:" + s4);
		System.out.println("s3 == s4	:" + (s3 == s4));

		/*
		appendメソッドを用いて文字列を結合。!!上記二つと違い書き換えを行うため、新しいインスタンスは生まれない!!
		対象の文字列.append(追加したい文字列);
		s5にs6を追加し、書き換えているため、s5 == s6の関係が成り立つ
		*/
		StringBuilder s5 = new StringBuilder("X");
		StringBuilder s6 = s5.append("Y");
		System.out.println("s5	:" + s5);
		System.out.println("s6	:" + s6);
		System.out.println("s5 == s6	:" + (s5 == s6));
	}
}