/*
staticイニシャライザ
クラスファイルがロードされたタイミングで実行されるプログラム
→インスタンス化する前やmain()メソッドを呼び出す前に実行したい処理をかく
*/

class Test {
	static {
		//3
		System.out.println("Testクラス　：　stasicイニシャライズ");
	}

	Test() {
		//4
		System.out.println("Testクラス　：　コンストラクト");
	}
}

public class Main {
	static {
		//1
		System.out.println("Mainクラス　：　staticイニシャライズ");
	}
	public static void main(String[] args) {
		//2
		System.out.println("Mainクラス　：　mainメソッド");

		//Testクラスをインスタンス化することでTestクラスのstasicイニシャライズが実行される
		Test obj = new Test();
	}
}