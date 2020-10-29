public class Main {
	public static void main(String[] args) {
		/*
		コマンドライン引数
		javaコマンド実行時に引数をプログラムへ渡すことができる
		→String型の配列として渡される為、演算などには使えない
		*/
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[1] + args[2]);
	}
}