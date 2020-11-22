//スーパー・抽象クラス
abstract class Super {
	int x;
	int y;

	public abstract void print();
	public void method(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

//サブ・具象クラス
class MyClass extends Super {
	//抽象メソッドを実像
	public void print() {
		System.out.println("x:	" + x + " y:	" + y);
	}
}

public class Main {
	public static void main(String[] args) {
		/*
		サブクラスをインスタンス化して、スーパークラスの型で宣言
		→ スーパークラスの方で宣言された変数には、サブクラスのオブジェクトを代入可能
		*/
		Super obj = new MyClass();
		//スーパークラスのメソッドを呼び出し
		obj.method(10, 20);
		//サブクラスのメソッドを呼び出し
		obj.print();
	}
}