class Employee {
	/*
	private:
	同一クラス内からのみ利用可能
	*/
	private int id;

	/*
	public:
	どのクラスからでもアクセス可能
	*/
	//コンストラクタ
	public Employee(int i){
		id = i;
	}

	public int getId(){
		return id;
	}
}

public class Main {
	public static void main(String[] args) {
		//インスタンス化
		Employee emp = new Employee(100);

		/*
		"private"を他クラスからアクセスしているためコンパイルエラー
		System.out.println("private指定のインスタンス変数のアクセス : " + emp.id);
		*/

		//"public"はどのクラスからもアクセス可
		System.out.println("public指定のメソッドへアクセス　：　" + emp.getId());
	}
}