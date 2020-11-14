class Test {
	static {
		System.out.println("Testクラス　：　stasicイニシャライズ");
	}

	Test() {
		System.out.println("Testクラス　：　コンストラクト");
	}
}

public class Main {
	static {
		System.out.println("Mainクラス　：　staticイニシャライズ");
	}
	public static void main(String[] args) {
		System.out.println("Mainクラス　：　mainメソッド");
		Test obj = new Test();
	}
}