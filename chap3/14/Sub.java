public class Sub {
	public static void main(String[] args) {
		//short → char
		short n1 = 100;

		//char n2 = n1; → 暗黙型変換のためコンパイルエラー
		char n2 = (char)n1;

		//short型をchar型に変換するため"d"が出力される
		System.out.println(n2);

		//char → short
		char n3 = 65;
		//short n4 = n3; → 暗黙型変換のためコンパイルエラー
		short n4 = (short)n3;
		System.out.println(n4);
	}
}