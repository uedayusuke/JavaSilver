class Employee {
	int id;

	/*
	メソッド:クラスが持つべき操作・振る舞い

	[修飾子] 戻り値の型 メソッド名 (引数リスト){}
	→呼び出し元に戻り値を返す必要がない場合は"void"
	 呼び出し元から引数を受け取らない場合は"引数リスト"は空白でも良い
	*/

	void setId(int i){
		id = i;
	}

	/*
	return文
	呼び出し元に戻り値を返す場合"return"を記述

	return 戻す値;
	*/

	int getId(){
		return id;
	}
}

public class Main {
	public static void main(String[] args) {

		/*
		インスタンス化:クラスを元にオブジェクトを生成すること
		クラス名 インスタンス名(変数名) = new クラス名();
		*/
		Employee a = new Employee();

		/*
		インスタンス名.メソッド名
		aは"Id = 100"を保持
		*/
		a.setId(100);

		Employee b = new Employee();

		b.setId(200);

		System.out.println("Aさん	:" + a.getId());
		System.out.println("Bさん	:" + b.getId());
	}
}