class Test {

	/*
	可変長引数
	引数の数を可変に扱う→引数も数を定義時に限定せず、引数リストに流動的に宣言することができる
	値は"配列"としてメソッドに渡される

	ルール
	データ型の後に"..."を記述(int... a)
	可変長引数は最後に置く
	可変長引数は1つしか使用できない
	引数リストを明確に定義したメソッドと可変長引数を使用したメソッドだと、明確に定義したメソッドが優先して呼び出される
	*/

	//methodメソッドを生成
	public void method(String s, int... a) {
		System.out.println(s + "サイズ	: " + a.length);
		//拡張for文:配列の中身を最後まで順番に取り出す
		for(int i : a) {
			System.out.println("　第２引数の値	:" + i);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		//Testクラスをインスタンス化
		Test obj = new Test();
		//配列arrayを宣言
		int[] array = {10, 20, 30};

		obj.method("1回目");
		obj.method("2回目", 10);
		obj.method("3回目", 10, 20);
		obj.method("4回目", array);
	}
}