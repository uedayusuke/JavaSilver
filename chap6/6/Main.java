/*
super:
自オブジェクトから見てスーパークラスのオブジェクトを表現する
thisと同様に、変数・メソッド・コンストラクタを明示的に指定
*/

/*
superでメソッドの呼び出し
"super.メソッド名"と記述する事でメソッドをオーバーライドしている場合でも
明示的にスーパークラスのメソッドを呼び出すことができる
*/
class SuperA {
	int num;

	public void methodA() {
		num += 100;
	}

	public void print() {
		System.out.println("num値	:" + num);
	}
}

class SubA extends SuperA {
	public void methodA() {
		num += 500;
	}

	public void methodB() {
		methodA(); //サブクラスのmethodA()
		print(); //スーパークラスのprint()
		super.methodA(); //スーパークラスのmethodA()
		print(); //スーパークラスのprint()
	}
}

public class Main {
	public static void main(String[] args) {
		//サブクラスをインスタンス化
		SubA obj = new SubA();
		obj.methodB();

	}
}