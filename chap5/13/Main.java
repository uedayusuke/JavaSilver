class Employee {
	private int id;

	public Employee(int i){
		id = i;
	}

	public int getId(){
		return id;
	}
}

public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee(100);

		/*
		System.out.println("private指定のインスタンス変数のアクセス : " + emp.id);
		*/

		System.out.println("public指定のメソッドへアクセス　：　" + emp.getId());
	}
}