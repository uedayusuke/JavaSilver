/*
継承:
既存のクラスをもとに新たなクラスを定義すること
サブクラスをインスタンス化するとスーパークラスで定義したメソッドを引き継ぐことができる
また、"private"修飾子のメンバは引き継げない

[修飾子] class サブクラス名 extends スーパークラス名 {}
*/

/*
スーパークラス:
継承の元となるクラス
*/

/*
サブクラス:
スーパークラスを元に新たに定義されるクラス
*/

//スーパークラス
class Employee {
	private String id = "100";
	public String getId() {
		return id;
	}
}

//サブクラス
class Sales extends Employee {
	private String clientName = "Ueda";
	public String getClientName() {
		return clientName;
	}
}

public class Main {
	public static void main(String[] args) {
		//サブクラスをインスタンス化
		Sales s = new Sales();

		//サブクラスのメソッドを呼び出し
		System.out.println("clientName	：" + s.getClientName());

		//スーパークラスのメソッドを呼び出し
		System.out.println("id	：" + s.getId());
	}
}