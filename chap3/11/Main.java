public class Main {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";
		/*
		"internメソッド"
		同一の文字列がある場合　→　それを参照する。使い回す
		同一の文字列がない場合　→　String型の持つ領域内に文字列を作成
		*/
		Stirng s4 = s2.intern();

		System.out.println("s1 == s2	:" + (s1 == s2));
		System.out.println("s1 == s3	:" + (s1 == s3));
		System.out.println("s1 == s4	:" + (s1 == s4));
		System.out.println("s2 == s4	:" + (s2 == s4));
	}
}