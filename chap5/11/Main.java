class Test {
	static String staticValue = "staticValue";
	String instanceValue = "instanceValue";
}

public class Main {
	public static void main(String[] args) {
		//インスタンス化ではない
		Test obj = null;

		//staticはインスタンス化を必要とせず、クラスが読み込まれれば実行可能
		System.out.println(obj.staticValue);
		//System.out.println(obj.instanceValue);
	}
}