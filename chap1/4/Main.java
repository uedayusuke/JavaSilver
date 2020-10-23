 /*
 コンパイルをせずに"java Main.java"を行う場合
 最初に書かれているmainメソッドを呼び出すため
 下記のSampleクラスを先に書くと実行時エラーが出る
 */

class Main {
	public static void main(String[] args) {
		System.out.println("Hello!");
	}
}

class Sample {}