class Test {
	/*
	可変長引数のオーバーロード
	完全一致 > 暗黙の型変換 > Boxing > 可変長引数
	*/

	public void method(int a){
		System.out.println("method(int a)");
	}

	//暗黙の型変換
	public void method(long a){
		System.out.println("method(long a)");
	}

	//Boxing
	public void method(Integer a){
		System.out.println("method(Integer a)");
	}

	//可変長引数
	public void method(int... a){
		System.out.println("method(int... a)");
	}

	/*
	可変長引数は配列に変換されるためコンパイルエラー
	public void method(int[] a){
		System.out.println("method(int[] a)")
	}
	*/
}

public class Main {
	public static void main(String[] args) {
		Test obj = new Test();

		obj.method(100);
	}
}