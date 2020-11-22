abstract class Super {
	int x;
	int y;

	public abstract void print();
	public void method(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class MyClass extends Super {
	public void print() {
		System.out.println("x:	" + x + " y:	" + y);
	}
}

public class Main {
	public static void main(String[] args) {
		Super obj = new MyClass();
		obj.method(10, 20);
		obj.print();
	}
}