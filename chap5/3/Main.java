class Test {
	void myprint(){
		System.out.println("myprint()");
	}

	void myprint(String s){
		System.out.println("myprint(Stirng s)");
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
		t.myprint(1);
		t.myprint(1, 2);
	}
}