class Test {
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