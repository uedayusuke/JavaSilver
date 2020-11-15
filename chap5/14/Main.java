class Test {
	//引数として基本データ型を受け取る
	void method1(int num) {
		num += 10;
		System.out.println("定義側　：" + num);
	}

	//引数として参照型を受け取る
	void method2(int[] array) {
		array[0] += 10;
		System.out.println("定義側　：" + array[0]);
	}
}

public class Main {
	public static void main(String[] args) {
		int num = 10;
		int[] array = {10};

		//基本データ型は値のコピーのため上書きされない
		Test obj = new Test();
		obj.method1(num);
		System.out.println("呼び出し側　：" + num);

		System.out.println("呼び出す前　：" + array[0]);

		//参照型は場所の指定の為、同じデータを参照する為、呼び出し後はデータが上書きされる
		obj.method2(array);
		System.out.println("呼び出し側　：" + array[0]);
	}
}