class SuperA {
	void methodA() {
		System.out.println("SuperA:methodA()");
	}

	static void methodB() {
		System.out.println("SuperA:methodB()");
	}
}

class SubA extends SuperA {
	void methodA() {
		System.out.println("SubA:methodA()");
	}

	/*
	static void methodA() {
		System.out.println("SubA:methodA()");
	}
	*/

	static void methodB() {
		System.out.println("SubA:methodB()");
	}

	/*
	void methodB() {
		System.out.println("SubA:methodB()");
	}
	*/
}

public class Main {
	public static void main(String[] args) {
		SubA obj = new SubA();

		obj.methodA();
		obj.methodB();
	}
}