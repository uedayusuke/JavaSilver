class Test {
	/*
	オーバーロード
	一つのクラスに同じ名前のメソッドやコンストラクタを複数定義すること
	→それぞれを区別するために、引数の並び、データ型、数が異なっていることが条件
	*/

	void myprint(){
		System.out.println("myprint()");
	}

	String name;
	void myprint(String s){
		name = s;
	}

	String output(){
		return name;
	}


	void myprint(int a){
		System.out.println("myprint(int a)");
	}

	void myprint(int a, int b){
		System.out.println("myprint(int a, int b)");
	}
}

public class Main {
	public static void main(String[] args) {
		Test t = new Test();

		t.myprint();
		t.myprint("Ueda");
		System.out.println(t.output());
		t.myprint(1);
		t.myprint(1, 2);
	}
}