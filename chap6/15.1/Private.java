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
		A obj = new B();
		obj.foo();
	}
}