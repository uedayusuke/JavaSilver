public class Main {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 10;

		/*
		関係演算子
		2つの値を比較する際に使用
		bookean値である"true"、"false"が帰ってくる
		*/
		System.out.println("a == b : " + ( a == b));
		System.out.println("a == c : " + ( a == c));
		System.out.println("a != b : " + ( a != b)); //"!="は比較する値が異なれば"true"、同じ場合は"false"
		System.out.println("a != c : " + ( a != c));
		System.out.println("a < b : " + ( a < b));
		System.out.println("a <= b : " + ( a <= b));
		System.out.println("a > b : " + ( a > b));
		System.out.println("a >= c : " + ( a >= c));
	}
}