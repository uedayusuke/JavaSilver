class SuperA {
	public void print(String s) {
		System.out.println("SuperA print	:" + s);
	}

	public void method() {}
}

class SubB extends SuperA {
	public void print(String s) {
		s = "渡された文字列は　" + s + "です。";
		System.out.println("SubA print	:" + s);
	}

	//void method(){}
}

public class Main {
	public static void main(String[] args) {
		SuperA obj1 = new SuperA();
		obj1.print("java");

		SubB obj2 = new SubB();
		obj2.print("java");

	}
}