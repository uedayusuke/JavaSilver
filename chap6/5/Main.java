class Foo {
	/*
	this：自分自身（自オブジェクト）を表現
	     自オブジェクトが保持する変数・メソッド・コンストラクタを明示的に指定
	     this.変数名で自オブジェクトが持つ変数、つまりインスタンス変数を示す
	*/

	/*
	thisでコンストラクタ
	"this()"と記述する事で、コンストラクタの中から、自クラスで定義した、別のコンストラクタを呼び出すことができる
	→ this()はコンストラクタ定義の"先頭"に記述!　
	*/
	String str;
	int num;

	//必ず行う処理を引数を持たないコンストラクタに記述
	public Foo() {
		this(100);
	}

	public Foo(String str) {
		this(str, 1);
	}

	public Foo(int num) {
		this("xxx", num);
	}

	public Foo(String str, int num) {
		this.str = str;
		this.num = num;
		System.out.println("String	:" + this.str);
		System.out.println("int	:" + this.num);
	}
}

public class Main {
	public static void main(String[] args) {
		//それぞれのコンストラクタを呼び出す
		Foo f1 = new Foo();
		Foo f2 = new Foo("Hallo");
		Foo f3 = new Foo("Bye", 200);
		Foo f4 = new Foo(26);
	}
}