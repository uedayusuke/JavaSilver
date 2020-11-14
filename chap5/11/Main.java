class Test {
	static String staticValue = "staticValue";
	String instanceValue = "instanceValue";
}

public class Main {
	public static void main(String[] args) {
		Test obj = null;

		System.out.println(obj.staticValue);
		//System.out.println(obj.instanceValue);
	}
}