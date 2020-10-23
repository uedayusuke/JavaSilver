/*
 一つのソースファイルに複数のクラスを持つこと可能であり
 コンパイルをすると二つのクラスファイルが生成されるが
 実行できるのはmainメソッド(Mainクラス)のみ
*/
/*
 public指定のクラスは一つのファイルに一つまでしか持てない
 またソースファイル名はpublic指定のクラスと同じに命名
*/
class Bar {}

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello!");
	}
}