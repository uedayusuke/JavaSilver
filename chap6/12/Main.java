/*
インタフェース：
公開すべき必要な操作をまとめたクラス、取り決め。
→ [アクセス修飾子] interface インタフェース名 {}
*/

/*
インタフェースの実装クラス；
インタフェースはインスタンス化できないため、実装クラスで抽象メソッドをオーバーライドする
オーバーライドするときは必ず"public修飾子"をつける
また複数のインタフェースをカンマ区切りで同時に指定できる
→ [修飾子] class クラス名 implements インタフェース名 {}
*/

//インタフェース
interface MyInter1 {
	//抽象メソッド
	double methodA(int num);
	//デフォルト（具象）メソッド
	default void methodB() {
		System.out.println("methodB()");
	}
}

interface MyInter2 {
	//抽象メソッド
	int methodC(int val1, int val2);
	//staticメソッド
	static void methodD() {
		System.out.println("methodD");
	}
}

//実装クラス
class MyClass implements MyInter1, MyInter2 {
	//オーバーライド
	public double methodA(int num) {
		return num * 0.3;
	}

	public int methodC(int val1, int val2) {
		return val1 + val2;
	}
}

public class Main {
	public static void main(String[] args) {
		//インスタンス化
		MyClass obj = new MyClass();

		System.out.println("methodA	:" + obj.methodA(10));

		System.out.println("methodC	:" + obj.methodC(10, 20));

		//デフォルトメソッドの呼び出し
		obj.methodB();

		//stasicメソッドはクラス名.メソッド名で呼び出せる
		MyInter2.methodD();
	}
}