class A {
	private void foo() {
		System.out.println("A");
	}
}

class B extends A {
	//シーパークラスのfooメソッドはprivateのため、下記はオーバーライドではなく、サブクラスで定義したメソッドとして認識される
	void foo() {
		System.out.println("B");
	}
}

public class Private {
	public static void main(String[] args) {
		//サブクラスをインスタンス化して、スーパークラスの型に代入
		A obj = new B();
		//コンパイル時、objの型を確認、A型、Aクラスのfoo()メソッドをチェックという検証を行い、privateのためコンパイルエラー
		obj.foo();
	}
}