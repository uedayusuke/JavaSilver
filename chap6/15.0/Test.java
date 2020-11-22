class Super {
	void methodA() {}
}

class Sub extends Super {
	void methodA() {}
	void methodB() {}
}

class Test {
	public static void main(String[] args) {
		//サブクラスをインスタンス化し、スーパークラスの型で宣言
		Super obj = new Sub();
		obj.methodA();
		/*
		Superクラスに"methodB()"はないためコンパイルエラー
		obj.methodB();
		→ キャストする必要がある
		*/

		/*
		キャストの構文
		class Super {}
		class Sub extends Super {}
		class Main {
			public class static void main(String[] args) {
				//サブクラスをインスタンス化し、スーパークラスの型で宣言
				Super s1 = new Sub();
				//キャスト
				Sub s2 = (Sub)s1;
			}
		}
		*/
		//キャスト
		Sub obj2 = (Sub)obj;
		obj2.methodB();
	}
}