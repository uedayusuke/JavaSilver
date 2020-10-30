public class Main {
	public static void main(String[] args) {
		String s = "abcdefa";
		/*
		String型の変数名.メソッド名();
		*/
		System.out.println("charAt(2)	:" + s.charAt(2)); //引数番目の文字を返す
		System.out.println("indexOf('c')	:" + s.indexOf('c')); //引数の文字が最初に出てくる位置を返す
		System.out.println("length()	:" + s.length()); //文字数
		System.out.println("replace('a','z')	;" + s.replace('a','z')); //第一引数と第二引数の文字を入れ替える
		System.out.println("substring(2)	:" + s.substring(2)); //引数番目の文字から最後までを返す
	}
}