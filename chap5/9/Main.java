class Test {
	/*
	インスタンスメンバ：クラス内に定義後、複数インスタンス化すると各クラスにメンバを保持
	staticメンバ：クラス内に定義後、複数インスタンス化されても"別の場所の一箇所"にまとめて保持される
	*/

	//インスタンス変数(非static変数)
	int instanceVal = 100;
	//static変数(クラス変数)
	static int staticVal = 200;

	//インスタンスメソッド(非staticメソッド)
	void methodA() {
		System.out.println("methodA():" + instanceVal);
	}

	//staticメソッド(クラスメソッド)
	static void methodB() {
		System.out.println("methodB():" + staticVal);
	}
}

public class Main {
	public static void main(String[] args) {
		//System.out.println(Test.instanceVal);
		System.out.println(Test.staticVal);
		//Test.methodA();
		Test.methodB();

		Test obj = new Test();
		System.out.println(obj.instanceVal);
		System.out.println(obj.staticVal);
		obj.methodA();
		obj.methodB();
	}
}