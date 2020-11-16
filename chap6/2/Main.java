//スーパークラス
class SuperA {
	public void print(String s) {
		System.out.println("SuperA print	:" + s);
	}

	public void method() {}
}

//サブクラス
class SubB extends SuperA {
	/*
	オーバーライドのルール
	　アクセス修飾子:スーパークラスと同じかそれ以上の範囲
	　戻り値:スーパークラスと同じかそのサブクラス
	　メソッド名・引数:スーパークラスと全く同じ
	*/
	public void print(String s) {
		s = "渡された文字列は　" + s + "です。";
		System.out.println("SubA print	:" + s);
	}

	/*
	アクセス修飾子がスーパークラスより狭い為コンパイルエラー
	void method(){}
	*/
}

public class Main {
	public static void main(String[] args) {
		SuperA obj1 = new SuperA();
		obj1.print("java");

		SubB obj2 = new SubB();
		obj2.print("java");

	}
}