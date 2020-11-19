class SuperA {
	int num;

	public void methodA() {
		num += 100;
	}

	public void print() {
		System.out.println("num値	:" + num);
	}
}

class SubA extends SuperA {
	public void methodA() {
		num += 500;
	}

	public void methodB() {
		methodA();
		print();
		super.methodA();
		print();
	}
}

public class Main {
	public static void main(String[] args) {
		SubA obj = new SubA();
		obj.methodB();

	}
}